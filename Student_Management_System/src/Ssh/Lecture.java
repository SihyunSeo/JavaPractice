package Ssh;

	public class Lecture {
		
		//과목명, 담당교수
		private String strName;            //과목명
		private String strProfessor;       //담당교수
		private static int putNum = 0;
		
		Student[] students = new Student[100];
		static int numOfStudent = 0;
		
				
		public Lecture(String name, String professor)  //생성자
		{
			this.strName = name;
			this.strProfessor = professor;
			this.putNum ++;
		}
		public int getLectureCount()
		{
			return this.putNum;
		}
		String getName() //접근자
		{
			return strName;
		}
		void setName(String name) //설정자
		{
			this.strName = name;
		}
		String getProfessor() //접근자
		{
			return strProfessor;
		}
		void setProfessor(String professor) //설정자
		{
			this.strProfessor = professor;
		}
		public void AddStudent(Student inform)
		{
			students[numOfStudent] = inform; 
			numOfStudent ++;
		}
		void print()
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				System.out.printf(students[i].getName() + "  ");
			}
			
		}
		void printByName(String name)
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				if(name.equals(students[i].getName()))
				{
					System.out.println(students[i].getID());
					System.out.println(students[i].getName());
					System.out.println(students[i].getAge());
					System.out.println(students[i].getbGender());
					System.out.println(students[i].getstrContact());
					System.out.println();
				}
			}
		}
		void printById(String id)
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				if(id.equals(students[i].getID()))
				{
					System.out.println(students[i].getID());
					System.out.println(students[i].getName());
					System.out.println(students[i].getAge());
					System.out.println(students[i].getbGender());
					System.out.println(students[i].getstrContact());
					System.out.println();
				}
			}
		}
}
