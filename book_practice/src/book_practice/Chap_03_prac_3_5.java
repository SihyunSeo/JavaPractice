package book_practice;

import java.util.Scanner;

public class Chap_03_prac_3_5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("등수를 입력하세요 : ");
		int rank = in.nextInt();
		
		switch (rank) {
		case 1:
			System.out.println("일등입니다.");
			break;
		case 2:
			System.out.println("이등입니다.");
			break;
		case 3:
			System.out.println("삼등입니다.");
			break;
		default:
			System.out.println("등외입니다.");
		}
	}

}
