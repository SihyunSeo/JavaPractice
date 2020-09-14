package Web_gui;

import javax.swing.*;
import java.awt.event.*;
import java.awt.*;

class Frame extends JFrame
{
	Frame()
	{
		setTitle("Embedded Lab");
		
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		p1.setLayout(new BorderLayout());
		//p2.setLayout(null);
		
		JLabel l = new JLabel("입력후 ENTER 혹은 <입력> 버튼을 누르세요");
		add(l, BorderLayout.NORTH); //라벨 맨위에 고정
		l.setHorizontalAlignment(JLabel.CENTER); //라벨 가운데 정렬
		
		
		JTextField f1 = new JTextField(45);
		
		JTextArea a = new JTextArea(15, 55);
		JButton b = new JButton("입력");
		
		p2.add(f1);
		p2.add(b);
		p2.add(a);
		p2.add(new JScrollPane(a));
		add(p1);
		add(p2);
		

		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		
		f1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				a.append(t.getText() + "\n"); 
				t.setText(""); 
			}
		});
		
		b.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t = (JTextField)e.getSource();
				a.append(t.getText() + "\n"); 
				t.setText(""); 
			}
		});
		setSize(700,500);
		setVisible(true);
	}
}
public class Test_GUI {
	public static void main(String[] args) {
		new Frame();
	} 

}
