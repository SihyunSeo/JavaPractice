package first_semester;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Chap_11_prac_11_4 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>(); //LinkedList는 Queue의 구현 클래스이므로 생성된 객체를 Queue타입 변수에 대입할 수 있다.
		
		//q.remove(); -> 주석을 제거하면 예외가 발생한다. 큐에 원소가 없는데 remove()메서드를 호출하기 떄문이다.
		
		System.out.println(q.poll());
		q.offer("사과");
		System.out.println("바나나를 추가했나요? " + q.offer("바나나"));
		
		try 
		{
			q.add("체리");
		} catch(IllegalStateException e) {
			
		}
		System.out.println("헤드 엿보기 : " + q.peek());
		
		String head = null;
		
		try
		{
			head = q.remove();
			System.out.println(head + "제거하기");
			System.out.println("새로운 헤드 : " + q.element());
		} catch (NoSuchElementException e) {
			
		}
		
		head = q.poll();
		System.out.println(head + "제거하기");
		System.out.println("새로운 헤드 : " + q.peek());
		
		System.out.println("체리를 포함하고 있나요?" + q.contains("체리"));
		System.out.println("사과를 포함하고 있나요?" + q.contains("사과"));
	}

}
