package calculate;
import javax.swing.*;
import java.awt.*;
public class Calculate extends JFrame {
	Calculate(){
		JFrame frame = new JFrame();
		frame.setTitle("Calculate");
		frame.setLayout(new GridLayout(4, 6));
		frame.setSize(300, 500);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
