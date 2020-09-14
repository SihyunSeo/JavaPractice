package questWonji;
import javax.swing.*;
import java.awt.*;
import java.util.ArrayList;
public class ShowCenter extends JFrame {
	JPanel p1;
	//JPanel p2;
	JPanel panel;
	JTextArea ta1;
	JLabel l1;
	String sum;
	
	//JTextArea ta2;
	public ShowCenter(JFrame frame, ArrayList list) {
		p1 = new JPanel();
		panel = new JPanel(new GridLayout(2, 0));
		ta1 = new JTextArea(1, 10);
		l1 = new JLabel("네 숫자의 합");
		/*for(int i = 0; i < list.size(); i ++)
		{
			sum += Integer.parseInt((String) list.get(i));
		}*/
		
		p1.add(ta1);
		p1.add(l1);
		panel.add(p1);
		
		frame.add(panel, BorderLayout.CENTER);
	}
	
}
