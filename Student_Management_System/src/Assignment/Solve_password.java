package Assignment;

import java.util.Scanner;

public class Solve_password {

	public static void main(String[] args) 
	{
		Scanner in = new Scanner(System.in);
		System.out.print("ют╥б: ");
		String input = in.nextLine();
		
		Method_password al_letter = new Method_password();
		
		al_letter.al_letters();
		al_letter.change(input);
	}
}
