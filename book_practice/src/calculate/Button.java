package calculate;
import javax.swing.*;
import java.awt.*;


public class Button extends JFrame {
	JPanel p1;
	JPanel panel;
	JButton b1, b2, b3, b4;
	Button(){
		b1 = new JButton("AC");
		b2 = new JButton("+/-");
		b3 = new JButton("%");
		b4 = new JButton("/");
		
		p1 = new JPanel();
		panel = new JPanel(new GridLayout());
		
	}
}
