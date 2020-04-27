package Ssh;

public class Test {

	public static void main(String[] args) {
		Lecture lect1 = new Lecture("자바프로그래밍1", "박현준");
		
		Student student1 = new Student("16422014", "서시현", 24, true, "010-5626-0610");
		student1.print();
	}

}
