package Ssh;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Lecture_practice lect1 = new Lecture_practice("�ڹ����α׷���1", "������");
		
		Scanner in = new Scanner(System.in);
		System.out.print("�������� �Է��Ͻÿ�: ");
		String put1 = in.next();
		System.out.print("������� �Է��Ͻÿ�: ");
		String put2 = in.next();
		
		Student student1 = new Student("16422014", "������", 24, true, "010-5626-0610");
		student1.print();
		System.out.println(student1.getName());
		student1.setName("�����");
		System.out.println(student1.getName());
		
		Lecture lecture1 = new Lecture("���̽�", "���Ｍ");
		Lecture lecture2 = new Lecture("�ڷᱸ��", "������");
		Lecture lecture3 = new Lecture(put2, put1);
		System.out.println(lecture1.getLectureCount());
		System.out.println(lecture2.getLectureCount());
		
		
		System.out.println(lecture3.getProfessor());
		System.out.println(lecture3.getProfessor() + lecture3.getName());
	}

}
