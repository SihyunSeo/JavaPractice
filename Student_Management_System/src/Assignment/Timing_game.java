package Assignment;

import java.util.Scanner;

public class Timing_game {

	public static void main(String[] args) {
		
		Method_timing_game numbers = new Method_timing_game();
		System.out.printf("2~50���̿��� ������ �Է��Ͻÿ�: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.nextLine();
		System.out.printf(num+"���� �ٸ� ���� �Է��Ͻÿ�(1~100,spacebar�� ����): ");		
		String number = in.nextLine();  
		in.close();
		
		numbers.numList(number);
		numbers.calculate(num);
	}

}
