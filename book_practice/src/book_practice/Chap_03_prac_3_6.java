package book_practice;

import java.util.Scanner;

public class Chap_03_prac_3_6 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.print("���ܾ �Է��ϼ��� : ");
		
		String english;
		
		english = in.nextLine();
		
		
		
		switch(english) {
		case "odd":
			System.out.println("Ȧ���Դϴ�.");
			break;
			
		case "even":
			System.out.println("¦���Դϴ�.");
			break;
			
		default:
			System.out.println("¦���� Ȧ���� �ƴմϴ�.");
			
		}

	}

}
