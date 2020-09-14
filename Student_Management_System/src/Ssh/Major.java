package Ssh;

public class Major extends Student 
{
	String major;
	
	public Major(String id, String name, int age, boolean gender, String contact, String major) 
	{
		super(id, name, age, gender, contact);
		
		this.major = major;
	}

	String getMajor()
	{
		return major;
	}
	
	void setMajor(String major)
	{
		this.major = major;
	}
	
	
	@Override
	void print()
	{
		super.print();
		System.out.println(strName + " �л��� " + major + "�а� �Դϴ�.");
	}
}
