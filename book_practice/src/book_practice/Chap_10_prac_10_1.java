package book_practice;

import java.util.StringTokenizer;

public class Chap_10_prac_10_1 {

	public static void main(String[] args) {
		
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens()) {
			System.out.println(st.nextToken() + "+");
		}
		System.out.println(st.nextToken());
	}

}
