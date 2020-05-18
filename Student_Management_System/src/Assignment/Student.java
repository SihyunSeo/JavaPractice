package Assignment;

public class Student {
	//학번, 이름, 나이, 성별, 연락처
	
		String strID;      //학번
		String strName;    //이름
		int Age;          //나이
		boolean bGender;   //성별 true = 남자, false = 여자
		String strContact; //연락처
		
		
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
				System.out.println(strName + "학생의 학번은: " + strID + " 나이는: " + Age + "살, 남자입니다.");
			else
				System.out.println(strName + "학생의 학번은: " + strID + " 나이는: " + Age + "살, 여자입니다.");
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
