package questWonji;

import java.awt.BorderLayout;
import java.awt.Component;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class ShowTop extends JFrame {
	JPanel p1;
	JPanel p2;
	JLabel l1;
	JPanel panel;
	JTextArea ta1;
	JTextArea ta2;
	JButton b1;
	ArrayList<String> list = new ArrayList<>();
	
	public ShowTop(JFrame frame) {
		String newFolderPath = "";
		p1 = new JPanel();
		p2 = new JPanel();
		l1 = new JLabel("입력된 숫자");
		panel = new JPanel(new GridLayout(2, 0));
		
		ta1 = new JTextArea(2, 15);
		ta2 = new JTextArea(2, 15);

		b1 = new JButton("파일 선택");
		//b1.setPreferredSize(new Dimension(90, 20));
		
		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				ArrayList<String> numList = new ArrayList<>();
				String folderPath = "";
				JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
				chooser.setCurrentDirectory(new File("/"));
				chooser.setAcceptAllFileFilterUsed(true);
				chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
				
				FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter 확장자 추가
		        chooser.setFileFilter(filter); // 파일 필터를 추가
		        
		        int returnVal = chooser.showOpenDialog(null); // 열기용 창 오픈
		        
		        if(returnVal == JFileChooser.APPROVE_OPTION) { // 열기를 클릭 
		            folderPath = chooser.getSelectedFile().toString();
		        }else if(returnVal == JFileChooser.CANCEL_OPTION){ // 취소를 클릭
		            System.out.println("cancel"); 
		            folderPath = "";
		        }
		        
		        ta1.append(folderPath);
		        
		        String s;
				File file = new File(new String(folderPath));
				try {
					BufferedReader br = new BufferedReader(new FileReader(file));
					while((s = br.readLine()) != null)
					{
						ta2.append(s);
						String words[] = s.split(" ");
						for(int i = 0; i < words.length; i ++)
						{
							numList.add(words[i]);
						}
					}
				} catch (IOException a) {
				}
				for(int i = 0; i < numList.size(); i ++)
				{
					list.add(i, numList.get(i));
				}
			}
		});
		
		p1.add(ta1);
		p1.add(b1);
		
		p2.add(ta2);
		p2.add(l1);
		
		panel.add(p1);
		panel.add(p2);
		frame.add(panel, BorderLayout.CENTER);
	}


}
