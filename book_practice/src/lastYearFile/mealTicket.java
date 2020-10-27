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
	private String[] price = {"5000", "3000", "4000"};//�޴����� �ݾ� �迭
	private int[] whole_count = {1, 1, 1};//�޴����� �ʱ� ���� �迭
	private int now_count = 1;//���� ���� �ʵ�
	private int now_price = 5000;//�ʱ� ���� �ʵ�
	
	//������
	mealTicket(){
		setTitle("�ı� �Ǹű�");
		setLayout(new BorderLayout());//��ü���ΰ� border ���̾ƿ� ���

		JPanel north_panel = new JPanel();
		JPanel center_panel = new JPanel(new GridLayout(3, 2, 10, 10));//�ؿ� ��ư�鿡 �׸��� ���̾ƿ� ���
		JPanel count_panel = new JPanel(new GridLayout(1, 3));//���� ��ư�� �׸��� ���̾ƿ� ���
		JPanel south_panel = new JPanel();
		
		JTextArea input_order_box = new JTextArea(5, 24);
		
		input_order_box.setText(
				"������ 1��\n��ġ� 1��\n���� 1��"
				);//�ʱ� �ֹ� ����
		
		input_order_box.setSize(100, 100);

		
		JLabel whole_money = new JLabel("��  ��");
		JTextField whole_money_text = new JTextField("12000��");//�ʱ� �Ѿ�(�⺻������ ������ 1�̶�)
		
		JLabel input_money = new JLabel("���Աݾ�");
		JTextField input_money_text = new JTextField("");
		
		whole_money.setHorizontalAlignment(JLabel.CENTER);
		whole_money_text.setHorizontalAlignment(JTextField.CENTER);
		input_money.setHorizontalAlignment(JLabel.CENTER);
		input_money_text.setHorizontalAlignment(JTextField.CENTER);
		
		
		String[] sMenus = {"������", "��ġ�", "����"};//�޴� ���
		
		JComboBox<String> combo_box = new JComboBox<>(sMenus);//�޺��ڽ�

		
		JTextField count_text = new JTextField(String.valueOf(now_count));
		count_text.setHorizontalAlignment(JTextField.CENTER);
		
		
		combo_box.addItemListener(e -> {//�޺��ڽ� �̺�Ʈ
			int index = ((JComboBox) combo_box).getSelectedIndex();
			
			now_count = whole_count[index];
			count_text.setText( String.valueOf(now_count) );
			
			now_price = Integer.parseInt(price[index]);
		});
		
		//�̺�Ʈ������
		ActionListener action_l = new ActionListener() {
			@Override
			public void actionPerformed(ActionEvent e) {
				String item = e.getActionCommand();
				
				if(item.equals("<")) {//������ ���� ���
					if(now_count > 0) {//0�� �̻��� ��츸 �۵��� (���̳ʽ� ������ �����Ƿ�)
						int index = ((JComboBox) combo_box).getSelectedIndex();
						
						whole_count[index]--;
						now_count--;
						
						count_text.setText( String.valueOf(now_count) );
						
						int nResult = 0;
						for(int i=0 ; i<3 ; i++) 
							nResult += whole_count[i] * Integer.parseInt(price[i]);
						
						whole_money_text.setText( String.valueOf(nResult)+"��" );

						input_order_box.setText(
							String.format("������ %d��\n��ġ� %d��\n���� %d��", whole_count[0],whole_count[1],whole_count[2])
						);
					}
				}
				else if(item.equals(">")) {//������ �ø� ���
					int index = ((JComboBox) combo_box).getSelectedIndex();
					
					if(now_count > 0) {//0�� �̻��� ��쿣 ī��Ʈ���Ѹ�ŭ ���
						now_count++;
						whole_count[index]++;
						
						count_text.setText( String.valueOf(now_count) );
					}
					else {//0�� �̸��� ��쿣 ī��Ʈ��� ����
						now_count++;
						whole_count[index]++;
					}

					int nResult = 0;//�Ѿ� �ʱ�ȭ
					for(int i=0 ; i<3 ; i++) 
						nResult += whole_count[i] * Integer.parseInt(price[i]);
					
					whole_money_text.setText(String.valueOf(nResult)+"��");
					
					input_order_box.setText(//�ֹ� ���뿡 ���ڿ��������� �̿��Ͽ� ���
						String.format("������ %d��\n��ġ� %d��\n���� %d��", whole_count[0],whole_count[1],whole_count[2])
					);
				}
				else if(item.equals("����")) {//������ư ������ ���
					try {
						int nMoney = Integer.parseInt(input_money_text.getText());
						
						int nResult = 0;//�Ѿ� �ʱ�ȭ
						for(int i=0 ; i<3 ; i++) 
							nResult += whole_count[i] * Integer.parseInt(price[i]);
						
						if(nMoney > nResult) {
							input_money_text.setText("�������");
						}
						else {
							input_money_text.setText("�ݾ��� �����մϴ�!");
						}
					}
					//�Է��� ���� ��, ���ڰ� �ƴ� �� �ѹ��� ó����.
					catch(NumberFormatException except) {
						input_money_text.setText("���ڸ� �Է��ϼ���!");
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
		
		center_panel.add(combo_box); // �޴� �޺��ڽ�
		center_panel.add(count_panel); // ���� ��ư
		center_panel.add(whole_money);
		center_panel.add(whole_money_text);
		center_panel.add(input_money);
		center_panel.add(input_money_text);
		
		
		JButton buy_button = new JButton("����");
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
