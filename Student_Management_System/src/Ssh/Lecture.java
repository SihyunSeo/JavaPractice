package Ssh;

import java.util.Scanner;
import java.util.ArrayList;

public class Lecture {
	//과목명, 담당교수
	String strName;            //과목명
	String strProfessor;       //담당교수
			
	public Lecture(String name, String professor)  //생성자
	{
		this.strName = name;
		this.strProfessor = professor;
	}
	
	String getName() //접근자
	{
		return strName;
	}
	void setName(String name) //설정자
	{
		this.strName = name;
	}
	String getProfessor() //접근자
	{
		return strProfessor;
	}
	void setProfessor(String professor) //설정자
	{
		this.strProfessor = professor;
	}
	public static void main(String[] args)
	{
		
		Scanner count = new Scanner(System.in);
		System.out.print("수강하는 과목의 개수를 입력하시오: ");
		int nameCount = count.nextInt();
		
		ArrayList<String> list1 = new ArrayList<>();
		
		for(int num = 0; num < nameCount; num++)
		{
			Scanner putName = new Scanner(System.in);
			System.out.print("과목명을 입력하시오: ");
			String name = putName.next();

			
			Scanner putProfessor = new Scanner(System.in);
			System.out.print("담당교수를 입력하시오: ");
			String professor = putProfessor.next();
			list1.add(name+" : "+professor);
		}
		for(String i : list1) 
		{
			System.out.println(i);
		}
		

	}

}
