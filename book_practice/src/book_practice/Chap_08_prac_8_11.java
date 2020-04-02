package book_practice;

import java.util.Arrays;
import java.util.Comparator;

public class Chap_08_prac_8_11 {

	public static void main(String[] args) {
		String[] strings = {"로마에가면 로마법을 따라라", "시간은 금이다", "펜은 칼보다 강하다"};
		
		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String first, String second) {
				return first.length() - second.length();
			}
		});
		for (String s : strings)
			System.out.println(s);
	}
}
