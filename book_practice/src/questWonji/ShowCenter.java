package questWonji;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;
public class ShowCenter extends JFrame {
	JPanel p1, p2;
	JPanel panel;
	JTextArea ta1, ta2;
	JButton b1, b2;
	JTextPane tp1;
	int sum, newSum, division = 0;
	
	public ShowCenter(JFrame frame, ArrayList list) {
		p1 = new JPanel();
		p2 = new JPanel();
		panel = new JPanel(new GridLayout(2, 2));
		ta1 = new JTextArea(2, 15);
		ta2 = new JTextArea(2, 15);
		b1 = new JButton("네 숫자의 합");
		b2 = new JButton("합을 3으로 나눈 숫자");

		b1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e){
				for(int i = 0; i < list.size(); i ++)
				{
					sum = Integer.parseInt((String) list.get(i));
					newSum += sum;
				}
				ta1.append(Integer.toString(newSum));

			}
		});

		b2.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				division = newSum / 3;
				ta2.append(Integer.toString(division));
				
			}
		});
		
		p1.add(ta1);
		p1.add(b1);
		
		p2.add(ta2);
		p2.add(b2);
		
		panel.add(p1);
		panel.add(p2);
		
		frame.add(panel, BorderLayout.CENTER);
	}
	
}
