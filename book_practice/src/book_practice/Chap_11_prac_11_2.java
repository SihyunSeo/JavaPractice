package book_practice;

import java.util.Stack;

public class Chap_11_prac_11_2 {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>(); //���ڿ� ������ �����Ѵ�.
		
		s1.push("���");
		s1.push("�ٳ���");          //���ÿ� ���Ҹ� �߰��Ѵ�.
		s1.push("ü��");
		
		System.out.println(s1.peek());  //������ �ֻ��� ���Ҹ� �������� �ʰ� �����⸸ �Ѵ�.
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());  //������ �ֻ��� ���Ҹ� �ϳ��� ������.
		System.out.println(s1.pop());
		System.out.println();
		
		Stack<Integer> s2 = new Stack<>(); //���� ������ �����Ѵ�.
		
		s2.add(10);
		s2.add(20);                //���õ� ����ó�� add()�޼��带 ����� �� �ִ�.
		s2.add(1, 100);
		
		for(int value : s2)
			System.out.print(value + " ");
		System.out.println();
		
		while(!s2.empty())
			System.out.print(s2.pop() + " ");  //�� ������ �� ������ ���Һ��� �ϳ��� ��ȯ�Ѵ�.
		
	}

}
