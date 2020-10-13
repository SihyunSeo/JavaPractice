package Web_gui;
import javax.swing.*;
import java.awt.event.*;
import java.io.*;
import java.net.Socket;
import java.awt.*;

public class ServerGUI extends JFrame {
	private Socket cSocket;
	private String serverFolder;
	
	JTextField tf = new JTextField(20);
	JTextField tf1 = new JTextField(20);
	JTextArea ta = new JTextArea(10, 20); 
	JTextArea ta1 = new JTextArea(10, 20);
	
	
	ServerGUI() {
		setTitle("Embedded Lab");
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		Container c = getContentPane();
		c.setLayout(new FlowLayout());
		c.add(new JLabel("파일 경로를 설정해주세요."));
		c.add(tf);
		c.add(new JScrollPane(ta));
		
		Container b = getContentPane();
		b.setLayout(new FlowLayout());
		b.add(new JLabel("메인 파일을 입력해주세요."));
		b.add(tf1);
		b.add(new JScrollPane(ta1));
		
		event();
		event1();
		
		setSize(300,550);
		setVisible(true);
	}
	
	void event()
	{
		tf.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t1 = (JTextField)e.getSource();
				ta.append(t1.getText());
				String path = ta.getText();
				ta.append("\n");
				t1.setText("");
				
				Server server = new Server(80, path);
				server.start();
			}
		});
		
	}
	
	void event1()
	{
		tf1.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t2 = (JTextField)e.getSource();
				ta1.append(t2.getText());
				String path = ta1.getText();
				ta1.append("\n");
				t2.setText("");

			}
		});
	}

	public String getServerFolder()
	{
		byte[] root = new byte[2048];
		FileInputStream opStream;
		try {
			opStream = new FileInputStream("C:\\Users\\user\\Desktop\\Web Server (2)");
			
			try {
				opStream.read(root);
			} catch (IOException e) {
				e.printStackTrace();
			}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		
		return new String(root);
	}
}
	
	/*void new_event()
	{
		button_add.addActionListener(new ActionListener() {
			public void actionPerformed(ActionEvent e) {
				JTextField t2 = (JTextField)e.getSource();
				ta.append(t2.getText() + "\n");
				t2.setText("");
			}
		});
	}*/
	/*public static void main(String [] args) {
		new ServerGUI();
		System.out.println();
	}*/

