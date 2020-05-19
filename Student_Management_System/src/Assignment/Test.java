package Assignment;

public class Test {
	
	public static void main(String[] args)
	{
		
		Lecture lect1 = new Lecture("자바프로그래밍1", "박현준");
		
		Student student1 = new Student("16422014", "서시현", 24, true, "010-5626-0610");
		Student student2 = new Student("16422000", "홍길동", 27, true, "010-1234-5678");
		Student student3 = new Student("16422001", "고길동", 28, true, "010-5678-9123");
		student1.print();
		
		lect1.AddStudent(student1);
		lect1.AddStudent(student2);
		lect1.AddStudent(student3);
		
		lect1.print();
		lect1.printByName("고길동");
		lect1.printById("16422014");
	}
}
