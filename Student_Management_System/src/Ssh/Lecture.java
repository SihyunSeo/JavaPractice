package Ssh;

import java.util.Scanner;

public class Lecture {
	//�����, ��米��
	
	String strName;            //�����
	String strProfessor;       //��米��
			
	public Lecture(String name, String professor)  //������
	{
		this.strName = name;
		this.strProfessor = professor;
	}
	
	String getName() //������
	{
		return strName;
	}
	void setName(String name) //������
	{
		this.strName = name;
	}
	String getProfessor() //������
	{
		return strProfessor;
	}
	void setProfessor(String professor) //������
	{
		this.strProfessor = professor;
	}


}
