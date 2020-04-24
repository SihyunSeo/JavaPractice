package Ssh;

import java.util.Scanner;

public class Test {

	public static void main(String[] args) {
		Lecture_practice lect1 = new Lecture_practice("자바프로그래밍1", "박현준");
		
		Scanner in = new Scanner(System.in);
		System.out.print("교수명을 입력하시오: ");
		String put1 = in.next();
		System.out.print("과목명을 입력하시오: ");
		String put2 = in.next();
		
		Student student1 = new Student("16422014", "서시현", 24, true, "010-5626-0610");
		student1.print();
		System.out.println(student1.getName());
		student1.setName("고원지");
		System.out.println(student1.getName());
		
		Lecture lecture1 = new Lecture("파이썬", "구흥서");
		Lecture lecture2 = new Lecture("자료구조", "박현준");
		Lecture lecture3 = new Lecture(put2, put1);
		System.out.println(lecture1.getLectureCount());
		System.out.println(lecture2.getLectureCount());
		
		
		System.out.println(lecture3.getProfessor());
		System.out.println(lecture3.getProfessor() + lecture3.getName());
	}

}
