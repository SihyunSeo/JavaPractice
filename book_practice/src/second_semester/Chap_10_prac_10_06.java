package second_semester;

public class Chap_10_prac_10_06 {

	public static void main(String[] args) {
		int[] array = {0, 1, 2};
		try {
			int x = array[3];
		} catch(Exception e) {
			System.out.println("������!");
		} catch(ArrayIndexOutOfBoundsException e) { // �̹� exception e ���� �������� ó���ϹǷ� �� ����ó������ ������������ ������ �߻��Ѵ�.
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		}
		System.out.println("����");

	}

}
