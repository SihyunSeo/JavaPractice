package Ssh;

public class Foreigner extends Student implements StudentForm{
	
	String nationality;
	
	public Foreigner(String id, String name, int age, boolean gender, String contact, String nationality)
	{
		super(id, name, age, gender, contact);
		
		this.nationality = nationality;
	}
	
	void setNationality(String nat)
	{
		this.nationality = nat;
	}
	
	String getNationality()
	{
		return nationality;
	}
	
	//������ �л��� �ܱ����Դϴ�. �й��� ********, ���̴� **��, ***���� ����Դϴ�.
	@Override
	public void print()
	{
		System.out.println(strName + "�л��� �ܱ����Դϴ�. �й���" + strID + ", ���̴�" + Age + "��, " + nationality + " ���� ����Դϴ�.");
	}

	@Override
	public void GetOrigin() {
		System.out.println("������ " + nationality + "�Դϴ�.");
		
	}
}
