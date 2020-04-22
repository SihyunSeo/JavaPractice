package Ssh;

import java.util.Scanner;

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


}
