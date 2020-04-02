package book_practice;

import java.util.Scanner;

public class Quest_wonji_1 {

	public static void main(String[] args) {
		
		float input = 0;
		float output = 0;
		
		Scanner in = new Scanner(System.in);
		input = in.nextFloat();
		
		output = 5/(float)9 * (input - 32);
		
		System.out.println(output);

	}

}
