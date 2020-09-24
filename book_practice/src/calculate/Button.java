package calculate;
import javax.swing.*;
import java.awt.*;


public class Button extends JFrame {
	JPanel p1, p2, p3, p4, p5;
	JPanel panel;
	JButton bOn, bOff, bPlus, bMinus, bMulti, bDiv, bDot, bCal, num1, num2, num3, num4, num5, num6, num7, num8, num9, num0;
	Button(JFrame frame){
		bOn = new JButton("on");
		bOff = new JButton("off");
		bPlus = new JButton("+");
		bMinus = new JButton("-");
		bMulti = new JButton("x");
		bDiv = new JButton("¡À");
		bDot = new JButton(".");
		bCal = new JButton("=");
		num1 = new JButton("1");
		num2 = new JButton("2");
		num3 = new JButton("3");
		num4 = new JButton("4");
		num5 = new JButton("5");
		num6 = new JButton("6");
		num7 = new JButton("7");
		num8 = new JButton("8");
		num9 = new JButton("9");
		num0 = new JButton("0");
		
		bMinus.setPreferredSize(new Dimension(42, 28));
		bDot.setPreferredSize(new Dimension(42, 28));
		bDiv.setPreferredSize(new Dimension(42, 28));
		bMulti.setPreferredSize(new Dimension(42, 28));
		
		p1 = new JPanel();
		p2 = new JPanel();
		p3 = new JPanel();
		p4 = new JPanel();
		p5 = new JPanel();
		panel = new JPanel(new GridLayout(5, 0));
		
		p1.add(bOn);
		p1.add(bOff);
		
		p2.add(num7);
		p2.add(num8);
		p2.add(num9);
		p2.add(bPlus);
		
		p3.add(num4);
		p3.add(num5);
		p3.add(num6);
		p3.add(bMinus);
		
		p4.add(num1);
		p4.add(num2);
		p4.add(num3);
		p4.add(bMulti);
		
		p5.add(num0);
		p5.add(bDot);
		p5.add(bCal);
		p5.add(bDiv);
		
		panel.add(p1);
		panel.add(p2);
		panel.add(p3);
		panel.add(p4);
		panel.add(p5);
		frame.add(panel, BorderLayout.CENTER);
		
	}
}
