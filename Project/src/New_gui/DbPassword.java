package New_gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class DbPassword extends JFrame implements ActionListener{
	String password = "1234";
	JPanel top,center,blank;
	JTextField passwordTf;
	JButton passwordB;
	JLabel passwordL;
	private DbPassword() {
		setLayout(new FlowLayout());
		setTitle("Server");
	    setSize(350, 150);
	    setResizable(false);
	    setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	    
	    blank = new JPanel();
	    top = new JPanel();
	    center = new JPanel();
	    
	    blank.setPreferredSize(new Dimension(0, 50));
	    
	    passwordL = new JLabel("DataBase ��й�ȣ�� �Է��ϼ���.");
	    passwordTf = new JTextField(20);
	    passwordB = new JButton("�Է�");
	    passwordB.addActionListener(this);
	    
	    top.add(passwordL);
	    center.add(passwordTf);
	    center.add(passwordB);
	    
	    this.add(blank);
	    this.add(top);
	    this.add(center);
	    setVisible(true);
	}
	
	@Override
	public void actionPerformed(ActionEvent e) {
		if(passwordTf.getText().equals(password)) {
			new ServerRoot();
			this.dispose();
		}
		else {
			JOptionPane.showMessageDialog(null, "��й�ȣ�� ��ġ���� �ʽ��ϴ�.");
			passwordTf.setText("");
		}
	}
}
