package first_semester;

public class LocalVariableDemo {

	public static void main(String[] args) {
		int a = 0;
		double b = 0;
		
		//System.out.print(b);     //�ʱ�ȭ���� �ʰ�� ����� �� ����.
		//System.out.print(a+c);   //c ������ ���� ������� �ʾұ� ������ ����� �� ����.
		
		int c = 0;
		
		//public double d = 0.0;	// ���� ������ public ���� ������ �� ����.
		
		for(int e = 0; e<10; e++) {
			//int a = 1;  	// 3�࿡�� ����� ���� ���� �̸��̴�. ����� �޶� ���� �̸����δ� �ٽ� ������ �� ����.
			System.out.print(e);
		}
		
		
	}

}
