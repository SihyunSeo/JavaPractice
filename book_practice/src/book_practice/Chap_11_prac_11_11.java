package book_practice;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chap_11_prac_11_11 {

	public static void main(String[] args) {
		String[] s = {"Ȳ����", "��", "����", "����"};
		List<String> list = Arrays.asList(s);
		
		Collections.sort(list);
		System.out.println(list);
		int i = Collections.binarySearch(list, "��");
		System.out.println(i);

	}

}
