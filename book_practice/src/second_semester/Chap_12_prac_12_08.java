package second_semester;

import java.io.BufferedReader;
import java.io.PrintWriter;
import java.io.*;
public class Chap_12_prac_12_08 {

	public static void main(String[] args) {
		try(BufferedReader br = new BufferedReader(new FileReader("C:\\Users\\Sihyun\\Desktop\\prac.txt"));
				PrintWriter pr = new PrintWriter(new FileWriter("C:\\Users\\Sihyun\\Desktop\\prac1.txt"));) {
			
			br.lines().forEach(x -> pr.println(x));
		} catch(IOException e) {
			
		}

	}

}
