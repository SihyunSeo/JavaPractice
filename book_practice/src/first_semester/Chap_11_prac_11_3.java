package first_semester;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chap_11_prac_11_3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		long start = System.nanoTime();           //10만개의 원소를 ArrayList의 첫 번째 원소로 추가하는데 소요되는 시간을 측정한다.
		for(int i = 0; i < 100000; i++)
			al.add(0, i);
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("ArrayList로 처리한 시간 : " + duration);
		
		start = System.nanoTime();                //10만개의 원소를 LinkedList의 첫 번째 원소로 추가하는데 소요되는 시간을 측정한다.
		for(int i = 0; i < 100000; i++)
			ll.addFirst(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("LinkedList로 처리한 시간 : " + duration);

	}

}
