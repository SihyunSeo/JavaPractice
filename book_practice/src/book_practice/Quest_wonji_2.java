package book_practice;

import java.util.Scanner;

public class Quest_wonji_2 {

	public static void main(String[] args) {
		
		int input = 0; //키보드 입력값
	
		Scanner in = new Scanner(System.in);
		input = in.nextInt();
		
		if (input % 4 == 0 && input % 5 == 0)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		if (input % 4 == 0 || input % 5 == 0)
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		if ((input % 4 == 0 || input % 5 == 0) && (input % 20 != 0))
		{
			System.out.println(true);
		}
		else
		{
			System.out.println(false);
		}
		

	}

}
