package Ssh;

	public class Lecture {
		
		//과목명, 담당교수
		private String strName;            //과목명
		private String strProfessor;       //담당교수
		private static int putNum = 0;
		
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
}
