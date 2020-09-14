package Assignment;

import java.util.Scanner;

public class Stick {

	public static void main(String[] args) {
		
		Scanner in = new Scanner(System.in);
		System.out.printf("입력(X는 64보다 작거나 같은 자연수): ");
		int input = in.nextInt();
		
		Method_Stick stick = new Method_Stick();
		
		stick.factors();
		stick.cal(input);
	}

}
