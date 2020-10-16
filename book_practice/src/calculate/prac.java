package calculate;
import javax.swing.*;


import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.ArrayList;


public class prac extends JFrame {
   JPanel displayPanel;
   JButton btnOn;
   JButton btnOff;
   JTextField display;
   private ArrayList<String> equation = new ArrayList<String>();
   private String num = "";
   private String prev_operation ="";
   prac() {


     displayPanel = new JPanel();
     displayPanel.setLayout(new FlowLayout());
     display = new JTextField(17);
     displayPanel.add(display);
      JPanel buttonPanel = new JPanel();
      JPanel buttonPanel2 = new JPanel();
      
      
      buttonPanel.setLayout(new GridLayout(5, 5, 5, 5));
      buttonPanel.setBounds(14, 103, 250, 235);
    
      btnOff = new JButton("off");
      btnOn = new JButton("on");
      String button_names[] = {"7", "8", "9", "+", "4", "5", "6", "-", "1", "2", "3", "X","0", ".", "=", "÷"};
      JButton buttons[] = new JButton[button_names.length];
      
      for (int i = 0; i < button_names.length; i++) {
         buttons[i] = new JButton(button_names[i]);
         buttons[i].addActionListener(new PadActionListener());
         btnOn.addActionListener(new PadActionListener());
         btnOff.addActionListener(new PadActionListener());
         buttonPanel.add(buttons[i]);
      }
         

      
         this.getContentPane().add(btnOff);
         this.getContentPane().add(btnOn);
         btnOff.setBounds(150, 60, 60, 35);
         btnOn.setBounds(80, 60, 60, 35);
         this.add(displayPanel, BorderLayout.NORTH);
         add(buttonPanel);
         add(buttonPanel2);
         setTitle("계산기");
         setVisible(true);
         setSize(300, 400);
         setResizable(true);
         setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
         
   }// Gui 객체 생성 끝
      class PadActionListener implements ActionListener {
         public void actionPerformed(ActionEvent e) {
            String operation = e.getActionCommand();
             if (operation.equals("off")) 
             {
                display.setText("");

             } 
             else if (operation.equals("=")) 
             {
                String result = Double.toString(calculate(display.getText()));
                display.setText("" + result);
                num ="";
             }
             else if (operation.equals("+") || operation.equals("-") || operation.equals("X") || operation.equals("÷")) 
             {
                if (display.getText().equals("") && operation.equals("-")) 
                {
                  display.setText(display.getText() + e.getActionCommand());
                } 
                else if (!display.getText().equals("") && !prev_operation.equals("+") && !prev_operation.equals("-") && !prev_operation.equals("x") && ! prev_operation.equals("÷"))
                {
                  display.setText(display.getText() + e.getActionCommand());
                }
             } 
             else 
             {
                display.setText(display.getText() + e.getActionCommand());
             }
             prev_operation = e.getActionCommand();
             if (e.getSource() == btnOn) {
                display.setText("On버튼을 클릭하셨습니다.");

             }
             
         } 
      }
      private void fullTextParsing(String inputText) {
         equation.clear();
         
         for(int i = 0; i < inputText.length(); i++) {
            char ch = inputText.charAt(i);
            
            if  (ch == '-' || ch == '+' || ch == 'X' || ch == '÷' ) {
               equation.add(num);
               num = "";
               equation.add(ch +  "");
            } else {
               num = num + ch;
            }
         }
         equation.add(num);
         equation.remove("");
      }
         public double calculate(String inputText) {
            fullTextParsing(inputText);
            
            double prev = 0;
            double current = 0;
            String mode = "";
            
            for (String s : equation) {
               if (s.equals("+")) {
                  mode = "add";
               } else if (s.equals("-")) {
                   mode = "sub";
               } else if (s.equals("X")) {
                  mode = "mul";
               } else if (s.equals("÷")) {
                  mode = "div";
               } else {
                  current = Double.parseDouble(s);
                  if (mode == "add") {
                     prev += current;
                  } else if (mode == "sub") {
                     prev -= current;
                  } else if (mode == "mul") {
                     prev *= current;
                  } else if (mode == "div") {
                     prev /= current;
                  } else {
                     prev = current;
                  }
               }
               prev = Math.round(prev * 100000) / 100000.0;
         
            }
            return prev;
         }

               
         
      
      
   
      
         
   public static void main(String[] args) {
      new prac();
   }      
   }