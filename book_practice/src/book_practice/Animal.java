package book_practice;

class AnimalDemo{
	public AnimalDemo(String s) {
		System.out.println("���� : " + s);
	}
}

class Mammal extends AnimalDemo{
	public Mammal() {
		super("������");
		System.out.println("������ : ������");
	}
	public Mammal(String s) {
		super(s);
		System.out.println("������ : " + s);
	}
}

public class Animal {

	public static void main(String[] args) {
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("����");

	}

}
