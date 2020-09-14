package second_semester;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class Chap_12_prac_12_06 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sihyun\\Desktop\\prac.txt"));) {
			br.lines().forEach(s -> System.out.println(s));
		} catch(IOException e) {
			
		}

	}

}
