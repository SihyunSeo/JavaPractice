package book_practice;

import java.util.Scanner;

public class Quest_Wonji_05 {

	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		while(true) {
			
		try
		{
			x(in.nextLine());
		} catch (NumberFormatException e) {
			System.out.println("정수의 값만 받을 수 있습니다. 다시 입력해 주세요");
		}

	}
}
	
	private static void x(String s) throws NumberFormatException { //정수를 입력했을때는 밑에 실행문이 실행된다.
		int n = Integer.parseInt(s);
		System.out.println(n * 10);
	}

}