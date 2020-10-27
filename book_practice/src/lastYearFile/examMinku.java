package lastYearFile;
/*
16422048 �ΰ����ɼ���Ʈ���� ���α� 
 19.12.19 made by Koo Minku 
 JAVA Programming Final Exam
 */

import java.awt.BorderLayout;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.lang.Thread;
import javax.swing.*;

//������� �� ������� ���� ����� ���ÿ� ���� ���� Ȯ���߽��ϴ�.
//GUI, ��������� �����߰�, �÷��� �����ӿ�ũ �Ƚ���ϴ�. 

public class examMinku extends JFrame implements Runnable{
   private JTextField show_result = new JTextField(20);
   // show result�� GUI ��� ��� â
   //alpha�� �ؽ�Ʈ ���Ͽ��� �о�� ���ĺ� ���ڿ�, check�� alpha�� ����Ͽ� ���� ���� �����
   public static String alpha="", check="";
   
   //GUI ����
   examMinku(){
      setTitle("Final Exam");
      
      JPanel p1 = new JPanel();
      JPanel p2 = new JPanel();
      
      JButton bt_data = new JButton("������ �ҷ�����");
      JButton bt_make = new JButton("ó��");
      JButton bt_print = new JButton("��� ���");
      setLayout(new GridLayout(2,0));
      
      add(p1);
      p1.setLayout(new GridLayout(3,0,10,5));
      p1.add(bt_data);
      p1.add(bt_make);
      p1.add(bt_print);
      
      add(p2);
      p2.add(show_result, BorderLayout.CENTER);
      
      show_result.setText("�޽��� ���");
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300,200);
      setVisible(true);
      
      //��ưŬ�� ������
      bt_click clicked = new bt_click();
      bt_data.addActionListener(clicked);
      bt_make.addActionListener(clicked);
      bt_print.addActionListener(clicked);
   }
   
   //��ư Ŭ�� Ŭ���� 
   class bt_click implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method stub
         JButton btn = (JButton) e.getSource();
         String btn_name = btn.getText();
         
         if(btn_name == "������ �ҷ�����") {
            alpha = file_in();
            System.out.println(alpha);
            show_result.setText("������ ���������� �ҷ��Խ��ϴ�.");
         }
         else if(btn_name == "ó��") {
            check = string_run(alpha);
            if (check == "err")
               show_result.setText("���� ���� - NG");
            else
               show_result.setText("���� ó�� ����");
         }
         //��� ���
         else {
            if(check != "err")
               file_out(check.replace('/', ' '));
            else
               file_out("NG");
            
            System.out.println(check);
            if (check == "err")
               show_result.setText("���� ����");
            else
               show_result.setText(check.replace('/', ' '));
         }
      }
   };
   
   //�ؽ�Ʈ ������ ����Ͽ� ����� ��� / ������ ������ ����ǥ��
   public static String string_run(String str) {
      int i=0, num_c =0, num_b =0;
      //Cc �����
      while(i < str.length()) {
         if(str.charAt(i) == 'C'){
            //C���� c�� ���� �� ���� ����� ���� ���� �߰�
            if(str.charAt(i+1) == 'c') {
               str = str.substring(0,i)+str.substring(i+2);
               i--;
               num_c ++;
            }
            else
               return "err";
         }
         i++;
      }
      
      i=0;
      System.out.println(str);
      // Bb����� 
      while(i < str.length()) {
         if(str.charAt(i) == 'B'){
            //B���� b�� ���� �� ���� ����� ���� ���� �߰�
            if(str.charAt(i+1) == 'b') {
               str = str.substring(0,i)+str.substring(i+2);
               i--;
               num_b ++;
            }
            else
               return "err";
         }
         i++;
      }
      
      //���� ���� Aa�� ��� ����
      if(str.equals("Aa")) {
         // ���ڿ��� '/'�� �����Ͽ� �� �� , ���� ��, ���� ���� �������� ���ڿ��� ��ȯ
         String result = "1/"+Integer.toString(num_b)+"/"+Integer.toString(num_c);
         System.out.println("no error");
         return result;
      }
      else
         return "err";
   }
   
   //���� �б�, �ѹ��ھ� �޾Ƽ� ��� ���ڿ��� ��Ƽ� ��ȯ
   public static String file_in() {
      String result="";
      try{
         File file = new File("C:\\\\Java_Pro\\\\Java_Class\\\\src\\\\class2\\\\tag.in.txt");
            FileReader filereader = new FileReader(file);
            int singleCh = 0;
            
            while((singleCh = filereader.read()) != -1){
               //�빮��
                if((int)singleCh >=65 && (int)singleCh<=67 )
                   result+= (char)singleCh;
                //�ҹ���
                else if((int)singleCh >=97 && (int)singleCh<=99)
                   result+= (char)singleCh;
            }
            filereader.close();
         } catch (IOException e) {
            // TODO Auto-generated catch block
            e.printStackTrace();
            System.out.println("no file");
            return "no file";
         }
      return result;
   }
   
   //���� �Է�
   public static int file_out(String str) {
       File file = new File("C:\\\\Java_Pro\\\\Java_Class\\\\src\\\\class2\\\\tag.out.txt");
          try {
            FileWriter fw = new FileWriter(file);
            fw.write(str);
            System.out.println("�Է� ����");
              fw.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
      return 0;
   }

   public static void main(String[] args) {
      new examMinku();
      //������ ����
      examMinku thr = new examMinku();
      Thread th = new Thread(thr);
      th.start();
   }
   
   // ������ ���� �Լ�
   @Override
   public void run() {
      //GUI ��°� ���ÿ� ������ ���� ���, ��� ��� ȭ�鿡 ���� �޽��� ǥ��
      String err_check = file_in();
      if (err_check == "no file") {
         show_result.setText("���� �����ϴ�.");
         System.out.println("error: no file");
      }
      
      try {
         for(int i=0; i<5; i++) {
            Thread.sleep(200);
            System.out.println("������ ���� ���Դϴ�.");
         }
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

}