package second_semester;

public class Chap_10_prac_10_05 {

	public static void main(String[] args) {
		int divident = 10;
		try
		{
			int divisor = Integer.parseInt(args[0]);
			System.out.println(divident / divisor);
		} catch(ArrayIndexOutOfBoundsException e){
			System.out.println("원소가 존재하지 않습니다.");
		} catch(NumberFormatException e){ // main 메서드의 인수를 숫자로 바꿀수 없을때
			System.out.println("숫자가 아닙니다.");
		} catch(ArithmeticException e){ // main 메서드의 인수가 0일때
			System.out.println("0으로 나눌수 없습니다.");
		} finally{
			System.out.println("항상 실행됩니다.");
		}
		System.out.println("종료");

	}

}
