package calculate;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class Button extends JFrame{
	JPanel p1, p2, p3, p4, p5;
	JPanel panel;
	
	Button(JFrame frame){
		Top top = new Top(frame);
		ArrayList<String> saveNum = new ArrayList<String>();
		String[] operatorName = {"+", "-", "x", "÷", ".", "=", "on", "off"};
		JButton[] operator = new JButton[operatorName.length];
		for(int i = 0; i < operatorName.length; i ++)
		{
			operator[i] = new JButton(operatorName[i]);
		}
		JButton[] num = new JButton[10];
		for(int i = 0; i < 10; i ++)
		{
			num[i] = new JButton("" + i);
		}
		
		class ButtonAction implements ActionListener
		{
			public void actionPerformed(ActionEvent e) {
				String ba = e.getActionCommand();
				if(ba == "+")
				{
					saveNum.add(top.ta1.getText());
					top.ta1.setText("");
					System.out.println(saveNum);
				}
				top.ta1.setText(top.ta1.getText() + e.getActionCommand());
				if(ba == "off")
				{
					top.ta1.setText("");
				}
				else if(ba == "on")
				{
					top.ta1.setText("연산을 입력해주세요.");
				}
				/*else if(e.getActionCommand() == "+")
				{
					saveNum.add(top.ta1.getText());
					System.out.println(saveNum);
				}*/
			}
			
		}
		for(int i = 0; i < 10; i ++)
		{
			num[i].addActionListener(new ButtonAction());
		}
		
		for(int i = 0; i < operatorName.length; i ++)
		{
			operator[i].addActionListener(new ButtonAction());
		}
		
		//bMinus.setPreferredSize(new Dimension(42, 28));
		//bDot.setPreferredSize(new Dimension(42, 28));
		//bDiv.setPreferredSize(new Dimension(42, 28));
		//bMulti.setPreferredSize(new Dimension(42, 28));
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		panel = new JPanel(new GridLayout(5, 0));
		
		p1.add(operator[6]);
		p1.add(operator[7]);
		
		p2.add(num[7]);
		p2.add(num[8]);
		p2.add(num[9]);
		p2.add(operator[0]);
		
		p3.add(num[4]);
		p3.add(num[5]);
		p3.add(num[6]);
		p3.add(operator[1]);
		
		p4.add(num[1]);
		p4.add(num[2]);
		p4.add(num[3]);
		p4.add(operator[2]);
		
		p5.add(num[0]);
		p5.add(operator[4]);
		p5.add(operator[5]);
		p5.add(operator[3]);
		
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
		panel.add(p5);
		frame.add(panel, BorderLayout.CENTER);
		
	}
}
