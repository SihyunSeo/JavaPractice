package lastYearFile;

import java.util.List;
import java.util.ArrayList;
import java.util.Stack;

import javax.swing.JFrame;
import javax.swing.JButton;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextArea;
import javax.swing.JTextField;
import javax.swing.JComboBox;

import java.awt.BorderLayout;
import java.awt.Dimension;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import java.text.DecimalFormat;


public class mealTicket extends JFrame{
	private String[] price = {"5000", "3000", "4000"};//메뉴들의 금액 배열
	private int[] whole_count = {1, 1, 1};//메뉴들의 초기 개수 배열
	private int now_count = 1;//현재 수량 필드
	private int now_price = 5000;//초기 가격 필드
	
	//생성자
	mealTicket(){
		setTitle("식권 판매기");
		setLayout(new BorderLayout());//전체적인건 border 레이아웃 사용

		JPanel north_panel = new JPanel();
		JPanel center_panel = new JPanel(new GridLayout(3, 2, 10, 10));//밑에 버튼들에 그리드 레이아웃 사용
		JPanel count_panel = new JPanel(new GridLayout(1, 3));//수량 버튼에 그리드 레이아웃 사용
		JPanel south_panel = new JPanel();
		
		JTextArea input_order_box = new JTextArea(5, 24);
		
		input_order_box.setText(
				"돈가스 1개\n김치찌개 1개\n정식 1개"
				);//초기 주문 내용
		
		input_order_box.setSize(100, 100);

		
		JLabel whole_money = new JLabel("총  액");
		JTextField whole_money_text = new JTextField("12000원");//초기 총액(기본적으로 개수가 1이라서)
		
		JLabel input_money = new JLabel("투입금액");
		JTextField input_money_text = new JTextField("");
		
		whole_money.setHorizontalAlignment(JLabel.CENTER);
		whole_money_text.setHorizontalAlignment(JTextField.CENTER);
		input_money.setHorizontalAlignment(JLabel.CENTER);
		input_money_text.setHorizontalAlignment(JTextField.CENTER);
		
		
		String[] sMenus = {"돈가스", "김치찌개", "정식"};//메뉴 목록
		
		JComboBox<String> combo_box = new JComboBox<>(sMenus);//콤보박스

		
		JTextField count_text = new JTextField(String.valueOf(now_count));
		count_text.setHorizontalAlignment(JTextField.CENTER);
		
		
		combo_box.addItemListener(e -> {//콤보박스 이벤트
			int index = ((JComboBox) combo_box).getSelectedIndex();
			
			now_count = whole_count[index];
			count_text.setText( String.valueOf(now_count) );
			
			now_price = Integer.parseInt(price[index]);
		});
		
		//이벤트리스너
		ActionListener action_l = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String item = e.getActionCommand();
				
				if(item.equals("<")) {//수량을 줄일 경우
					if(now_count > 0) {//0개 이상일 경우만 작동함 (마이너스 개수는 없으므로)
						int index = ((JComboBox) combo_box).getSelectedIndex();
						
						whole_count[index]--;
						now_count--;
						
						count_text.setText( String.valueOf(now_count) );
						
						int nResult = 0;
						for(int i=0 ; i<3 ; i++) 
							nResult += whole_count[i] * Integer.parseInt(price[i]);
						
						whole_money_text.setText( String.valueOf(nResult)+"원" );

						input_order_box.setText(
							String.format("돈가스 %d개\n김치찌개 %d개\n정식 %d개", whole_count[0],whole_count[1],whole_count[2])
						);
					}
				}
				else if(item.equals(">")) {//수량을 늘릴 경우
					int index = ((JComboBox) combo_box).getSelectedIndex();
					
					if(now_count > 0) {//0개 이상일 경우엔 카운트더한만큼 출력
						now_count++;
						whole_count[index]++;
						
						count_text.setText( String.valueOf(now_count) );
					}
					else {//0개 미만일 경우엔 카운트출력 생략
						now_count++;
						whole_count[index]++;
					}

					int nResult = 0;//총액 초기화
					for(int i=0 ; i<3 ; i++) 
						nResult += whole_count[i] * Integer.parseInt(price[i]);
					
					whole_money_text.setText(String.valueOf(nResult)+"원");
					
					input_order_box.setText(//주문 내용에 문자열포맷팅을 이용하여 출력
						String.format("돈가스 %d개\n김치찌개 %d개\n정식 %d개", whole_count[0],whole_count[1],whole_count[2])
					);
				}
				else if(item.equals("결제")) {//결제버튼 눌렀을 경우
					try {
						int nMoney = Integer.parseInt(input_money_text.getText());
						
						int nResult = 0;//총액 초기화
						for(int i=0 ; i<3 ; i++) 
							nResult += whole_count[i] * Integer.parseInt(price[i]);
						
						if(nMoney > nResult) {
							input_money_text.setText("정상결제");
						}
						else {
							input_money_text.setText("금액이 부족합니다!");
						}
					}
					//입력이 없을 때, 숫자가 아닐 때 한번에 처리됨.
					catch(NumberFormatException except) {
						input_money_text.setText("숫자를 입력하세요!");
					}
				}
			}
		};
		

		JButton left_button = new JButton("<");
		left_button.addActionListener(action_l);
		
		JButton right_button = new JButton(">");
		right_button.addActionListener(action_l);
		
		count_panel.add(left_button);
		count_panel.add(count_text);
		count_panel.add(right_button);
		
		
		north_panel.add(input_order_box);
		
		center_panel.add(combo_box); // 메뉴 콤보박스
		center_panel.add(count_panel); // 수량 버튼
		center_panel.add(whole_money);
		center_panel.add(whole_money_text);
		center_panel.add(input_money);
		center_panel.add(input_money_text);
		
		
		JButton buy_button = new JButton("결제");
		buy_button.addActionListener(action_l);
		buy_button.setPreferredSize(new Dimension(260, 30));
		
		south_panel.add(buy_button);
		
		add("North", north_panel);
		add("Center", center_panel);
		add("South", south_panel);
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setSize(300, 300);
		setVisible(true);
	}
}
