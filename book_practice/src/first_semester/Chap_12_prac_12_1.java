package first_semester;
import java.io.IOException;

public class Chap_12_prac_12_1 {

	public static void main(String[] args) throws IOException {
		int b, len = 0;
		int ba[] = new int[100];
		
		System.out.println("--- 입력 스트림 ---");
		while((b = System.in.read()) != '\n'){                  //줄바꿈 문자가 나올 때까지 키보드로 입력한 데이터를 정수 변수에 대입한다.
				System.out.printf("%c(%d)", (char) b, b);       //int 타입을 char타입으로 변환해야 한다.
				ba[len++] = b;
		}
		
		System.out.println("\n\n--- 출력 스트림 ---");
		for(int i = 0; i < len; i ++)                          //한 바이트씩 입력된 데이터를 출력한다.
			System.out.write(ba[i]);
		
		System.out.flush();    //System.out.close();

	}

}
