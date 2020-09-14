package first_semester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Chap_11_prac_11_12 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("다람쥐");
		list.add("개구리");
		list.add("나비");
		
		Iterator<String> iterator = list.iterator();  //List에서 iterator 객체를 가져와 List 컬렉션의 모든 원소를 출력한다.
		while(iterator.hasNext())
			System.out.print(iterator.next() + "\t");
		System.out.println();
		
		Collections.sort(list); //List 컬렉션 원소를 정렬한다.
		
		while(iterator.hasNext())        // 이미 사용한 반복자로 List 컬렉션의 모든 원소를 출력한다.
			System.out.print(iterator.next() + "\t");
		System.out.println();
		
		iterator = list.iterator();      // List에서 iterator 객체를 다시 가져와서 List 컬렉션의 모든 원소를 출력한다.
		while(iterator.hasNext())
			System.out.print(iterator.next() + "->\t");
				

	}

}
