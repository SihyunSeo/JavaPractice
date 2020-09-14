package first_semester;

import java.util.Scanner;

public class Chap_03_prac_3_3 {

	public static void main(String[] args) {
		
		int score = 0;
		
		Scanner in = new Scanner(System.in);
		
		String grade;
		
		System.out.print("점수를 입력하세요 : ");
		score = in.nextInt();
		
		if(score >= 90)
			grade = "A";
		else if(score >= 80)
			grade = "B";
		else if(score >= 70)
			grade = "C";
		else if(score >= 60)
			grade = "D";
		else
			grade = "F";
		
		System.out.print("당신의 학점은 : " + grade);
		
		
	}

}
