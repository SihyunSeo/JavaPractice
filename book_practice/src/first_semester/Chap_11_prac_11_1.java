package first_semester;

import java.util.Arrays;
import java.util.List;

public class Chap_11_prac_11_1 {

	public static void main(String[] args) {
		String[] names1 = {"�罿", "ȣ����", "�ٴ�ǥ��", "��"};
		
		List<String> list = Arrays.asList(names1); //�迭�� List Ÿ������ ��ȯ�Ѵ�.
		list.set(1, "�޹���"); //List ��ü�� �ε��� 1�� ���Ҹ� "�޹���"�� �����Ѵ�.
		for(String s : list)
			System.out.print(s + "\t");
		System.out.println();
		
		list.sort((x,y) -> x.length() - y.length()); //List ���Ҹ� ���� ������� �����Ѵ�.
		String[] names2 = list.toArray(new String[list.size()]); //List Ÿ���� ��ü�� �迭�� ��ȯ�Ѵ�.
		for(int i = 0; i < names2.length; i++)
			System.out.print(names2[i] + "\t");

	}

}
