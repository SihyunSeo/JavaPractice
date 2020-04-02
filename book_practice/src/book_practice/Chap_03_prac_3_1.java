package book_practice;

import java.util.Scanner;

public class Chap_03_prac_3_1 {

	public static void main(String[] args) {
		
		int input = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("숫자를 입력하시오 : ");
		
		input = in.nextInt();
		
		if(input % 2 == 0)
		{
			System.out.println("짝수!");
		}
		if(input % 2 == 1)
		{
			System.out.println("홀수!");
		}
		System.out.println("종료");

	}

}
