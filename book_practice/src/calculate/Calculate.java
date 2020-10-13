package calculate;
import javax.swing.*;
import java.awt.*;
public class Calculate extends JFrame {
	Calculate(){
		JFrame frame = new JFrame();
		frame.setTitle("°è»ê±â");
		frame.setLayout(new BorderLayout());
		Top top = new Top(frame);
		Button button = new Button(frame);
		frame.setSize(250, 300);
		//frame.setResizable(false);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		frame.setVisible(true);
	}
}
