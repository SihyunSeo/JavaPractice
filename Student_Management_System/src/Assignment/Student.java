package Assignment;

public class Student {
	//�й�, �̸�, ����, ����, ����ó
	
		String strID;      //�й�
		String strName;    //�̸�
		int Age;          //����
		boolean bGender;   //���� true = ����, false = ����
		String strContact; //����ó
		
		
		public Student(String id, String name, int age, boolean gender, String contact)
		{
			this.strID = id;
			this.strName = name;
			this.Age = age;
			this.bGender = gender;
			this.strContact = contact;
		}
		void print()
		{
			if(bGender == true)
				System.out.println(strName + "�л��� �й���: " + strID + " ���̴�: " + Age + "��, �����Դϴ�.");
			else
				System.out.println(strName + "�л��� �й���: " + strID + " ���̴�: " + Age + "��, �����Դϴ�.");
		}
		String getID()
		{
			return strID;
		}
		void setID(String id)
		{
			this.strID = id;
		}
		String getName()
		{
			return strName;
		}
		void setName(String name)
		{
			this.strName = name;
		}
		int getAge()
		{
			return Age;
		}
		void setAge(int age)
		{
			this.Age = age;
		}
		boolean getbGender()
		{
			return bGender;
		}
		void setbGender(boolean gender)
		{
			this.bGender = gender;
		}
		String getstrContact()
		{
			return strContact;
		}
		void setstrContact(String contact)
		{
			this.strContact = contact;
		}
}
