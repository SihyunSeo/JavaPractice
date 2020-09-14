package Assignment;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		Method_Lotto lotto = new Method_Lotto();
		Scanner in = new Scanner(System.in);
		System.out.printf("확률 계산기 입니다. 숫자의 총 갯수와 맞춰야 하는 숫자의 갯수를 입력하시오: ");
		String number = in.nextLine();
		
		lotto.setNumber(number);
		lotto.probability();
	}

}
