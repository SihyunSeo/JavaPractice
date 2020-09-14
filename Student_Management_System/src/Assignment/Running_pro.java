package Assignment;

import java.util.Scanner;

public class Running_pro {

	public static void main(String[] args) {
		
		Method_Running running = new Method_Running();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("속도, 구간거리, 시간을 입력하시오: ");
		String nums = in.nextLine();
		
		running.collect(nums);
		running.calculate();
	}
}
