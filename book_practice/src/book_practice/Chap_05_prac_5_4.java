package book_practice;

public class Chap_05_prac_5_4 {

	public static void main(String[] args) {

		int i = 7;
		
		System.out.println("Java " + i);
		System.out.println("Java " + 7);
		System.out.println(7 + 1 + "Java " + 7 + 1);

		
		String j = "7";
		String s1, s2 ;
		String s3 = "1";
		
		String k = "Java ";
		
		k = k.concat(j);
		s1 = k.concat(s3);
		
		System.out.println(s1);
		
	}

}
