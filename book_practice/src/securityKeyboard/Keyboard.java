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
	int count = 0, numIndex = 0;
	
	Keyboard(){ //������
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout()); //��ü���ΰ� BorderLayout�� ����Ͽ����ϴ�.
		frame.setSize(300,400);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel north = new JPanel(new GridLayout(2, 0)); //���� �ؽ�Ʈ �ڽ� �ΰ��� GridLayout�� ����Ͽ����ϴ�.
		JPanel center = new JPanel(new GridLayout(4, 4, 10, 10)); //��� ��ư�鿡 GridLayout�� ����Ͽ����ϴ�.
		JPanel south = new JPanel(new GridLayout(1, 2, 10, 10)); //�Է¿Ϸ��ư�� GridLayout�� ����Ͽ����ϴ�.
		
		Font font = new Font("����ü", 1, 20); //������ ������ ũ��� ���⸦ �����Ͽ����ϴ�.
		randomNum = new JTextField(20);
		randomNum.setFont(font);
		randomNum.setBackground(new Color(0xAECDFF));
		randomNum.setHorizontalAlignment(JTextField.CENTER);
		randomNum.setText(numberGen());
		inputNum = new JTextField("���� ���ڸ� �Է��ϼ���.",20);
		inputNum.setBackground(new Color(0xAECDFF));
		inputNum.setHorizontalAlignment(JTextField.CENTER);
		
		String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "<html>��ü<br>����</html>", "<html>�ϳ�<br>����</html>"}; //��ư������ ���� �迭
		Collections.shuffle(Arrays.asList(num)); //�迭 �������� ����
		String[] line = {"0", "1", "2", "3"}; //��ĭ ��ư�� ��ġ�� �����ϱ� ���� �迭
		Collections.shuffle(Arrays.asList(line)); //�迭 �������� ����
		JButton[] number = new JButton[12];
		JButton[] blankB = new JButton[4];
		for(int i = 0; i < line.length; i ++)
		{
			for(int j = 0; j < line.length; j ++)
			{	
				if(Integer.toString(j).equals(line[count]))
				{
					blankB[i] = new JButton("��ĭ");
					blankB[i].setBackground(new Color(0xACF3FF));
					center.add(blankB[i]);
				}
				else 
				{
					number[numIndex] = new JButton(num[numIndex]);
					number[numIndex].setBackground(new Color(0xACF3FF));
					center.add(number[numIndex]);
					number[numIndex].addActionListener(this);
					numIndex ++;
				}
			}
			count++;
		}	
		JButton check = new JButton("�Է¿Ϸ�");
		check.setBackground(new Color(0xFFB788));
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
		
	public String numberGen()//������ ���ڸ� �����Ͽ� ��ȯ�ϴ� �޼����Դϴ�.
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
	public void actionPerformed(ActionEvent e)//�̺�Ʈ������
	{
		String buttonStr = e.getActionCommand();
		if(inputNum.getText().equals("���� ���ڸ� �Է��ϼ���.") || inputNum.getText().equals("�߸� �Է��Ͽ����ϴ�.") || inputNum.getText().equals("����� �����Ǿ����ϴ�."))
		{//inputNum �ؽ�Ʈ�ʵ忡 �޼����� ��µ��ִ� ��Ȳ������ ��ư ���
			if(!buttonStr.equals("<html>�ϳ�<br>����</html>") && !buttonStr.equals("�Է¿Ϸ�") && !buttonStr.equals("<html>��ü<br>����</html>")) //ù���ڸ� �Է��ϱ� ���� ����
			{
				inputNum.setText("");
				inputNum.setText(inputNum.getText() + buttonStr);
			}
			else if(buttonStr.equals("<html>�ϳ�<br>����</html>")) //���ڰ� �ƴ� �޼����� ��µ� ���¿����� �ϳ����� ��ư�� ���
			{
				inputNum.setText(inputNum.getText());// inputNum�ؽ�Ʈ�ʵ��� �޼����� �����Ѵ�.
			}
			else if(buttonStr.equals("<html>��ü<br>����</html>")) //���ڰ� �ƴ� �޼����� ��µ� ���¿����� ��ü���� ��ư�� ���
			{
				inputNum.setText("");//inputNum�ؽ�Ʈ�ʵ带 �ʱ�ȭ �Ѵ�.
			}
			else if(buttonStr.equals("�Է¿Ϸ�"))
			{
				if(inputNum.getText().equals(randomNum.getText()))
				{
					inputNum.setText("����� �����Ǿ����ϴ�.");
				}
				else
				{
					inputNum.setText("�߸� �Է��Ͽ����ϴ�.");
				}
			}
		}
		else//inputNum�ؽ�Ʈ�ʵ忡 �޼����� �ƴ� ���ڰ� �ԷµǾ������� ��ư�� ���
		{
			if(buttonStr.equals("<html>�ϳ�<br>����</html>"))
			{
				if(inputNum.getText().equals("") || inputNum.getText().equals("���� ���ڸ� �Է��ϼ���.") || inputNum.getText().equals("�߸� �Է��Ͽ����ϴ�.") || inputNum.getText().equals("����� �����Ǿ����ϴ�."))
				{
					inputNum.setText(inputNum.getText()); //inputNum�ؽ�Ʈ�ʵ忡 �޼��� Ȥ�� ��ĭ�϶��� �ϳ������ư�� ���
				}
				else
				{
					inputNum.setText(inputNum.getText().substring(0, inputNum.getText().length()-1)); //inputNum�ؽ�Ʈ�ʵ忡 ���ڰ� �ԷµǾ������� ������ ���� ����
				}
			}
			else if(buttonStr.equals("�Է¿Ϸ�"))
			{
				if(inputNum.getText().equals(randomNum.getText())) //inputNum�ؽ�Ʈ�ʵ��� ���� randomNum�ؽ�Ʈ �ʵ��� ���� �� �� �޼��� ���
				{
					inputNum.setText("����� �����Ǿ����ϴ�.");
				}
				else
				{
					inputNum.setText("�߸� �Է��Ͽ����ϴ�.");
				}
			}
			else if(buttonStr.equals("<html>��ü<br>����</html>"))
			{
				inputNum.setText("");
			}
			else
			{
				inputNum.setText(inputNum.getText() + buttonStr);//���� ��ư�� �������� ��ư�� ���
			}
		}
	}
}
