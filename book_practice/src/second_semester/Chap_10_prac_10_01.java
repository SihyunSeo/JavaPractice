package second_semester;
import java.util.*;

public class Chap_10_prac_10_01 {

	public static void main(String[] args) {
		String s = "Time is money";
		StringTokenizer st = new StringTokenizer(s);
		
		while(st.hasMoreTokens())
		{
			System.out.print(st.nextToken() + ' ');
		}
		//System.out.println(st.nextToken());
	}

}
