package lastYearFile;
/*
16422048 인공지능소프트웨어 구민구 
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

//스레드는 뭘 사용할지 몰라서 실행과 동시에 파일 유무 확인했습니다.
//GUI, 파일입출력 구현했고, 컬랙션 프레임워크 안썼습니다. 

public class examMinku extends JFrame implements Runnable{
   private JTextField show_result = new JTextField(20);
   // show result는 GUI 결과 출력 창
   //alpha는 텍스트 파일에서 읽어온 알파벳 문자열, check는 alpha를 계산하여 나온 최종 결과값
   public static String alpha="", check="";
   
   //GUI 생성
   examMinku(){
      setTitle("Final Exam");
      
      JPanel p1 = new JPanel();
      JPanel p2 = new JPanel();
      
      JButton bt_data = new JButton("데이터 불러오기");
      JButton bt_make = new JButton("처리");
      JButton bt_print = new JButton("결과 출력");
      setLayout(new GridLayout(2,0));
      
      add(p1);
      p1.setLayout(new GridLayout(3,0,10,5));
      p1.add(bt_data);
      p1.add(bt_make);
      p1.add(bt_print);
      
      add(p2);
      p2.add(show_result, BorderLayout.CENTER);
      
      show_result.setText("메시지 출력");
      
      setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
      setSize(300,200);
      setVisible(true);
      
      //버튼클릭 리스너
      bt_click clicked = new bt_click();
      bt_data.addActionListener(clicked);
      bt_make.addActionListener(clicked);
      bt_print.addActionListener(clicked);
   }
   
   //버튼 클릭 클래스 
   class bt_click implements ActionListener {
      @Override
      public void actionPerformed(ActionEvent e) {
         // TODO Auto-generated method stub
         JButton btn = (JButton) e.getSource();
         String btn_name = btn.getText();
         
         if(btn_name == "데이터 불러오기") {
            alpha = file_in();
            System.out.println(alpha);
            show_result.setText("파일을 성공적으로 불러왔습니다.");
         }
         else if(btn_name == "처리") {
            check = string_run(alpha);
            if (check == "err")
               show_result.setText("파일 오류 - NG");
            else
               show_result.setText("파일 처리 성공");
         }
         //결과 출력
         else {
            if(check != "err")
               file_out(check.replace('/', ' '));
            else
               file_out("NG");
            
            System.out.println(check);
            if (check == "err")
               show_result.setText("파일 오류");
            else
               show_result.setText(check.replace('/', ' '));
         }
      }
   };
   
   //텍스트 파일을 계산하여 결과값 출력 / 에러가 있으면 에러표시
   public static String string_run(String str) {
      int i=0, num_c =0, num_b =0;
      //Cc 지우기
      while(i < str.length()) {
         if(str.charAt(i) == 'C'){
            //C다음 c가 오면 두 값을 지우고 문장 개수 추가
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
      // Bb지우기 
      while(i < str.length()) {
         if(str.charAt(i) == 'B'){
            //B다음 b가 오면 두 값을 지우고 문단 개수 추가
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
      
      //최종 값이 Aa일 경우 성공
      if(str.equals("Aa")) {
         // 문자열에 '/'를 삽입하여 글 수 , 문단 수, 문장 수를 구분지어 문자열로 반환
         String result = "1/"+Integer.toString(num_b)+"/"+Integer.toString(num_c);
         System.out.println("no error");
         return result;
      }
      else
         return "err";
   }
   
   //파일 읽기, 한문자씩 받아서 영어만 문자열로 모아서 반환
   public static String file_in() {
      String result="";
      try{
         File file = new File("C:\\\\Java_Pro\\\\Java_Class\\\\src\\\\class2\\\\tag.in.txt");
            FileReader filereader = new FileReader(file);
            int singleCh = 0;
            
            while((singleCh = filereader.read()) != -1){
               //대문자
                if((int)singleCh >=65 && (int)singleCh<=67 )
                   result+= (char)singleCh;
                //소문자
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
   
   //파일 입력
   public static int file_out(String str) {
       File file = new File("C:\\\\Java_Pro\\\\Java_Class\\\\src\\\\class2\\\\tag.out.txt");
          try {
            FileWriter fw = new FileWriter(file);
            fw.write(str);
            System.out.println("입력 성공");
              fw.close();
          } catch (IOException e) {
            e.printStackTrace();
          }
      return 0;
   }

   public static void main(String[] args) {
      new examMinku();
      //스레드 실행
      examMinku thr = new examMinku();
      Thread th = new Thread(thr);
      th.start();
   }
   
   // 스레드 실행 함수
   @Override
   public void run() {
      //GUI 출력과 동시에 파일이 없을 경우, 결과 출력 화면에 오류 메시지 표시
      String err_check = file_in();
      if (err_check == "no file") {
         show_result.setText("파일 없습니다.");
         System.out.println("error: no file");
      }
      
      try {
         for(int i=0; i<5; i++) {
            Thread.sleep(200);
            System.out.println("스레드 실행 중입니다.");
         }
      } catch (InterruptedException e) {
         e.printStackTrace();
      }
   }

}