package first_semester;

public class Chap_10_prac_10_4 {

	public static void main(String[] args) {
		int[] array = {0, 1, 2};
		try {
			System.out.println("������ ���� = >" + array[3]);  //ù�������� ���� �߻�
			System.out.println("ù ��° ���� = > " + array[0]); //ù��° ���๮ ���ܷ� ���� ��� x
		} catch (ArrayIndexOutOfBoundsException e) {  //ù��° ���๮���� �߻��� ���ܷ� ���� catch�� �ٷ� ����
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		}
		System.out.println("������!!");
	}

}
