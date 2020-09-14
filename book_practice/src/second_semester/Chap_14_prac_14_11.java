package second_semester;

import java.awt.*;
import javax.swing.*;

public class Chap_14_prac_14_11 extends JFrame {
	Chap_14_prac_14_11() {
		setTitle("원 넓이 구하기");
		
		setLayout(new BorderLayout(10, 10));
		showNorth();
		showCenter();
		showSouth();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
	
	void showNorth() {
		JPanel p1 = new JPanel();
		JPanel p2 = new JPanel();
		JPanel panel = new JPanel(new GridLayout(2, 0));
		
		JLabel l1 = new JLabel("원의 반지름");
		JLabel l2 = new JLabel("원의 넓이");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEnabled(true); // textfield 에 내용을 적게할수있냐의 여부
		
		p1.add(l1);
		p1.add(t1);
		
		p2.add(l2);
		p2.add(t2);
		
		panel.add(p1);
		panel.add(p2);
		
		add(panel, BorderLayout.NORTH);
	}
	
	void showCenter() {
		JPanel panel = new JPanel();
		
		JTextArea area = new JTextArea(30, 20);
		area.setText("이 영역에 원의 넓이를 \n 계산하는 과정이 나타납니다.");
		area.setEditable(false);
		area.setForeground(Color.black);
		
		panel.add(area);
		
		add(panel, BorderLayout.CENTER);
	}
	
	void showSouth() {
		String[] color = {"red", "black"};
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JButton cal = new JButton("계산");
		JComboBox<String> cb = new JComboBox<>(color);
		JButton reset = new JButton("리셋");
		
		panel.add(cal);
		panel.add(cb);
		panel.add(reset);
		
		add(panel, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new Chap_14_prac_14_11();

	}

}
