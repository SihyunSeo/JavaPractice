package book_practice;

import java.util.Arrays;
import java.util.Comparator;

public class Chap_08_prac_8_11 {

	public static void main(String[] args) {
		String[] strings = {"�θ������� �θ����� �����", "�ð��� ���̴�", "���� Į���� ���ϴ�"};
		
		Arrays.sort(strings, new Comparator<String>() {
			public int compare(String first, String second) {
				return first.length() - second.length();
			}
		});
		for (String s : strings)
			System.out.println(s);
	}
}
