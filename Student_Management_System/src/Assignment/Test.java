package Assignment;

public class Test {
	
	public static void main(String[] args)
	{
		
		Lecture lect1 = new Lecture("�ڹ����α׷���1", "������");
		
		Student student1 = new Student("16422014", "������", 24, true, "010-5626-0610");
		Student student2 = new Student("16422000", "ȫ�浿", 27, true, "010-1234-5678");
		Student student3 = new Student("16422001", "��浿", 28, true, "010-5678-9123");
		student1.print();
		
		lect1.AddStudent(student1);
		lect1.AddStudent(student2);
		lect1.AddStudent(student3);
		
		lect1.print();
		lect1.printByName("��浿");
		lect1.printById("16422014");
	}
}
