package book_practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Chap_11_prac_11_14 {

	public static void main(String[] args) {
		int[] ia = {1, 6, 3, 9, 5, 4, 2};
		IntStream is = Arrays.stream(ia); //���� �迭���� IntStream ��ü�� ��� �´�.
		
		int sum = is.filter(i -> i > 5).sum(); //���� ��Ʈ���� ���ҿ��� ���� 5���� ū �������� �ɷ� ���� ��� ���Ѵ�.
		
		System.out.println(sum);

	}

}
