package second_semester;

import java.io.InputStream;
import java.io.*;

public class Chap_12_prac_12_07 {

	public static void main(String[] args) {
		String input = "C:\\Users\\Sihyun\\Desktop\\prac.txt";
		
		try(FileInputStream fi = new FileInputStream(input);
			InputStreamReader in = new InputStreamReader(fi, "UTF-8")) {
			int c;
			
			System.out.println(in.getEncoding());
			while((c = in.read()) != -1)
				System.out.print((char) c);
		} catch (IOException e) {
		}
				

	}

}
