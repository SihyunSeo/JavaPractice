package book_practice;

public class Chap_03_prac_3_10 {

	public static void main(String[] args) {
		
		int num1 = 2; //2�ܺ��� �����Ѵ�
		while (num1 < 10) {  //num1���� 10���� ���������� �����Ѵ�
			int num2 = 1;  
			while(num2 < 10) {  //num2���� 10���� ���������� �����Ѵ�
				System.out.printf("%4d", num1 * num2);
				num2 ++ ;
			}
			System.out.println();
			num1 ++ ;
		}
	}

}
