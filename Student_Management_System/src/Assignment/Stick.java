package Assignment;

import java.util.Scanner;

public class Stick {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.printf("�Է�(X�� 64���� �۰ų� ���� �ڿ���): ");
		int input = in.nextInt();
		
		Method_Stick stick = new Method_Stick();
		
		stick.factors();
		stick.cal(input);
	}

}
