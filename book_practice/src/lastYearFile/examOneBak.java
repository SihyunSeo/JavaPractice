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

public class examOneBak extends JFrame{ 
	String sResult = ""; // �����
	String notTags = "[^AaBbCc]"; // �±װ� �ƴ� ������ ��� ���ڵ� ����ǥ����
	ArrayList<String> tagList = new ArrayList<>(); // �±׸� ����ִ� ����Ʈ
	
	// GUI ������ (����, â ��ġ ��ǥ ���ڷ� ����)
	examOneBak(String sTitle, int x, int y){
		
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
					if(tagList.size() == 0) {
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
		// �����͵� �ʱ�ȭ
		sResult = "";
		tagList.clear();
		
		// ���Ͽ��� ���� ��� ���� ��, �±׸� ������ ��� ���� ���� ��, arrayList�� �ϳ� �� ����
		try (BufferedReader br = new BufferedReader(new FileReader(iPath));){
			int nTemp;
			
			while((nTemp = br.read()) != -1)
				if( notTags.contains( String.valueOf((char)nTemp )) )
					tagList.add(String.valueOf((char) nTemp));
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
		// �� �±׾ȿ� ���� �������� �����ϴ� ����
		boolean A_tag = false, B_tag = false, C_tag = false;
		
		// �� �±� ���� ���� ����
		int nAcount = 0, nBcount = 0, nCcount = 0;
		
		//�±׸� ����� ����Ʈ �ݺ���
		for(int i = 0 ; i < tagList.size() ; i++) {
			
			if (A_tag) { // A�±� �ȿ� ������ ��
				if (B_tag) { // B�±� �ȿ� ������ �� 
					if (C_tag) { // C�±� �ȿ� ������ ��
						
						// c�±� ������ ���� ��
						if (tagList.get(i).equals("c")) {
							C_tag = false;
							nCcount++;
						}
						// �ܴ̿� ��� ����ó��
						else {
							sResult = "NG";
							break;
						}
					}
					// B�±� �ȿ��� C�±� ������ ������ ��
					else {
						// C�±� ������ �� ��
						if (tagList.get(i).equals("C"))
							C_tag = true;
						
						// b�±� ������ ���� ��
						else if(tagList.get(i).equals("b")) {
							B_tag = false;
							nBcount++;
						}
						// ������ ����ó��
						else {
							sResult = "NG";
							break;
						}
					}
				}
				// A�±� �ȿ��� B�±� ������ ������ ��
				else {
					// B�±� ������ �� ��
					if (tagList.get(i).equals("B"))
						B_tag = true;
					
					// a�±� ������ ���� ��
					else if(tagList.get(i).equals("a")) {
						A_tag = false;
						nAcount++;
					}
					// ������ ����ó��
					else {
						sResult = "NG";
						break;
					}
				}
			}
			// A�±� ������ ������ �� (���� �ٱ��κ�)
			else {
				// A�±� ������ �� ��
				if (tagList.get(i).equals("A"))
					A_tag = true;
				
				// ������ ����ó��
				else {
					sResult = "NG";
					break;
				}
			}
		}
		
		// ���� ������ ���� �±װ� ���� �� ����ó��
		if( A_tag || B_tag || C_tag )
			sResult = "NG";
		
		// ������ ���� ��� ��°��� �� ���� ���ڿ��� ����
		if ( !(sResult.equals("NG")) )
			sResult = nAcount + " " + nBcount + " " + nCcount;
	}
}