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
			System.out.println("������ ���� ���� �� �ֽ��ϴ�. �ٽ� �Է��� �ּ���");
		}

	}
}
	
	private static void x(String s) throws NumberFormatException { //������ �Է��������� �ؿ� ���๮�� ����ȴ�.
		int n = Integer.parseInt(s);
		System.out.println(n * 10);
	}

}