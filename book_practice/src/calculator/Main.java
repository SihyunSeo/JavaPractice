package calculator;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.awt.*;
import javax.swing.*;

public class Main extends JFrame implements ActionListener {
	JPanel masterPanel, top, power, function;
	JTextField tf1;
	JButton[] operator, num;
	int operatorLength;
	double frontNum = 0, saveNum = 0, lastNum = 0, result = 0, newNum = 0, calResult = 0;
	String functions = "";
	Main(){
		JFrame frame = new JFrame();
		frame.setTitle("����");
		frame.setLayout(new BorderLayout());
		frame.setSize(250, 300);
		frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		
		tf1 = new JTextField(20);//�ؽ�Ʈ�ʵ� ũ��
		tf1.setHorizontalAlignment(JTextField.RIGHT);//�����ʺ��� ���� ����ϰ��ϱ�
		
		top = new JPanel();
		top.setLayout(new FlowLayout());
		top.add(tf1);
		
		String[] operatorName = {"+", "-", "x", "��", ".", "=", "on", "off"};
		operatorLength = operatorName.length;
		operator = new JButton[operatorName.length];//�����ڿ� �ش��ϴ� ��ư ����
		for(int i = 0; i < operatorName.length; i ++)
		{
			operator[i] = new JButton(operatorName[i]);
		}
		
		num = new JButton[10];//���ڿ� �ش��ϴ� ��ư ����
		for(int i = 0; i < 10; i ++)
		{
			num[i] = new JButton(Integer.toString(i));
		}
		
		for(int i = 0; i < 10; i ++)
		{
			num[i].addActionListener(this);
		}
		
		for(int i = 0; i < operatorName.length; i ++)
		{
			operator[i].addActionListener(this);
		}
		
		masterPanel = new JPanel();
		masterPanel.setLayout(new FlowLayout());
		power = new JPanel();	
		
		power.add(operator[6]);
		power.add(operator[7]);
		
		function = new JPanel();
		function.setLayout(new GridLayout(0, 4, 10, 10));
		
		function.add(num[7]);
		function.add(num[8]);
		function.add(num[9]);
		function.add(operator[0]);
		
		function.add(num[4]);
		function.add(num[5]);
		function.add(num[6]);
		function.add(operator[1]);
		
		function.add(num[1]);
		function.add(num[2]);
		function.add(num[3]);
		function.add(operator[2]);
		
		function.add(num[0]);
		function.add(operator[4]);
		function.add(operator[5]);
		function.add(operator[3]);
		
		masterPanel.add(power);
		masterPanel.add(function);
		frame.add(top, BorderLayout.NORTH);
		frame.add(masterPanel, BorderLayout.CENTER);
		frame.setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		
		for(int i = 0; i < 10 ; i ++)
		{
			if(e.getSource() == num[i])
				tf1.setText(tf1.getText() + Integer.toString(i));
		}
		if (functions != "")// �� ���� �ذ��ϱ�
		{
			newNum = Double.parseDouble(tf1.getText());
			calSaveNum(functions);
		}
		if (e.getSource() == operator[5])//=��ư
		{
			if(functions == "+")
			{
				lastNum = Double.parseDouble(tf1.getText());
				result = saveNum + lastNum;
				tf1.setText(Double.toString(result));
			}
			else if(functions == "-")
			{
				lastNum = Double.parseDouble(tf1.getText());
				result = saveNum - lastNum;
				tf1.setText(Double.toString(result));
			}
			else if(functions == "x")
			{
				lastNum = Double.parseDouble(tf1.getText());
				result = saveNum * lastNum;
				tf1.setText(Double.toString(result));
			}
			else
			{
				lastNum = Double.parseDouble(tf1.getText());
				result = saveNum / lastNum;
				tf1.setText(Double.toString(result));
			}
		}
		if (e.getSource() == operator[0])//+��ư
		{
			if(tf1.getText().equals(""))
			{
				tf1.setText("");
			}
			else
			{
				functions = "+";
				setFrontNum();
				setSaveNum();
				tf1.setText("");
			}
		}
		if (e.getSource() == operator[1])//-��ư
		{
			if(tf1.getText().equals(""))// �������
			{
				tf1.setText(tf1.getText() + e.getActionCommand());
			}
			else if(tf1.getText().equals("-"))
			{
				tf1.setText("");
			}
			else
			{
				functions = "-";
				setFrontNum();
				setSaveNum();
				tf1.setText("");
			}
		}	
		if (e.getSource() == operator[2])//x��ư
		{
			if(tf1.getText().equals(""))
			{
				tf1.setText("");
			}
			else
			{
				functions = "x";
				setFrontNum();
				setSaveNum();
				tf1.setText("");
			}
		}	
		if (e.getSource() == operator[3])//����ư
		{
			if(tf1.getText().equals(""))
			{
				tf1.setText("");
			}
			else
			{
				functions = "��";
				setFrontNum();
				setSaveNum();
				tf1.setText("");
			}
		}	
		if (e.getSource() == operator[4])//.��ư
			if(tf1.getText().contains(e.getActionCommand()))
			{
				tf1.setText(tf1.getText());
			}
			else
			{
				tf1.setText(tf1.getText() + e.getActionCommand());
			}
		
		if (e.getSource() == operator[6])//on��ư ���
			tf1.setText("������ �Է��� �ּ���.");
		
		if (e.getSource() == operator[7])//off��ư ���
		{
			tf1.setText("");
			functions = "";
			frontNum = 0;
			saveNum = 0;
			lastNum = 0;
			result = 0;
			newNum = 0;
			calResult = 0;
		}
	}
	public double calSaveNum(String functions)
	{
		if(functions == "+")
		{
			calResult = frontNum + newNum;
		}
		else if(functions == "-")
		{
			calResult = frontNum - newNum;
		}
		else if(functions == "x")
		{
			calResult = frontNum * newNum;
		}
		else if(functions == "��")
		{
			calResult = frontNum / newNum;
		}
		
		return calResult;
	}
	public double setFrontNum()
	{
		if (frontNum == 0)
		{
			frontNum = Double.parseDouble(tf1.getText());
		}
		else
		{
			frontNum = calResult;
		}
		return frontNum;
	}
	public double setSaveNum()
	{
		if (saveNum == 0)
		{
			saveNum = saveNum + frontNum;
		}
		else if (saveNum != 0 && newNum != 0)
		{
			saveNum = calResult;
		}
		return saveNum;
	}
}
