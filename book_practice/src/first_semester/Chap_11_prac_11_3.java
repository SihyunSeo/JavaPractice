package first_semester;

import java.util.ArrayList;
import java.util.LinkedList;

public class Chap_11_prac_11_3 {

	public static void main(String[] args) {
		ArrayList<Integer> al = new ArrayList<Integer>();
		LinkedList<Integer> ll = new LinkedList<Integer>();
		
		long start = System.nanoTime();           //10������ ���Ҹ� ArrayList�� ù ��° ���ҷ� �߰��ϴµ� �ҿ�Ǵ� �ð��� �����Ѵ�.
		for(int i = 0; i < 100000; i++)
			al.add(0, i);
		long end = System.nanoTime();
		long duration = end - start;
		System.out.println("ArrayList�� ó���� �ð� : " + duration);
		
		start = System.nanoTime();                //10������ ���Ҹ� LinkedList�� ù ��° ���ҷ� �߰��ϴµ� �ҿ�Ǵ� �ð��� �����Ѵ�.
		for(int i = 0; i < 100000; i++)
			ll.addFirst(i);
		end = System.nanoTime();
		duration = end - start;
		System.out.println("LinkedList�� ó���� �ð� : " + duration);

	}

}
