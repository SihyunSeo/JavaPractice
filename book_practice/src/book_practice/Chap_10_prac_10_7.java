package book_practice;

import java.util.Scanner;

public class Chap_10_prac_10_7 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			
		try
		{
			square(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수가 아닙니다.");
		}

	}
}
	
	private static void square(String s) throws NumberFormatException { //정수를 입력했을때는 밑에 실행문이 실행된다.
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}

}
