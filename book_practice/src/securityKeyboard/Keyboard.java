package securityKeyboard;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.util.Arrays;
import java.util.Collections;
public class Keyboard extends JFrame{
	JTextField randomNum, inputNum;
	JPanel north, center, south;
	JButton[] number;
	JButton blank, check;
	int count = 0;
	
	Keyboard(){
		JFrame frame = new JFrame();
		frame.setTitle("securityKeyboard");
		frame.setLayout(new BorderLayout());
		frame.setSize(300,400);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		north = new JPanel(new GridLayout(2, 0));
		center = new JPanel(new GridLayout(4, 4, 10, 10));
		south = new JPanel(new GridLayout(1, 2, 10, 10));
		
		randomNum = new JTextField(30);
		randomNum.setHorizontalAlignment(JTextField.CENTER);
		inputNum = new JTextField("보안 문자를 입력하세요.",30);
		inputNum.setHorizontalAlignment(JTextField.CENTER);
		
		String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "전체지움", "하나지움"};
		Collections.shuffle(Arrays.asList(num));
		int[] line = {0, 1, 2, 3};
		number = new JButton[16];
		
		blank = new JButton("빈칸");
		for(int i = 0; i < line.length; i ++)
		{	
			Collections.shuffle(Arrays.asList(line));
			if()
			number[i] = new JButton(num[i]);
			
		}
		

		check = new JButton("입력완료");
		south.add(new Panel());
		south.add(check);
		
		north.add(randomNum);
		north.add(inputNum);
		
		frame.add(north, BorderLayout.NORTH);
		frame.add(center, BorderLayout.CENTER);
		frame.add(south, BorderLayout.SOUTH);
		frame.setVisible(true);
		
	}
}
