package first_semester;
import java.io.IOException;

public class Chap_12_prac_12_1 {

	public static void main(String[] args) throws IOException {
		int b, len = 0;
		int ba[] = new int[100];
		
		System.out.println("--- �Է� ��Ʈ�� ---");
		while((b = System.in.read()) != '\n'){                  //�ٹٲ� ���ڰ� ���� ������ Ű����� �Է��� �����͸� ���� ������ �����Ѵ�.
				System.out.printf("%c(%d)", (char) b, b);       //int Ÿ���� charŸ������ ��ȯ�ؾ� �Ѵ�.
				ba[len++] = b;
		}
		
		System.out.println("\n\n--- ��� ��Ʈ�� ---");
		for(int i = 0; i < len; i ++)                          //�� ����Ʈ�� �Էµ� �����͸� ����Ѵ�.
			System.out.write(ba[i]);
		
		System.out.flush();    //System.out.close();

	}

}
