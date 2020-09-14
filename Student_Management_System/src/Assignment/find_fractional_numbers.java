package Assignment;

import java.util.Scanner;

public class find_fractional_numbers {

	public static void main(String[] args) 
	{
		fractional_numbers nums = new fractional_numbers();
		
		Scanner num = new Scanner(System.in);
		System.out.print("몇번째 분수를 구하시겠습니까 : ");
		int put = num.nextInt();
		
		nums.get(put);
	}

}
