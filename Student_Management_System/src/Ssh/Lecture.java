package Ssh;

	public class Lecture {
		
		//�����, ��米��
		private String strName;            //�����
		private String strProfessor;       //��米��
		private static int putNum = 0;
		
		public Lecture(String name, String professor)  //������
		{
			this.strName = name;
			this.strProfessor = professor;
			this.putNum ++;
		}
		public int getLectureCount()
		{
			return this.putNum;
		}
		String getName() //������
		{
			return strName;
		}
		void setName(String name) //������
		{
			this.strName = name;
		}
		String getProfessor() //������
		{
			return strProfessor;
		}
		void setProfessor(String professor) //������
		{
			this.strProfessor = professor;
		}
}
