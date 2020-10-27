// �ΰ����ɼ���Ʈ���� ����
// 16422034 ������
// �ڹ� �⸻��� ���α׷�

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
	String sResult = ""; // �����
	String notTags = "[^AaBbCc]"; // �±װ� �ƴ� ������ ��� ���ڵ� ����ǥ����
	String sTags = ""; // �±׸� ����ִ� ���ڿ�
	
	// GUI ������ (����, â ��ġ ��ǥ ���ڷ� ����)
	examOne(String sTitle, int x, int y){
		
		// â ���� �� â ��ġ ����
		setTitle(sTitle);
		setLocation(x, y);
		
		// ���� �г� ��ü ����
		JPanel main_panel = new JPanel();

		// ��ư �� �ؽ�Ʈ�ʵ� ������ �迭 ����
		String[] sBtnNameList = {"���� �ҷ�����", "ó��", "��� ���"};
		String[] sTextContainList = {"D:\\\\\\\\Temp\\\\\\\\tag.in", "", ""};
		
		// ��ư �� �ؽ�Ʈ�ʵ� ��ü ����Ʈ ����
		ArrayList<JButton> button_list = new ArrayList<>();
		ArrayList<JTextField> text_field_list = new ArrayList<>();
		
		// ��ư ��ü ���� �� ����Ʈ�� ���
		for( int i=0 ; i<3; i++ )
			button_list.add( new JButton( sBtnNameList[i] ) );

		// �ؽ�Ʈ�ʵ� ��ü ���� ���� �� ����Ʈ�� ���
		for( int i=0 ; i<3; i++ )
			text_field_list.add( new JTextField( sTextContainList[i] ) );
		
		//�׸��巹�̾ƿ� ����
		main_panel.setLayout(new GridLayout(3, 2, 20, 20));
		
		
		//��ư Ŭ�� �̺�Ʈ������ ����
		ActionListener action_l = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				// ���� ��ư �̸� �޾ƿ�
				String button_name = e.getActionCommand();
				
				// �Է�����, ������� �̸� ����
				String input_name = text_field_list.get(0).getText();
				String output_name = text_field_list.get(0).getText().replace("in", "out");
				
				// ���� �ҷ�����  ������ ��
				if(button_name.equals("���� �ҷ�����")) {
					
					// �ؽ�Ʈ�ʵ� �ʱ�ȭ
					text_field_list.get(1).setText("");
					text_field_list.get(2).setText("");
					
					// �Է����� ���� �� �Է� �޼ҵ� ���� (�Է����ϸ� ���ڷ� ����)
					if (!LoadData( input_name ) )
						text_field_list.get(1).setText(" ������ �������� �ʽ��ϴ�.");
				}
				
				// ó�� ������ ��
				else if(button_name.equals("ó��")) {
					
					// �ҷ��� ���� �����Ͱ� ���� ���
					if(sTags.length() == 0) {
						text_field_list.get(1).setText(" ������ �ҷ����� �ʾҰų�, ����ֽ��ϴ�.");
					}
					else {
						CalcResult(); //ó�� �޼ҵ� ����
						text_field_list.get(1).setText(" ó�� ��� : " + sResult);
					}
				}
				
				// ��� ��� ������ ��
				else if(button_name.equals("��� ���")) {
					
					// �Է����� ����
					if(text_field_list.get(1).getText().equals(" ������ �������� �ʽ��ϴ�.")) {
						text_field_list.get(2).setText(" ������ �������� �ʾ� �������� ���߽��ϴ�.");
					}
						
					else {
						text_field_list.get(1).setText(output_name + " ���Ͽ� ���� �Ϸ�");
						text_field_list.get(2).setText(sResult);
						
						SaveResult(output_name); // ��� �޼ҵ� ���� (������ϸ� ���ڷ� ����)
					}
				}
			}
		};

		// �ݺ��� ������ ��ư �г� �� �̺�Ʈ������ ����
		for( int i = 0 ; i < 3; i++ ) {
			main_panel.add( text_field_list.get(i) );
			
			main_panel.add( button_list.get(i) );
			button_list.get(i).addActionListener(action_l);
		}
		
		// ���� �г� ����
		add(main_panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(600, 200);
		
		setVisible(true);
	} // ������ ��
	
	
	// ���� �ҷ����� �޼ҵ�
	// �Է� ���ϸ� ���ڷ� ����
	// ���� �� false ��ȯ
	public boolean LoadData(String iPath){
		sTags = ""; // �Է� �ʵ� �ʱ�ȭ
		
		// ���Ͽ��� ���� ��� ���� ��, �±׸� ������ ��� ���� ���� ��, arrayList�� �ϳ� �� ����
		try (BufferedReader br = new BufferedReader(new FileReader(iPath));){
			int nTemp;
			
			// ���� ������ �ѱ��ھ� ����
			while((nTemp = br.read()) != -1)
				if( notTags.contains( String.valueOf((char)nTemp )) )
					sTags += String.valueOf((char) nTemp);
		}
		catch (IOException e) {
			System.out.println("���� ���� ����!");
			return false;
		}
		return true;
	}

	
	// ��� ��� �޼ҵ�
	// ��� ���ϸ� ���ڷ� ����
	public void SaveResult(String oPath) {
		try(FileOutputStream fos = new FileOutputStream(oPath)){
			fos.write( sResult.getBytes() );
		}
		catch (IOException e) {
			System.out.println("���� ���� ����!");
		}
	}
	
	
	// ó�� �޼ҵ�
	public void CalcResult() {
		// ��� ������ �ʱ�ȭ
		sResult = "";
		
		// �� �±� ���� ���� ����
		int nAcount = 0, nBcount = 0, nCcount = 0;

		// �±� �켱���� ����ó�� (�����±�, �����±� ����)
		if (sTags.contains("CC") || sTags.contains("BB") || sTags.contains("AA")
				|| sTags.contains("cc") || sTags.contains("bb") || sTags.contains("aa")
				|| sTags.contains("cA") || sTags.contains("cB") || sTags.contains("bA")
				|| sTags.contains("aC") || sTags.contains("aB")
				|| sTags.contains("AC") || sTags.contains("bC") ) {
			
			sResult = "NG";
		}
		
		// �±װ� �������� ���������� �ݺ�
		while( !sTags.equals("") ) {
			// A�±� ���� ���� �� 1�� ����
			if (sTags.contains("Aa")) {
				nAcount++;
				sTags = sTags.replaceFirst("Aa", "");
			}
			// B�±� ���� ���� �� 1�� ����
			else if (sTags.contains("Bb")) {
				nBcount++;
				sTags = sTags.replaceFirst("Bb", "");
			}
			// C�±� ���� ���� �� 1�� ����
			else if (sTags.contains("Cc")) {
				nCcount++;
				sTags = sTags.replaceFirst("Cc", "");
			}
			// ��Ȯ���� ���� �±� �������� ��� ����ó��
			else {
				sResult = "NG";
				break;
			}
		}
		
		// ������ ���� ��� ��°��� �� ���� ���ڿ��� ����
		if ( !(sResult.equals("NG")) )
			sResult = nAcount + " " + nBcount + " " + nCcount;
	}
}