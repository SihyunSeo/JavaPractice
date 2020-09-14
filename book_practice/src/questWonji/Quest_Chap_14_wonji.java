package questWonji;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;

import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

public class Quest_Chap_14_wonji extends JFrame{
	Quest_Chap_14_wonji()	{
		JFrame frame=new JFrame();
		frame.setTitle("숫자변환기");
		
		frame.setLayout(new BorderLayout(10, 10));
		
		ShowTop st = new ShowTop(frame);
		//ShowCenter sc = new ShowCenter(frame, st.list1);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setSize(300, 400);
		frame.setVisible(true);
	}
}
