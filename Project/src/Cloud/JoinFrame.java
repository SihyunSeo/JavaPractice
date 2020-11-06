package Cloud;

import java.awt.*;
import javax.swing.*;
import javax.swing.border.EmptyBorder;
import java.awt.event.*;
import java.io.BufferedWriter;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.FileWriter;
import java.io.IOException;

	public class JoinFrame extends JFrame {

		private JPanel contentPane;
		private JLabel Join;
		private JButton joinComplete;
		private JTextField N_ID;
		private JTextField N_Password;
		private JTextField N_Name;
		private JTextField N_Email;
		private JTextField N_Phone;

		public JoinFrame() {
			setTitle("Sign up");
			setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
			setSize(430, 490);
			setLocationRelativeTo(null);
			contentPane = new JPanel();
			contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
			setContentPane(contentPane);
			contentPane.setLayout(null);
			
			Join = new JLabel("회원가입");
			Font f1 = new Font("돋움", Font.BOLD, 20); //궁서 바탕 돋움
			Join.setFont(f1); 
			Join.setBounds(159, 41, 101, 20);
			contentPane.add(Join);
			
			JLabel Id = new JLabel("password");
			Id.setBounds(69, 163, 69, 20);
			contentPane.add(Id);
			
			JLabel label = new JLabel("ID");
			label.setBounds(69, 113, 69, 20);
			contentPane.add(label);
			
			JLabel Name = new JLabel("Name");
			Name.setBounds(69, 210, 69, 20);
			contentPane.add(Name);
			
			JLabel Email = new JLabel("Email");
			Email.setBounds(69, 257, 69, 20);
			contentPane.add(Email);
			
			JLabel Phone = new JLabel("Phone");
			Phone.setBounds(69, 304, 69, 20);
			contentPane.add(Phone);
			
			N_ID = new JTextField();
			N_ID.setColumns(10);
			N_ID.setBounds(159, 106, 186, 35);
			contentPane.add(N_ID);
			
			N_Password = new JTextField();
			N_Password.setColumns(10);
			N_Password.setBounds(159, 156, 186, 35);
			contentPane.add(N_Password);
			
			N_Name = new JTextField();
			N_Name.setColumns(10);
			N_Name.setBounds(159, 203, 186, 35);
			contentPane.add(N_Name);
			
			N_Email = new JTextField();
			N_Email.setColumns(10);
			N_Email.setBounds(159, 250, 186, 35);
			contentPane.add(N_Email);
			
			N_Phone = new JTextField();
			N_Phone.setColumns(10);
			N_Phone.setBounds(159, 297, 186, 35);
			contentPane.add(N_Phone);
			
			joinComplete = new JButton("회원가입완료");
			joinComplete.setBounds(206, 363, 139, 29);
			contentPane.add(joinComplete);
			
			setVisible(true);
			
			//회원가입 후 정보 저장 및 완료 메세지 표출
			joinComplete.addActionListener(new ActionListener() {
			
			public void actionPerformed(ActionEvent T) {
				String id = N_ID.getText() + "/";
				String password = N_Password.getText() + "/";
				String name = N_Name.getText() + "/";
				String email = N_Email.getText() + "/";
				String phone = N_Phone.getText() + "\r\n";
				
				String inform = id + password + name + email + phone;
				
				try {
					BufferedWriter bos = new BufferedWriter(new FileWriter("회원정보.txt", true));
					
					SaveFile("C:\\Users\\Sihyun\\Desktop\\gitPractice\\JavaPractice\\Project\\회원정보.txt",inform);
					JOptionPane.showMessageDialog(null, "회원가입이 완료되었습니다.");
					dispose();
				}catch (Exception ex) {
					JOptionPane.showMessageDialog(null, "회원가입에 실패하였습니다.");
				}
			}
			public void SaveFile(String path,String content) {
				FileOutputStream opStream;
				try {
					opStream = new FileOutputStream(path);
					try {
						opStream.write(content.getBytes());
					} catch (IOException e) {
						e.printStackTrace();
					}
				} catch (FileNotFoundException e) {
					e.printStackTrace();
				}
				
			}
			});
		}
	}

