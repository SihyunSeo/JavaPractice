package Assignment;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {
	
	public static void main(String[] args)
	{
		String line = "-";
		String lines = line.repeat(50);
		Lecture lect1 = new Lecture("자바프로그래밍1", "박현준");
		
		Student student1 = new Student("16422014", "서시현", 24, true, "010-5626-0610");
		lect1.AddStudent(student1);
		student1.print();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("이름을 입력하시오: ");
		String inName = in.next();
		System.out.println("입력받은 학생의 정보입니다.");
		System.out.println(lines);
		lect1.printByName(inName);
		System.out.println();
		
		Scanner in1 = new Scanner(System.in);
		System.out.printf("학번을 입력하시오: ");
		String in1Id = in1.next();
		System.out.println("입력받은 학생의 정보입니다.");
		System.out.println(lines);
		lect1.printById(in1Id);
	}
}
