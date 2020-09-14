package first_semester;

import java.util.Scanner;

public class Answer_wonji_1 {

	public static void main(String[] args) {
		
		float userInput = 0; // 입력값
		float userOutput = 0; // 계산 후 출력값
		
		//스캐너를 통한 유저 입력값 입력
		Scanner userChoice = new Scanner(System.in);
		userInput = userChoice.nextFloat();
		//계산 과정
		userOutput = (float) ((5/(float)9)*(userInput - 32));
		
		//출력
		System.out.println(userOutput);
	}

}
