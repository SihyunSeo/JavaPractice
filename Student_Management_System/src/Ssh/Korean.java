package Ssh;

public class Korean extends Student implements StudentForm {
	String hometown;
	
	public Korean(String id, String name, int age, boolean gender, String contact, String hometown) // 생성자
	{
		super(id, name, age, gender, contact); // 부모의 생성자를 호출
		
		this.hometown = hometown;
	}
	
	String getHometow()
	{
		return hometown;
	}
	
	void setHometown(String hometown) // 설정자
	{
		this.hometown = hometown;
	}
	
	//박현준 학생은 내국인입니다. 학번은 ******, 나이는 **살, ***도시에서 태어났습니다.
	@Override //오버라이딩은 Student 메서드 print와 동일해야 한다. 따라서 복붙하는게 나음
	public void print()
	{
		System.out.println(strName + "학생은 내국인입니다. 학번은" + strID + ", 나이는" + Age + "살, " + hometown + " 도시에서 태어났습니다.");
	}

	@Override
	public void GetOrigin() 
	{
		System.out.println("고향은" + hometown + "입니다.");
	}
}
