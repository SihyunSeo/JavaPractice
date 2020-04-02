package book_practice;

import java.util.Scanner;

public class Chap_03_prac_3_6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("영단어를 입력하세요 : ");
		
		String english;
		
		english = in.nextLine();
		
		
		
		switch(english) {
		case "odd":
			System.out.println("홀수입니다.");
			break;
			
		case "even":
			System.out.println("짝수입니다.");
			break;
			
		default:
			System.out.println("짝수도 홀수도 아닙니다.");
			
		}

	}

}
