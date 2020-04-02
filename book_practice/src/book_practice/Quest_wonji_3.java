package book_practice;

import java.util.Scanner;

public class Quest_wonji_3 {

	public static void main(String[] args) {
		
		int input = 0;
		int output = 0;
		
		
		Scanner in = new Scanner(System.in);
		System.out.println("0~999 사이의 숫자를 입력하세요 : ");
		input = in.nextInt();
		
		System.out.println(((input-input%100)/100) + (input-(input-input%100))/10 + (input%10));

	}

}
