package Ssh;

public class Korean extends Student implements StudentForm {
	String hometown;
	
	public Korean(String id, String name, int age, boolean gender, String contact, String hometown) // ������
	{
		super(id, name, age, gender, contact); // �θ��� �����ڸ� ȣ��
		
		this.hometown = hometown;
	}
	
	String getHometow()
	{
		return hometown;
	}
	
	void setHometown(String hometown) // ������
	{
		this.hometown = hometown;
	}
	
	//������ �л��� �������Դϴ�. �й��� ******, ���̴� **��, ***���ÿ��� �¾���ϴ�.
	@Override //�������̵��� Student �޼��� print�� �����ؾ� �Ѵ�. ���� �����ϴ°� ����
	public void print()
	{
		System.out.println(strName + "�л��� �������Դϴ�. �й���" + strID + ", ���̴�" + Age + "��, " + hometown + " ���ÿ��� �¾���ϴ�.");
	}

	@Override
	public void GetOrigin() 
	{
		System.out.println("������" + hometown + "�Դϴ�.");
	}
}
