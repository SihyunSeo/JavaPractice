package second_semester;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;

public class Chap_11_prac_11_12 {

	public static void main(String[] args) {
		List<String> list = new ArrayList<>();
		list.add("�ٶ���");
		list.add("������");
		list.add("����");
		
		Iterator<String> iterator = list.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + "\t");
		System.out.println();
		
		Collections.sort(list);
		
		while(iterator.hasNext())
			System.out.print(iterator.next() + ",\t");
		System.out.println();
		
		iterator = list.iterator();
		while(iterator.hasNext())
			System.out.print(iterator.next() + "->\t");

	}

}
