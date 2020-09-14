package second_semester;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Chap_12_prac_12_02 {

	public static void main(String[] args) {
		String input = "C:\\Users\\Sihyun\\Desktop\\prac.txt";
		String output = "C:\\Users\\Sihyun\\Desktop\\prac.txt";
		
		try(FileInputStream fis = new FileInputStream(input) ;
			FileOutputStream fos = new FileOutputStream(output)) {
			int c;
			
			while((c = fis.read()) != -1)
				fos.write(c);
		} catch (IOException e) {
			
		}
	}

}
