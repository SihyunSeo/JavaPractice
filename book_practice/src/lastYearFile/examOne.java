// 인공지능소프트웨어 전공
// 16422034 박지용
// 자바 기말고사 프로그램

package lastYearFile;

import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.FileOutputStream;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.JTextField;

public class examOne extends JFrame{ 
	String sResult = ""; // 결과값
	String notTags = "[^AaBbCc]"; // 태그가 아닌 나머지 모든 문자들 정규표현식
	String sTags = ""; // 태그만 들어있는 문자열
	
	// GUI 생성자 (제목, 창 위치 좌표 인자로 받음)
	examOne(String sTitle, int x, int y){
		
		// 창 제목 및 창 위치 설정
		setTitle(sTitle);
		setLocation(x, y);
		
		// 메인 패널 객체 생성
		JPanel main_panel = new JPanel();

		// 버튼 및 텍스트필드 데이터 배열 생성
		String[] sBtnNameList = {"파일 불러오기", "처리", "결과 출력"};
		String[] sTextContainList = {"D:\\\\\\\\Temp\\\\\\\\tag.in", "", ""};
		
		// 버튼 및 텍스트필드 객체 리스트 생성
		ArrayList<JButton> button_list = new ArrayList<>();
		ArrayList<JTextField> text_field_list = new ArrayList<>();
		
		// 버튼 객체 생성 후 리스트에 담기
		for( int i=0 ; i<3; i++ )
			button_list.add( new JButton( sBtnNameList[i] ) );

		// 텍스트필드 객체 생성 생성 후 리스트에 담기
		for( int i=0 ; i<3; i++ )
			text_field_list.add( new JTextField( sTextContainList[i] ) );
		
		//그리드레이아웃 생성
		main_panel.setLayout(new GridLayout(3, 2, 20, 20));
		
		
		//버튼 클릭 이벤트리스너 정의
		ActionListener action_l = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// 누른 버튼 이름 받아옴
				String button_name = e.getActionCommand();
				
				// 입력파일, 출력파일 이름 생성
				String input_name = text_field_list.get(0).getText();
				String output_name = text_field_list.get(0).getText().replace("in", "out");
				
				// 파일 불러오기  눌렀을 때
				if(button_name.equals("파일 불러오기")) {
					
					// 텍스트필드 초기화
					text_field_list.get(1).setText("");
					text_field_list.get(2).setText("");
					
					// 입력파일 오류 및 입력 메소드 실행 (입력파일명 인자로 보냄)
					if (!LoadData( input_name ) )
						text_field_list.get(1).setText(" 파일이 존재하지 않습니다.");
				}
				
				// 처리 눌렀을 때
				else if(button_name.equals("처리")) {
					
					// 불러온 파일 데이터가 없을 경우
					if(sTags.length() == 0) {
						text_field_list.get(1).setText(" 파일을 불러오지 않았거나, 비어있습니다.");
					}
					else {
						CalcResult(); //처리 메소드 실행
						text_field_list.get(1).setText(" 처리 결과 : " + sResult);
					}
				}
				
				// 결과 출력 눌렀을 때
				else if(button_name.equals("결과 출력")) {
					
					// 입력파일 오류
					if(text_field_list.get(1).getText().equals(" 파일이 존재하지 않습니다.")) {
						text_field_list.get(2).setText(" 파일이 존재하지 않아 저장하지 못했습니다.");
					}
						
					else {
						text_field_list.get(1).setText(output_name + " 파일에 저장 완료");
						text_field_list.get(2).setText(sResult);
						
						SaveResult(output_name); // 출력 메소드 실행 (출력파일명 인자로 보냄)
					}
				}
			}
		};

		// 반복문 돌려서 버튼 패널 및 이벤트리스너 삽입
		for( int i = 0 ; i < 3; i++ ) {
			main_panel.add( text_field_list.get(i) );
			
			main_panel.add( button_list.get(i) );
			button_list.get(i).addActionListener(action_l);
		}
		
		// 메인 패널 삽입
		add(main_panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 200);
		
		setVisible(true);
	} // 생성자 끝
	
	
	// 파일 불러오기 메소드
	// 입력 파일명 인자로 받음
	// 오류 시 false 반환
	public boolean LoadData(String iPath){
		sTags = ""; // 입력 필드 초기화
		
		// 파일에서 내용 모두 읽은 후, 태그를 제외한 모든 문자 제거 후, arrayList에 하나 씩 넣음
		try (BufferedReader br = new BufferedReader(new FileReader(iPath));){
			int nTemp;
			
			// 파일 끝까지 한글자씩 읽음
			while((nTemp = br.read()) != -1)
				if( notTags.contains( String.valueOf((char)nTemp )) )
					sTags += String.valueOf((char) nTemp);
		}
		catch (IOException e) {
			System.out.println("파일 열기 실패!");
			return false;
		}
		return true;
	}

	
	// 결과 출력 메소드
	// 출력 파일명 인자로 받음
	public void SaveResult(String oPath) {
		try(FileOutputStream fos = new FileOutputStream(oPath)){
			fos.write( sResult.getBytes() );
		}
		catch (IOException e) {
			System.out.println("파일 저장 실패!");
		}
	}
	
	
	// 처리 메소드
	public void CalcResult() {
		// 출력 데이터 초기화
		sResult = "";
		
		// 각 태그 개수 저장 변수
		int nAcount = 0, nBcount = 0, nCcount = 0;

		// 태그 우선순위 오류처리 (하위태그, 상위태그 순서)
		if (sTags.contains("CC") || sTags.contains("BB") || sTags.contains("AA")
				|| sTags.contains("cc") || sTags.contains("bb") || sTags.contains("aa")
				|| sTags.contains("cA") || sTags.contains("cB") || sTags.contains("bA")
				|| sTags.contains("aC") || sTags.contains("aB")
				|| sTags.contains("AC") || sTags.contains("bC") ) {
			
			sResult = "NG";
		}
		
		// 태그가 남아있지 않을때까지 반복
		while( !sTags.equals("") ) {
			// A태그 개수 증가 후 1개 제거
			if (sTags.contains("Aa")) {
				nAcount++;
				sTags = sTags.replaceFirst("Aa", "");
			}
			// B태그 개수 증가 후 1개 제거
			else if (sTags.contains("Bb")) {
				nBcount++;
				sTags = sTags.replaceFirst("Bb", "");
			}
			// C태그 개수 증가 후 1개 제거
			else if (sTags.contains("Cc")) {
				nCcount++;
				sTags = sTags.replaceFirst("Cc", "");
			}
			// 정확하지 않은 태그 남아있을 경우 오류처리
			else {
				sResult = "NG";
				break;
			}
		}
		
		// 오류가 없는 경우 출력값을 각 개수 문자열로 생성
		if ( !(sResult.equals("NG")) )
			sResult = nAcount + " " + nBcount + " " + nCcount;
	}
}