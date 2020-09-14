package second_semester;

import java.io.*;

public class Chap_12_prac_12_04 {

	public static void main(String[] args) {
		try(DataOutputStream dos = new DataOutputStream(new FileOutputStream("C:\\Users\\Sihyun\\Desktop\\prac.txt"));
				DataInputStream dis = new DataInputStream(new FileInputStream("C:\\Users\\Sihyun\\Desktop\\prac.txt"));){
			
			dos.writeChars("1.0");
			dos.writeChars("1");
			dos.writeChars("A");
			
			dos.flush();
			dos.close();
			System.out.println(dis.readLine());

		} catch (IOException e) {
			
		}

	}

}
