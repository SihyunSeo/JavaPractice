package book_practice;

class animals  //�θ� Ŭ����
{
	public animals(String s)
	{
		System.out.println(s + "�� ��,��,�� �� ������ �ְ� ������ �� �ִ�.");
		System.out.println(s + "�� ������ ���� �輳���� ���� �����Ѵ�.");
	}
	void eat(String s)
	{
		System.out.println(s + "��");
	}
}

class animalss extends animals //�ڽ� Ŭ����
{
	public animalss(String s)
	{
		super(s);
	}
	void show(String s)
	{
		System.out.println(s + "�� �����̸� �����ִ�.");
	}
	void show1(String s)
	{
		System.out.println(s + "�� �������̸� �޸��� �ִ�.");
	}
	void show2(String s)
	{
		System.out.println(s + "�� ����̸� ���ĥ�� �ִ�.");
	}
}

public class Quest_Wonji_03 {

	public static void main(String[] args) {
		animalss bird = new animalss("��");
		bird.eat("��");
		bird.show("��");
		animalss lion = new animalss("����");
		lion.eat("����");
		lion.show1("����");
		animalss fish = new animalss("�����");
		fish.eat("�����");
		fish.show2("�����");

	}

}
