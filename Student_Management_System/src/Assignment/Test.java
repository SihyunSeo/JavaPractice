package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
		String line = "-";
		String lines = line.repeat(50);
		Lecture lect1 = new Lecture("�ڹ����α׷���1", "������");
		
		Student student1 = new Student("16422014", "������", 24, true, "010-5626-0610");
		lect1.AddStudent(student1);
		student1.print();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("�̸��� �Է��Ͻÿ�: ");
		String inName = in.next();
		System.out.println("�Է¹��� �л��� �����Դϴ�.");
		System.out.println(lines);
		lect1.printByName(inName);
		System.out.println();
		
		Scanner in1 = new Scanner(System.in);
		System.out.printf("�й��� �Է��Ͻÿ�: ");
		String in1Id = in1.next();
		System.out.println("�Է¹��� �л��� �����Դϴ�.");
		System.out.println(lines);
		lect1.printById(in1Id);
	}
}
