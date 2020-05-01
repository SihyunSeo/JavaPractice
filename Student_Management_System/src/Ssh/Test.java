package Ssh;

import java.util.ArrayList;
import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		
		int StudentCount = 0;
		Lecture lect1 = new Lecture("자바프로그래밍1", "박현준");
		
		Student student1 = new Student("16422014", "서시현", 24, true, "010-5626-0610");
		Student student2 = new Student("16422039", "고원지", 25, true, "010-1234-5678");
		Student student3 = new Student("16422033", "임동근", 25, false, "010-2345-6789");
		Student student4 = new Student("16422017", "박현구", 24, true, "010-9876-5432");
		student1.print();

		lect1.AddStudent(student1);
		lect1.AddStudent(student2);
		lect1.AddStudent(student3);
		lect1.AddStudent(student4);
		
		//lect1.print();
		
		Scanner in = new Scanner(System.in);
		System.out.printf("이름을 입력하시오: ");
		String inName = in.next();
		
		System.out.println("입력받은 학생의 정보입니다.");
		lect1.printByName(inName);
		
		Scanner in1 = new Scanner(System.in);
		System.out.printf("학번을 입력하시오: ");
		String in1Id = in1.next();
		
		System.out.println("입력받은 학생의 정보입니다.");
		lect1.printById(in1Id);
	}

}
