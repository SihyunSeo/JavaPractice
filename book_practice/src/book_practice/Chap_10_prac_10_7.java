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
			System.out.println("������ �ƴմϴ�.");
		}

	}
}
	
	private static void square(String s) throws NumberFormatException { //������ �Է��������� �ؿ� ���๮�� ����ȴ�.
		int n = Integer.parseInt(s);
		System.out.println(n * n);
	}

}
