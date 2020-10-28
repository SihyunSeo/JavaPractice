package securityKeyboard;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class Keyboard extends JFrame implements ActionListener{
	JTextField randomNum, inputNum;
	JPanel north, center, south;
	JButton[] number, blankB;
	JButton blank, check;
	int count = 0, numIndex = 0;
	
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
		
		Font font = new Font("����ü", 1, 20);
		randomNum = new JTextField(20);
		randomNum.setFont(font);
		randomNum.setHorizontalAlignment(JTextField.CENTER);
		randomNum.setText(numberGen());
		inputNum = new JTextField("���� ���ڸ� �Է��ϼ���.",20);
		inputNum.setHorizontalAlignment(JTextField.CENTER);
		
		String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "<html>��ü<br>����</html>", "<html>�ϳ�<br>����</html>"};
		Collections.shuffle(Arrays.asList(num));
		String[] line = {"0", "1", "2", "3"};
		Collections.shuffle(Arrays.asList(line));
		number = new JButton[12];
		blankB = new JButton[4];

		for(int i = 0; i < line.length; i ++)
		{
			for(int j = 0; j < line.length; j ++)
			{	
				if(Integer.toString(j).equals(line[count]))
				{
					blankB[i] = new JButton("��ĭ");
					center.add(blankB[i]);
				}
				else 
				{
					number[numIndex] = new JButton(num[numIndex]);
					center.add(number[numIndex]);
					number[numIndex].addActionListener(this);
					numIndex ++;
				}
			}
			count++;
		}	
		check = new JButton("�Է¿Ϸ�");
		check.addActionListener(this);
		south.add(new Panel());
		south.add(check);
		
		north.add(randomNum);
		north.add(inputNum);
		
		frame.add(north, BorderLayout.NORTH);
		frame.add(center, BorderLayout.CENTER);
		frame.add(south, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
	
	
	public String numberGen()
	{
		Random rand = new Random();
		String numStr = "";
		
		for(int i = 0; i < 6; i ++)
		{
			String ran = Integer.toString(rand.nextInt(10));
			numStr += ran;
		}
		
		return numStr;
	}

	@Override
	public void actionPerformed(ActionEvent e) 
	{
		String buttonStr = e.getActionCommand();
		if(inputNum.getText().equals("���� ���ڸ� �Է��ϼ���.") || inputNum.getText().equals("�߸� �Է��Ͽ����ϴ�.") || inputNum.getText().equals("����� �����Ǿ����ϴ�."))
		{
			inputNum.setText("");
			inputNum.setText(inputNum.getText() + buttonStr);
		}

		if(buttonStr == "<html>��ü<br>����</html>")
		{
			inputNum.setText("");
		}
		else if(buttonStr == "<html>�ϳ�<br>����</html>")
		{
			if(inputNum.getText().equals("") || inputNum.getText().equals("���� ���ڸ� �Է��ϼ���.") || inputNum.getText().equals("�߸� �Է��Ͽ����ϴ�.") || inputNum.getText().equals("����� �����Ǿ����ϴ�."))
			{
				inputNum.setText(inputNum.getText());
			}
			else
			{
				String nowNum = inputNum.getText();
				inputNum.setText(nowNum.substring(0, nowNum.length()-1));
			}
		}
		else if(buttonStr == "�Է¿Ϸ�")
		{
			if(randomNum.getText().equals(inputNum.getText()))
			{
				inputNum.setText("����� �����Ǿ����ϴ�.");
			}
			else
			{
				inputNum.setText("�߸� �Է��Ͽ����ϴ�.");
			}
		}
		else
		{
			inputNum.setText(inputNum.getText() + buttonStr);
		}	
	}
}
