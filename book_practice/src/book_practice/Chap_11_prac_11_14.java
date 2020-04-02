package book_practice;

import java.util.Arrays;
import java.util.stream.IntStream;

public class Chap_11_prac_11_14 {

	public static void main(String[] args) {
		int[] ia = {1, 6, 3, 9, 5, 4, 2};
		IntStream is = Arrays.stream(ia); //정수 배열에서 IntStream 객체를 얻어 온다.
		
		int sum = is.filter(i -> i > 5).sum(); //정수 스트림의 원소에서 값이 5보다 큰 정수만을 걸러 내어 모두 합한다.
		
		System.out.println(sum);

	}

}
