package book_practice;

public class Chap_02_prac_2_6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		int i;
		double d;
		byte b;
		
		i = 7/4;
		System.out.println(i);
		d = 7/4;
		System.out.println(d);
		d = 7/(double) 4;
		System.out.println(d);
		
		// i = 7 / (double) 4;
		
		i = 300;
		if(i < Byte.MIN_VALUE || i > Byte.MAX_VALUE)
			System.out.println("byte Ÿ������ ��ȯ�� �� �����ϴ�.");
		else
			b = (byte) i ;
		
	}

}
