package first_semester;

public class Chap_10_prac_10_4 {

	public static void main(String[] args) {
		int[] array = {0, 1, 2};
		try {
			System.out.println("마지막 원소 = >" + array[3]);  //첫번쨰에서 예외 발생
			System.out.println("첫 번째 원소 = > " + array[0]); //첫번째 실행문 예외로 인해 출력 x
		} catch (ArrayIndexOutOfBoundsException e) {  //첫번째 실행문에서 발생한 예외로 인해 catch문 바로 실행
			System.out.println("원소가 존재하지 않습니다.");
		}
		System.out.println("어이쿠!!");
	}

}
