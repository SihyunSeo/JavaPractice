package book_practice;

import java.util.Scanner;

public class Chap_03_prac_3_1 {

	public static void main(String[] args) {
		
		int input = 0;
		
		Scanner in = new Scanner(System.in);
		System.out.print("���ڸ� �Է��Ͻÿ� : ");
		
		input = in.nextInt();
		
		if(input % 2 == 0)
		{
			System.out.println("¦��!");
		}
		if(input % 2 == 1)
		{
			System.out.println("Ȧ��!");
		}
		System.out.println("����");

	}

}
