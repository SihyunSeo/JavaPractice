package book_practice;

import java.util.Stack;

public class Chap_11_prac_11_2 {

	public static void main(String[] args) {
		Stack<String> s1 = new Stack<>(); //문자열 스택을 생성한다.
		
		s1.push("사과");
		s1.push("바나나");          //스택에 원소를 추가한다.
		s1.push("체리");
		
		System.out.println(s1.peek());  //스택의 최상위 원소를 제거하지 않고 엿보기만 한다.
		
		System.out.println(s1.pop());
		System.out.println(s1.pop());  //스택의 최상위 원소를 하나씩 빼낸다.
		System.out.println(s1.pop());
		System.out.println();
		
		Stack<Integer> s2 = new Stack<>(); //정수 스택을 생성한다.
		
		s2.add(10);
		s2.add(20);                //스택도 벡터처럼 add()메서드를 사용할 수 있다.
		s2.add(1, 100);
		
		for(int value : s2)
			System.out.print(value + " ");
		System.out.println();
		
		while(!s2.empty())
			System.out.print(s2.pop() + " ");  //빈 스택이 될 때까지 원소부터 하나씩 반환한다.
		
	}

}
