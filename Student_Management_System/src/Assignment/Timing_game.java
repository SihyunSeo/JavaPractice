package Assignment;

import java.util.Scanner;

public class Timing_game {

	public static void main(String[] args) {
		
		Method_timing_game numbers = new Method_timing_game();
		System.out.printf("2~50사이에서 개수를 입력하시오: ");
		Scanner in = new Scanner(System.in);
		int num = in.nextInt();
		in.nextLine();
		System.out.printf(num+"개의 다른 수를 입력하시오(1~100,spacebar로 구분): ");		
		String number = in.nextLine();  
		in.close();
		
		numbers.numList(number);
		numbers.calculate(num);
	}

}
