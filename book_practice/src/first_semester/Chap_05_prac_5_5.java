package first_semester;

import java.util.Scanner;

public class Chap_05_prac_5_5 {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		int scores[] = new int[5];
		int sum = 0;
		
		for(int i = 0; i < scores.length; i++) 
			scores[i] = in.nextInt();
		
		for(int i = 0; i < scores.length; i++)
			sum+= scores[i];
		
		System.out.println("��� = " + sum / 5.0);

	}

}
