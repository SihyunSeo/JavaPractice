package first_semester;
import java.util.LinkedList;
import java.util.NoSuchElementException;
import java.util.Queue;

public class Chap_11_prac_11_4 {

	public static void main(String[] args) {
		Queue<String> q = new LinkedList<>(); //LinkedList�� Queue�� ���� Ŭ�����̹Ƿ� ������ ��ü�� QueueŸ�� ������ ������ �� �ִ�.
		
		//q.remove(); -> �ּ��� �����ϸ� ���ܰ� �߻��Ѵ�. ť�� ���Ұ� ���µ� remove()�޼��带 ȣ���ϱ� �����̴�.
		
		System.out.println(q.poll());
		q.offer("���");
		System.out.println("�ٳ����� �߰��߳���? " + q.offer("�ٳ���"));
		
		try 
		{
			q.add("ü��");
		} catch(IllegalStateException e) {
			
		}
		System.out.println("��� ������ : " + q.peek());
		
		String head = null;
		
		try
		{
			head = q.remove();
			System.out.println(head + "�����ϱ�");
			System.out.println("���ο� ��� : " + q.element());
		} catch (NoSuchElementException e) {
			
		}
		
		head = q.poll();
		System.out.println(head + "�����ϱ�");
		System.out.println("���ο� ��� : " + q.peek());
		
		System.out.println("ü���� �����ϰ� �ֳ���?" + q.contains("ü��"));
		System.out.println("����� �����ϰ� �ֳ���?" + q.contains("���"));
	}

}
