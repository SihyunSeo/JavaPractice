package first_semester;

class Phone {
	String model;
	int value;
	
	void print() {
		System.out.println(value + "�� ��¥��" + model + "����Ʈ��");
	}
}


public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();   //phone Ÿ���� ��ü�� ������ �� myphone�̶�� ���� ������ ����
		myPhone.model = "������ S8";   // ��ü�� �ʵ忡 ���� �����Ѵ�
		myPhone.value = 100;      // ��ü�� �ʵ忡 ���� �����Ѵ�
		myPhone.print();  //��ü�� �޼��带 ȣ���Ѵ�.
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
	}
}