package second_semester;
import java.util.*;
public class Chap_10_prac_10_04 {

	public static void main(String[] args) {
		int[] array = {0, 1, 2};
		try {
			System.out.println("마지막 원소 => " + array[3]); //두개의 print 문을 실행하지만 첫번째 print문에서  outofbounds 오류가 검출되어 바로 catch문을 실행 및 나머지 print 문을 실행한 결과각 나온다.
			System.out.println("첫 번째 원소 => " + array[0]);
		} catch(ArrayIndexOutOfBoundsException e) {
			System.out.println("원소가 존재하지 않습니다.");
		}
		System.out.println("아이쿠");
	}

}
