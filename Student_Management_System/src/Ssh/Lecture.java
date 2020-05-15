package Ssh;

	public class Lecture {
		
		//과목명, 담당교수
		private String strName;            //과목명
		private String strProfessor;       //담당교수
		private static int putNum = 0;
		
		Student students[] = new Student[100];
		int numOfStudent;
		
				
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
		void AddStudent(Student inform) // 학생 정보 저장
		{
			students[numOfStudent] = inform; 
			numOfStudent ++;
		}
		void print() // 수강생 전체 정보 출력
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				students[i].print();
			}
			
		}
		void printByName(String name) // 이름으로 학생정보 찾기
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				if(name.equals(students[i].getName()))
				{
					students[i].print();
				}
			}
		}
		void printById(String id) // 학번으로 학생정보 찾기
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				if(id.equals(students[i].getID()))
				{
					students[i].print();
				}
			}
		}
}
