package first_semester;

import java.util.Scanner;

public class Answer_wonji_1 {

	public static void main(String[] args) {
		
		float userInput = 0; // �Է°�
		float userOutput = 0; // ��� �� ��°�
		
		//��ĳ�ʸ� ���� ���� �Է°� �Է�
		Scanner userChoice = new Scanner(System.in);
		userInput = userChoice.nextFloat();
		//��� ����
		userOutput = (float) ((5/(float)9)*(userInput - 32));
		
		//���
		System.out.println(userOutput);
	}

}
