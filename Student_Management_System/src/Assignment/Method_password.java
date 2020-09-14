package Assignment;

import java.util.ArrayList;

public class Method_password 
{
	ArrayList<Character> letters = new ArrayList<Character>();
	ArrayList<Character> re_letters = new ArrayList<Character>();
	
	void al_letters()
	{
		for(char al = 'A'; al <= 'Z'; al++)
		{
			letters.add(al);
		}
		for(int i = 25; i >= 0; i --)
		{
			re_letters.add(letters.get(i));
		}
	}
	void change(String word)
	{
		for(int i = 0; i < word.length(); i ++)
		{
			word.charAt(i);
			if(!letters.contains(word.charAt(i)))
			{
				System.out.print(word.charAt(i));
			}
			for(int j = 0; j < letters.size(); j ++)
			{
				if(word.charAt(i) == letters.get(j))
				{
					System.out.print(re_letters.get(j));
					break;
				}
			}
		}
	}
}
