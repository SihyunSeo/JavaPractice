package second_semester;

import java.awt.*;
import javax.swing.*;

public class Chap_14_prac_14_11 extends JFrame {
	Chap_14_prac_14_11() {
		setTitle("�� ���� ���ϱ�");
		
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
		
		JLabel l1 = new JLabel("���� ������");
		JLabel l2 = new JLabel("���� ����");
		
		JTextField t1 = new JTextField(10);
		JTextField t2 = new JTextField(10);
		t2.setEnabled(true); // textfield �� ������ �����Ҽ��ֳ��� ����
		
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
		area.setText("�� ������ ���� ���̸� \n ����ϴ� ������ ��Ÿ���ϴ�.");
		area.setEditable(false);
		area.setForeground(Color.black);
		
		panel.add(area);
		
		add(panel, BorderLayout.CENTER);
	}
	
	void showSouth() {
		String[] color = {"red", "black"};
		
		JPanel panel = new JPanel(new FlowLayout(FlowLayout.CENTER, 10, 10));
		
		JButton cal = new JButton("���");
		JComboBox<String> cb = new JComboBox<>(color);
		JButton reset = new JButton("����");
		
		panel.add(cal);
		panel.add(cb);
		panel.add(reset);
		
		add(panel, BorderLayout.SOUTH);
	}
	public static void main(String[] args) {
		new Chap_14_prac_14_11();

	}

}
