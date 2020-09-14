package first_semester;

import java.util.ArrayList;

class prac {
	String pracDemo;
	
	
	public prac(String s) // constructor
	{
		pracDemo = s;
	}
	void show() // 5번쨰까지의 이용자의 사용자명 출력
	{
		int showDemo = 0;
		showDemo = pracDemo.lastIndexOf('@');
		System.out.println(pracDemo.substring(1, showDemo) + " ");
	}
	
	void show1() // 5번쨰까지의 이용자의 이메일 address 출력
	{
		int showDemo = 0;
		showDemo = pracDemo.lastIndexOf('@');
		//System.out.println(pracDemo.length());
		System.out.println(pracDemo.substring(showDemo+1, pracDemo.length()) + " ");
	}
	void show2() // 5번째까지의 이용자의 이메일 address length 출력
	{
		int showDemo = 0;
		showDemo = pracDemo.lastIndexOf('@');
		System.out.println((pracDemo.substring(showDemo+1, pracDemo.length())).length() + " ");
	}
	
}

public class Quest_Wonji_02_1 {

	public static void main(String[] args) {
		
		String a = "<yeskang@yeskang.com><kang4you@assembly.go.kr><khk@gobundang.org><yskwon21@assembly.go.kr><koy@assembly.go.kr><master@chkwon.com><kkw604@assembly.go.kr><kt21@ktcamp.or.kr><kckim@assembly.go.kr><new21@assembly.go.kr><dr21@chol.com>";
		int b = 0;
		String[]exSplit=(a.split(">"));
		ArrayList prac1 = new ArrayList();
		
		for(int i = 0; i<a.length(); i++)  // 사용자 명수 뽑아내기
		{
			if(a.charAt(i) == '@')
			{
				b += 1;
			}
		}
		System.out.println("이용자는 총 " + b + "명입니다."); // split을 이용한 전체 이용자의 이메일 배열하기
		
		for(int j = 0; j<exSplit.length; j++)
		{
			prac1.add(exSplit[j].replace('<', ' '));
		}
		System.out.println(prac1);
		
		
		prac first = new prac(exSplit[0]);
		prac second = new prac(exSplit[1]);
		prac third = new prac(exSplit[2]);
		prac fourth = new prac(exSplit[3]);
		prac fifth = new prac(exSplit[4]);
		
		first.show();
		second.show();
		third.show();
		fourth.show();
		fifth.show();
		
		first.show1();
		second.show1();
		third.show1();
		fourth.show1();
		fifth.show1();
		
		first.show2();
		second.show2();
		third.show2();
		fourth.show2();
		fifth.show2();
	}
	

}
