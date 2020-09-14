package first_semester;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chap_11_prac_11_9 {

	public static void main(String[] args) {
		String[] s = {"나는", "조국", "대한민국을", "사랑합니다"};
		List<String> list = Arrays.asList(s); //배열을 List 타입으로 변환한다. List 컬렉션의 원소가 String 타입이다.
		
		Collections.sort(list, Collections.reverseOrder()); //List 컬렉션 원소를 역방향으로 정렬한다.
		System.out.println(list);
		
		Collections.reverse(list); //List 컬렉션 원소를 역방향으로 정렬한다.
		System.out.println(list);

	}

}
