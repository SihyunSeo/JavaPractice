package Assignment;

import java.util.Scanner;

public class Running_pro {

	public static void main(String[] args) {
		
		Method_Running running = new Method_Running();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("�ӵ�, �����Ÿ�, �ð��� �Է��Ͻÿ�: ");
		String nums = in.nextLine();
		
		running.collect(nums);
		running.calculate();
	}
}
