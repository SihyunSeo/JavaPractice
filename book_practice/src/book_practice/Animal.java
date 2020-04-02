package book_practice;

class AnimalDemo{
	public AnimalDemo(String s) {
		System.out.println("동물 : " + s);
	}
}

class Mammal extends AnimalDemo{
	public Mammal() {
		super("원숭이");
		System.out.println("포유류 : 원숭이");
	}
	public Mammal(String s) {
		super(s);
		System.out.println("포유류 : " + s);
	}
}

public class Animal {

	public static void main(String[] args) {
		Mammal ape = new Mammal();
		Mammal lion = new Mammal("사자");

	}

}
