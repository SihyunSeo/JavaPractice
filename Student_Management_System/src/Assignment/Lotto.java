package Assignment;

import java.util.Scanner;

public class Lotto {

	public static void main(String[] args) {
		
		Method_Lotto lotto = new Method_Lotto();
		Scanner in = new Scanner(System.in);
		System.out.printf("Ȯ�� ���� �Դϴ�. ������ �� ������ ����� �ϴ� ������ ������ �Է��Ͻÿ�: ");
		String number = in.nextLine();
		
		lotto.setNumber(number);
		lotto.probability();
	}

}
