package Assignment;

import java.util.ArrayList;

public class Lecture {
		
		//�����, ��米��
		private String strName;            //�����
		private String strProfessor;       //��米��
		private static int putNum = 0;
		
		ArrayList<Student> arrayStudents = new ArrayList<Student>();
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
			arrayStudents.add(inform);
			numOfStudent ++;
		}
		void print() // ������ ��ü ���� ���
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				arrayStudents.get(i);
			}
			
		}
		void printByName(String name) // �̸����� �л����� ã��
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				if(arrayStudents.get(i).getName().equals(name))
				{
					arrayStudents.get(i).print();;
				}
			}
		}
		void printById(String id) // �й����� �л����� ã��
		{
			for(int i = 0; i < numOfStudent; i ++)
			{
				if(arrayStudents.get(i).getID().equals(id))
				{
					arrayStudents.get(i).print();
				}
			}
		}

}
