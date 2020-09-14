package first_semester;

import java.util.ArrayList;
import java.util.Scanner;

public class testing {
	ArrayList<Character> letters = new ArrayList<Character>();
	ArrayList<Character> re_letters = new ArrayList<Character>();

	void al_letters()
	{
		for(char al = 'A'; al <= 'Z'; al++)
		{
			letters.add(al);
		}
		System.out.println(letters);
		for(int i = 25; i >= 0; i --)
		{
			re_letters.add(letters.get(i));
		}
		System.out.println(re_letters);
	}
	void change(String word)
	{
		for(int i = 0; i < word.length(); i ++)
		{
			word.charAt(i);
			for(int j = 0; j < letters.size(); j ++)
			{
				if(word.charAt(i) == letters.get(j))
				{
					System.out.print(re_letters.get(j));
					break;
				}
				else if(!letters.contains(word.charAt(i))) 
				{
					System.out.print(word.charAt(i));
					break;
				}
			}
		}
	}
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		System.out.print("ют╥б: ");
		String input = in.next();
		
		testing al_letter = new testing();
		
		al_letter.al_letters();
		al_letter.change(input);
		
		
	}

}
