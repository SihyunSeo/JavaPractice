package calculate;
import javax.swing.*;
import java.awt.*;
public class Top extends JFrame{
	JTextArea ta1;
	JPanel p1;
	JPanel panel;
	public Top(JFrame frame){
		ta1 = new JTextArea(4, 30);
		p1 = new JPanel();
		panel = new JPanel(new GridLayout(1,0));
		
		p1.add(ta1);
		panel.add(p1);
		frame.add(panel);
	}
}
