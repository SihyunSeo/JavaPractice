package Ssh;

	public class Lecture {
		
		//�����, ��米��
		private String strName;            //�����
		private String strProfessor;       //��米��
		private static int putNum = 0;
		
		Student students[] = new Student[100];
		int numOfStudent;
		
				
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
		void AddStudent(Student inform) // �л� ���� ����
		{
			students[numOfStudent] = inform; 
			numOfStudent ++;
		}
		void print() // ������ ��ü ���� ���
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				students[i].print();
			}
			
		}
		void printByName(String name) // �̸����� �л����� ã��
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				if(name.equals(students[i].getName()))
				{
					students[i].print();
				}
			}
		}
		void printById(String id) // �й����� �л����� ã��
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
