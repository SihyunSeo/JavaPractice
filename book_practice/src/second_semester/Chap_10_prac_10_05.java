package second_semester;

public class Chap_10_prac_10_05 {

	public static void main(String[] args) {
		int divident = 10;
		try
		{
			int divisor = Integer.parseInt(args[0]);
			System.out.println(divident / divisor);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("���Ұ� �������� �ʽ��ϴ�.");
		} catch(NumberFormatException e){ // main �޼����� �μ��� ���ڷ� �ٲܼ� ������
			System.out.println("���ڰ� �ƴմϴ�.");
		} catch(ArithmeticException e){ // main �޼����� �μ��� 0�϶�
			System.out.println("0���� ������ �����ϴ�.");
		} finally{
			System.out.println("�׻� ����˴ϴ�.");
		}
		System.out.println("����");

	}

}
