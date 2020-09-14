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
	
	//박현준 학생은 외국인입니다. 학번은 ********, 나이는 **살, ***국가 출신입니다.
	@Override
	public void print()
	{
		System.out.println(strName + "학생은 외국인입니다. 학번은" + strID + ", 나이는" + Age + "살, " + nationality + " 국가 출신입니다.");
	}

	@Override
	public void GetOrigin() {
		System.out.println("국적은 " + nationality + "입니다.");
		
	}
}
