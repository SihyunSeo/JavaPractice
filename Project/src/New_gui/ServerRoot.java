package New_gui;
import javax.swing.*;
import javax.swing.filechooser.FileNameExtensionFilter;
import javax.swing.filechooser.FileSystemView;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
public class ServerRoot extends JFrame implements ActionListener{
   JLabel folderRoot, mainFile;
   JPanel folder, file, run, north;
   JTextField folderTf, fileTf;
   JButton folderB, fileB, runB;
   String folderPath = "", fileName = "";
   ServerRoot()
   {
      setLayout(new BorderLayout());
      setTitle("Server");
      setSize(350, 150);
      setResizable(false);
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      
      north = new JPanel(new GridLayout(2,0));
      folder = new JPanel();
      file = new JPanel();
      run = new JPanel(new GridLayout(1, 2));
      
      folderRoot = new JLabel("��������");
      mainFile = new JLabel("�⺻������");
      
      folderTf = new JTextField(15);
      fileTf = new JTextField(14);
      
      folderB = new JButton("ã��");
      fileB = new JButton("ã��");
      runB = new JButton("����");
      
      folderB.addActionListener(this);
      fileB.addActionListener(this);
      runB.addActionListener(this);
      
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
      JButton b = (JButton)e.getSource();
      if(e.getSource() == folderB)
      {
         fileRoot();
      }
      else if(e.getSource() == fileB)
      {
         mainFile();
      }
      else if(e.getSource() == runB)
      {
         folderTf.setText(folderPath);
         fileTf.setText(fileName);
         if(b.getText().equals("����"))
         {
            b.setText("����");
         }
         else if(b.getText().equals("����"))
         {
            System.exit(0);
         }
      }
   }
   
   public void fileRoot()
   {
      JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      chooser.setCurrentDirectory(new File("/"));
      chooser.setAcceptAllFileFilterUsed(true);
      chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter Ȯ���� �߰�
        chooser.setFileFilter(filter); // ���� ���͸� �߰�
        int returnVal = chooser.showOpenDialog(null); // ����� â ����
        
        if(returnVal == JFileChooser.APPROVE_OPTION) 
        { // ���⸦ Ŭ�� 
            folderPath = chooser.getSelectedFile().toString();
        }
        else if(returnVal == JFileChooser.CANCEL_OPTION)
        { // ��Ҹ� Ŭ��
            folderPath = "";
        }
   }
   public void mainFile()
   {
      JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      chooser.setCurrentDirectory(new File("/"));
      chooser.setAcceptAllFileFilterUsed(true);
      chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter Ȯ���� �߰�
        chooser.setFileFilter(filter); // ���� ���͸� �߰�
        int returnVal = chooser.showOpenDialog(null); // ����� â ����
        
        if(returnVal == JFileChooser.APPROVE_OPTION) 
        { // ���⸦ Ŭ�� 
            fileName = chooser.getSelectedFile().getName();
        }
        else if(returnVal == JFileChooser.CANCEL_OPTION)
        { // ��Ҹ� Ŭ��
            fileName = "";
        }
   }
}