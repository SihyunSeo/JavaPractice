package New_gui;
import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
public class ServerRoot extends JFrame implements ActionListener{
	JLabel folderRoot, mainFile;
	JPanel folder, file, run, north;
	JTextField folderTf, fileTf;
	JButton folderB, fileB, runB;
	ServerRoot()
	{
		setLayout(new BorderLayout());
		setTitle("Server");
		setSize(300, 150);
		setResizable(false);
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		north = new JPanel(new GridLayout(2,0));
		folder = new JPanel();
		file = new JPanel();
		run = new JPanel(new GridLayout(1, 2));
		
		folderRoot = new JLabel("서버폴더");
		mainFile = new JLabel("기본페이지");
		
		folderTf = new JTextField(15);
		fileTf = new JTextField(14);
		
		folderB = new JButton("찾기");
		fileB = new JButton("찾기");
		runB = new JButton("실행");
		
		folder.add(folderRoot);
		folder.add(folderTf);
		folder.add(folderB);
		
		file.add(mainFile);
		file.add(fileTf);
		file.add(fileB);
		
		run.add(new JPanel());
		run.add(runB);
		
		north.add(folder);
		north.add(file);
		
		this.add(north, BorderLayout.NORTH);
		this.add(run, BorderLayout.SOUTH);
		setVisible(true);
	}
	@Override
	public void actionPerformed(ActionEvent e) {
		
		
	}
}
