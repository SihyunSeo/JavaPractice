package book_practice;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Chap_11_prac_11_10 {

	public static void main(String[] args) {
		List<Character> list = new ArrayList<>();
		
		for(char c = 'A'; c <= 'G'; c++)
			list.add(c);
		
		System.out.println("���� �� : \t" + list);
		Collections.shuffle(list);
		System.out.println("���� �� : \t" + list);

	}

}
