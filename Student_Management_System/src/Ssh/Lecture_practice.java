package Ssh;

import java.util.Scanner;
import java.util.ArrayList;

public class Lecture_practice {
	//�����, ��米��
	String strName;            //�����
	String strProfessor;       //��米��
	static int putNum = 0;
	
	public Lecture_practice(String name, String professor)  //������
	{
		this.strName = name;
		this.strProfessor = professor;
		this.putNum ++;
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
	public static void main(String[] args)
	{
		
		Scanner count = new Scanner(System.in);
		System.out.print("�����ϴ� ������ ������ �Է��Ͻÿ�: ");
		int nameCount = count.nextInt();
		
		ArrayList<String> list1 = new ArrayList<>();
		
		for(int num = 0; num < nameCount; num++)
		{
			Scanner putName = new Scanner(System.in);
			System.out.print("������� �Է��Ͻÿ�: ");
			String name = putName.next();

			
			Scanner putProfessor = new Scanner(System.in);
			System.out.print("��米���� �Է��Ͻÿ�: ");
			String professor = putProfessor.next();
			list1.add(name+" : "+professor);
		}
		for(String i : list1) 
		{
			System.out.println(i);
		}
		System.out.println(putNum);

	}

}
