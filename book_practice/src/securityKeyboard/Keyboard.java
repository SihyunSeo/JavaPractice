package securityKeyboard;
import javax.swing.*;
import javax.swing.border.Border;

import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;
import java.util.Arrays;
import java.util.Collections;
import java.util.Random;
public class Keyboard extends JFrame implements ActionListener{
	JTextField randomNum, inputNum;
	int count = 0, numIndex = 0;
	
	Keyboard(){ //생성자
		JFrame frame = new JFrame();
		frame.setLayout(new BorderLayout()); //전체적인건 BorderLayout을 사용하였습니다.
		frame.setSize(300,400);
		frame.setResizable(true);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);

		JPanel north = new JPanel(new GridLayout(2, 0)); //맨위 텍스트 박스 두개에 GridLayout을 사용하였습니다.
		JPanel center = new JPanel(new GridLayout(4, 4, 10, 10)); //가운데 버튼들에 GridLayout을 사용하였습니다.
		JPanel south = new JPanel(new GridLayout(1, 2, 10, 10)); //입력완료버튼에 GridLayout을 사용하였습니다.
		
		Font font = new Font("돋움체", 1, 20); //랜덤한 숫자의 크기와 굵기를 설정하였습니다.
		randomNum = new JTextField(20);
		randomNum.setFont(font);
		randomNum.setBackground(new Color(0xAECDFF));
		randomNum.setHorizontalAlignment(JTextField.CENTER);
		randomNum.setText(numberGen());
		inputNum = new JTextField("보안 문자를 입력하세요.",20);
		inputNum.setBackground(new Color(0xAECDFF));
		inputNum.setHorizontalAlignment(JTextField.CENTER);
		
		String[] num = {"1", "2", "3", "4", "5", "6", "7", "8", "9", "0", "<html>전체<br>지움</html>", "<html>하나<br>지움</html>"}; //버튼생성을 위한 배열
		Collections.shuffle(Arrays.asList(num)); //배열 랜덤으로 섞기
		String[] line = {"0", "1", "2", "3"}; //빈칸 버튼의 위치를 설정하기 위한 배열
		Collections.shuffle(Arrays.asList(line)); //배열 랜덤으로 섞기
		JButton[] number = new JButton[12];
		JButton[] blankB = new JButton[4];
		for(int i = 0; i < line.length; i ++)
		{
			for(int j = 0; j < line.length; j ++)
			{	
				if(Integer.toString(j).equals(line[count]))
				{
					blankB[i] = new JButton("빈칸");
					blankB[i].setBackground(new Color(0xACF3FF));
					center.add(blankB[i]);
				}
				else 
				{
					number[numIndex] = new JButton(num[numIndex]);
					number[numIndex].setBackground(new Color(0xACF3FF));
					center.add(number[numIndex]);
					number[numIndex].addActionListener(this);
					numIndex ++;
				}
			}
			count++;
		}	
		JButton check = new JButton("입력완료");
		check.setBackground(new Color(0xFFB788));
		check.addActionListener(this);
		south.add(new Panel());
		south.add(check);
		
		north.add(randomNum);
		north.add(inputNum);
		
		frame.add(north, BorderLayout.NORTH);
		frame.add(center, BorderLayout.CENTER);
		frame.add(south, BorderLayout.SOUTH);
		frame.setVisible(true);
	}
		
	public String numberGen()//랜덤한 숫자를 생성하여 반환하는 메서드입니다.
	{
		Random rand = new Random();
		String numStr = "";
		for(int i = 0; i < 6; i ++)
		{
			String ran = Integer.toString(rand.nextInt(10));
			numStr += ran;
		}
		return numStr;
	}

	@Override
	public void actionPerformed(ActionEvent e)//이벤트리스너
	{
		String buttonStr = e.getActionCommand();
		if(inputNum.getText().equals("보안 문자를 입력하세요.") || inputNum.getText().equals("잘못 입력하였습니다.") || inputNum.getText().equals("잠금이 해제되었습니다."))
		{//inputNum 텍스트필드에 메세지가 출력되있는 상황에서의 버튼 기능
			if(!buttonStr.equals("<html>하나<br>지움</html>") && !buttonStr.equals("입력완료") && !buttonStr.equals("<html>전체<br>지움</html>")) //첫숫자를 입력하기 위한 조건
			{
				inputNum.setText("");
				inputNum.setText(inputNum.getText() + buttonStr);
			}
			else if(buttonStr.equals("<html>하나<br>지움</html>")) //숫자가 아닌 메세지가 출력된 상태에서의 하나지움 버튼의 기능
			{
				inputNum.setText(inputNum.getText());// inputNum텍스트필드의 메세지를 유지한다.
			}
			else if(buttonStr.equals("<html>전체<br>지움</html>")) //숫자가 아닌 메세지가 출력된 상태에서의 전체지움 버튼의 기능
			{
				inputNum.setText("");//inputNum텍스트필드를 초기화 한다.
			}
			else if(buttonStr.equals("입력완료"))
			{
				if(inputNum.getText().equals(randomNum.getText()))
				{
					inputNum.setText("잠금이 해제되었습니다.");
				}
				else
				{
					inputNum.setText("잘못 입력하였습니다.");
				}
			}
		}
		else//inputNum텍스트필드에 메세지가 아닌 숫자가 입력되어있을때 버튼의 기능
		{
			if(buttonStr.equals("<html>하나<br>지움</html>"))
			{
				if(inputNum.getText().equals("") || inputNum.getText().equals("보안 문자를 입력하세요.") || inputNum.getText().equals("잘못 입력하였습니다.") || inputNum.getText().equals("잠금이 해제되었습니다."))
				{
					inputNum.setText(inputNum.getText()); //inputNum텍스트필드에 메세지 혹은 빈칸일때의 하나지움버튼의 기능
				}
				else
				{
					inputNum.setText(inputNum.getText().substring(0, inputNum.getText().length()-1)); //inputNum텍스트필드에 숫자가 입력되어있을시 마지막 숫자 제거
				}
			}
			else if(buttonStr.equals("입력완료"))
			{
				if(inputNum.getText().equals(randomNum.getText())) //inputNum텍스트필드의 값과 randomNum텍스트 필드의 값을 비교 후 메세지 출력
				{
					inputNum.setText("잠금이 해제되었습니다.");
				}
				else
				{
					inputNum.setText("잘못 입력하였습니다.");
				}
			}
			else if(buttonStr.equals("<html>전체<br>지움</html>"))
			{
				inputNum.setText("");
			}
			else
			{
				inputNum.setText(inputNum.getText() + buttonStr);//숫자 버튼을 눌렀을시 버튼의 기능
			}
		}
	}
}
