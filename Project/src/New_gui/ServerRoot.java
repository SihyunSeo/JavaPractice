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
      setResizable(true);
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
         folderTf.setText(folderPath);
      }
      else if(e.getSource() == fileB)
      {
         mainFile();
         fileTf.setText(fileName);
      }
      else if(e.getSource() == runB)
      { 
    	 
         if(b.getText().equals("실행"))
         {
        	folderTf.setEditable(false);
        	fileTf.setEditable(false);
        	folderB.setEnabled(false);
        	fileB.setEnabled(false);
            b.setText("종료");
         }
         else if(b.getText().equals("종료"))
         {
        	folderTf.setEditable(true);
         	fileTf.setEditable(true);
         	folderB.setEnabled(true);
         	fileB.setEnabled(true);
        	b.setText("실행");
         }
      }
   }
   
   public void fileRoot()
   {
      JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      chooser.setCurrentDirectory(new File("/"));
      chooser.setAcceptAllFileFilterUsed(true);
      chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter 확장자 추가
        chooser.setFileFilter(filter); // 파일 필터를 추가
        int returnVal = chooser.showOpenDialog(null); // 열기용 창 오픈
        
        if(returnVal == JFileChooser.APPROVE_OPTION) 
        { // 열기를 클릭 
            folderPath = chooser.getSelectedFile().toString();
        }
        else if(returnVal == JFileChooser.CANCEL_OPTION)
        { // 취소를 클릭
            folderPath = "";
        }
   }
   public void mainFile()
   {
      JFileChooser chooser = new JFileChooser(FileSystemView.getFileSystemView().getHomeDirectory());
      chooser.setCurrentDirectory(new File("" + folderTf.getText()));
      chooser.setAcceptAllFileFilterUsed(true);
      chooser.setFileSelectionMode(JFileChooser.FILES_AND_DIRECTORIES);
      //FileNameExtensionFilter filter = new FileNameExtensionFilter("Binary File", "cd11"); // filter 확장자 추가
        //chooser.setFileFilter(filter); // 파일 필터를 추가
        int returnVal = chooser.showOpenDialog(null); // 열기용 창 오픈
        
        if(returnVal == JFileChooser.APPROVE_OPTION) 
        { // 열기를 클릭 
            fileName = chooser.getSelectedFile().getName();
        }
        else if(returnVal == JFileChooser.CANCEL_OPTION)
        { // 취소를 클릭
            fileName = "";
        }
   }
}