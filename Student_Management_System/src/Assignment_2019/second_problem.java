package Assignment_2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class second_problem {
	
	//메인
	public static void main(String[] args) {
		

		
		System.out.printf("입력할 수(2~50) : ");  
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();					
		sc.nextLine();   //개행문자(엔터)를 제거하기 위해서 추가
		System.out.printf(num+"개의 다른 수를 입력하시오(1~100,spacebar로 구분) : ");		
		String list = sc.nextLine();  
		sc.close();
		
		second_problem two = new second_problem();
		two.setN(num);
		two.num_list(list);
		two.excute_program();

	}

	
	
	//필드
	int n;
	List<Integer> list = new ArrayList<Integer>();
	List<Integer> mult = new ArrayList<Integer>();
	
	
	
	//메소드
	void setN(int x)//n값 입력
		{ n = x;}
	
	
	int getN()   //n값 호출
		{return n;}
	
	List<Integer> getlist() //list 호출
		{return list;}
	
	void num_list (String x) {	//2번쨰 입력을 리스트로 변환하는 메소드
		List<Integer> listA = new ArrayList<Integer>();
		String[] arStrRegexMultiSpace = x.split("\\s+");	// split 사용
		for (int i = 0; i < arStrRegexMultiSpace.length; i++) 
			{listA.add( Integer.parseInt(arStrRegexMultiSpace[i]));}	// String 에서 Int로 형변환
		
		TreeSet<Integer> listB = new TreeSet<Integer>(listA);   //중복 제거
		List<Integer> listC = new ArrayList<Integer>(listB);	//오름차순 정렬		
		
		list = listC;
			
		
	}	
	
	void solve() {	//계산 메소드
		int a;
		int b;		
		for(int i = 1; i < n-1 ; i++) {
			b = list.get(n-i);		
			for( int j =0; j < n-i ;j++) {
				a = list.get(j);
				if((a+b)%2==0 || (b-a)%2==0 ) {
					mult.add((a+b)/2);
					mult.add((b-a)/2);
					mult.add((a+b)/2*((b-a)/2));
				}

			}
		}
	}		

	
	void excute_program() {  //실행 메소드
		if(n>=2 && n <=50) {
			if(list.size()==n) {
				solve();
				System.out.println("출력 : "+mult.get(0)+"x"+mult.get(1)+"="+mult.get(2));
			}
			else 
			{System.out.println("중복된 수가 있거나 입력한 수가 잘못되었습니다.");}		
		}
		else
			{System.out.println("입력 수를 2~50사이의 정수를 입력하시오");}		
	}
}

