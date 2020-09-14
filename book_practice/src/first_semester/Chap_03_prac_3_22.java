package first_semester;

public class Chap_03_prac_3_22 {

	public static void main(String[] args) {
		int x = 0;
		System.out.println("increment() 메서드를 호출하기 전의  x는 " + x);
		increment(x);
		System.out.println("increment() 메서드를 호출한 후의 x는 " + x);
		

	}
	
	public static void increment(int n) {
		System.out.println("increment() 메서드를 시작할 떄의 n은 " + n);
		n++;
		System.out.println("increment() 메서드가 끝날 떄의 n은 " + n);
	}

}
