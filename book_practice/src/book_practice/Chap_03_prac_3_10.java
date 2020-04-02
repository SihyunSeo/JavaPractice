package book_practice;

public class Chap_03_prac_3_10 {

	public static void main(String[] args) {
		
		int num1 = 2; //2단부터 시작한다
		while (num1 < 10) {  //num1값이 10보다 작을때까지 실행한다
			int num2 = 1;  
			while(num2 < 10) {  //num2값이 10보다 작을때까지 실행한다
				System.out.printf("%4d", num1 * num2);
				num2 ++ ;
			}
			System.out.println();
			num1 ++ ;
		}
	}

}
