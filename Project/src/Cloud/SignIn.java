package Cloud;
import javax.swing.*;
import java.awt.*;

public class SignIn extends JFrame{
	SignIn() {
		setLayout(new BorderLayout());
		setSize(400, 300);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel north = new JPanel();
		north.setPreferredSize(new Dimension(400, 70));
		JPanel idP = new JPanel();
		JPanel passwordP = new JPanel();
		JPanel center = new JPanel();
		JPanel south = new JPanel();
		JPanel blank = new JPanel();
		blank.setPreferredSize(new Dimension(110, 0));
		
		JLabel idL = new JLabel("USERNAME");
		JLabel passwordL = new JLabel("PASSWORD");
		
		JTextField idTf = new JTextField(20);
		JTextField passwordTf = new JTextField(20);
		
		JButton signIn = new JButton("로그인");
		JButton signUp = new JButton("회원가입");
		
		idP.add(idL);
		idP.add(idTf);
		
		passwordP.add(passwordL);
		passwordP.add(passwordTf);
		
		south.add(blank);
		south.add(signIn);
		south.add(signUp);
		
		center.add(idP);
		center.add(passwordP);
		center.add(south);
		this.add(north, BorderLayout.NORTH);
		this.add(center, BorderLayout.CENTER);
		setVisible(true);
	}
	
	public static void main(String[] mrg) {
		new SignIn();
	}
}
