package Ssh;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int StudentCount = 0;
		Lecture lect1 = new Lecture("�ڹ����α׷���1", "������");
		
		Student student1 = new Student("16422014", "������", 24, true, "010-5626-0610");
		Student student2 = new Student("16422039", "�����", 25, true, "010-1234-5678");
		Student student3 = new Student("16422033", "�ӵ���", 25, false, "010-2345-6789");
		Student student4 = new Student("16422017", "������", 24, true, "010-9876-5432");
		student1.print();

		lect1.AddStudent(student1);
		lect1.AddStudent(student2);
		lect1.AddStudent(student3);
		lect1.AddStudent(student4);
		
		//lect1.print();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("�̸��� �Է��Ͻÿ�: ");
		String inName = in.next();
		
		System.out.println("�Է¹��� �л��� �����Դϴ�.");
		lect1.printByName(inName);
		
		Scanner in1 = new Scanner(System.in);
		System.out.printf("�й��� �Է��Ͻÿ�: ");
		String in1Id = in1.next();
		
		System.out.println("�Է¹��� �л��� �����Դϴ�.");
		lect1.printById(in1Id);
	}

}
