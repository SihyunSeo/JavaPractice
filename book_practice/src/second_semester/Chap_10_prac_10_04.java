package second_semester;
import java.util.*;
public class Chap_10_prac_10_04 {

	public static void main(String[] args) {
		int[] array = {0, 1, 2};
		try {
			System.out.println("������ ���� => " + array[3]); //�ΰ��� print ���� ���������� ù��° print������  outofbounds ������ ����Ǿ� �ٷ� catch���� ���� �� ������ print ���� ������ ����� ���´�.
			System.out.println("ù ��° ���� => " + array[0]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		}
		System.out.println("������");
	}

}
