package first_semester;

import java.util.Arrays;
import java.util.List;

public class Chap_11_prac_11_1 {

	public static void main(String[] args) {
		String[] names1 = {"사슴", "호랑이", "바다표범", "곰"};
		
		List<String> list = Arrays.asList(names1); //배열을 List 타입으로 반환한다.
		list.set(1, "앵무새"); //List 객체의 인덱스 1번 원소를 "앵무새"로 변경한다.
		for(String s : list)
			System.out.print(s + "\t");
		System.out.println();
		
		list.sort((x,y) -> x.length() - y.length()); //List 원소를 길이 순서대로 정렬한다.
		String[] names2 = list.toArray(new String[list.size()]); //List 타입의 객체를 배열로 변환한다.
		for(int i = 0; i < names2.length; i++)
			System.out.print(names2[i] + "\t");

	}

}
