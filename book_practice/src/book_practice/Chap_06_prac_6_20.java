package book_practice;

public class Chap_06_prac_6_20 {

	public static void main(String[] args) {

		Vehicle v = new Car();
		System.out.println(v.name);
		v.whoami();
		v.move();

	}

}

class Vehicle {
	String name = "Ż ��";
	
	void whoami() {
		System.out.println("���� Ż ���̴�");
	}
	
	static void move() {
		System.out.println("�̵��ϴ�.");
	}
}

class Car extends Vehicle{
	String name = "�ڵ���";
	
	void whoami() {
		System.out.println("���� �ڵ����̴�.");
		
	}
	
	static void move() {
		System.out.println("�޸���.");
	}
}
