package second_semester;

import java.io.IOException;

public class Chap_12_prac_12_01 {

	public static void main(String[] args) throws IOException {
		int b, len = 0;
		int ba[] = new int[100];
		
		System.out.println("--- �Է� ��Ʈ�� ---");
		while((b = System.in.read()) != '\n')
		{
			System.out.printf("%c(%d)", (char)b, b);
			ba[len++] = b;
		}
		
		System.out.println("\n\n--- ��� ��Ʈ�� ---");
		for(int i = 0; i < len; i ++)
			System.out.write(ba[i]);
		
		System.out.flush(); //close

	}

}
