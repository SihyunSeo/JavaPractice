package second_semester;

import java.io.*;

public class Chap_12_prac_12_05 {

	public static void main(String[] args) {
		String input = "C:\\Users\\Sihyun\\Desktop\\prac.txt";
		String output = "C:\\Users\\Sihyun\\Desktop\\prac1.txt";
		
		try(FileReader fr = new FileReader(input);
				FileWriter wr = new FileWriter(output)) {
			int c;
			
			while((c = fr.read()) != -1)
				wr.write(c);
		} catch(IOException e) {
			
		}
	}

}
