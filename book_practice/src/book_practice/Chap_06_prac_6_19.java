package book_practice;

public class Chap_06_prac_6_19 {

	public static void main(String[] args) {
		
		Chap_06_prac_6_17 s = new Chap_06_prac_6_17();
		Chap_06_prac_6_16 p = new Chap_06_prac_6_16();
		
		System.out.println(s instanceof Chap_06_prac_6_16);
		
		System.out.println(s instanceof Chap_06_prac_6_17);
		
		System.out.println(p instanceof Chap_06_prac_6_17);
		
		downcast(s);

	}

	static void downcast(Chap_06_prac_6_16 p) {
		if (p instanceof Chap_06_prac_6_17) {
			Chap_06_prac_6_17 s = (Chap_06_prac_6_17) p;
			System.out.println("오케이, 하향 타입 변환");
		}
	}
}
