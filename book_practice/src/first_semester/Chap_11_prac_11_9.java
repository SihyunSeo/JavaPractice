package first_semester;

import java.util.Arrays;
import java.util.Collections;
import java.util.List;

public class Chap_11_prac_11_9 {

	public static void main(String[] args) {
		String[] s = {"����", "����", "���ѹα���", "����մϴ�"};
		List<String> list = Arrays.asList(s); //�迭�� List Ÿ������ ��ȯ�Ѵ�. List �÷����� ���Ұ� String Ÿ���̴�.
		
		Collections.sort(list, Collections.reverseOrder()); //List �÷��� ���Ҹ� ���������� �����Ѵ�.
		System.out.println(list);
		
		Collections.reverse(list); //List �÷��� ���Ҹ� ���������� �����Ѵ�.
		System.out.println(list);

	}

}
