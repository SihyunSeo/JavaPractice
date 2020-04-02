package book_practice;

class animals  //부모 클래스
{
	public animals(String s)
	{
		System.out.println(s + "는 눈,코,입 을 가지고 있고 움직일 수 있다.");
		System.out.println(s + "가 섭취한 것은 배설물을 통해 배출한다.");
	}
	void eat(String s)
	{
		System.out.println(s + "똥");
	}
}

class animalss extends animals //자식 클래스
{
	public animalss(String s)
	{
		super(s);
	}
	void show(String s)
	{
		System.out.println(s + "는 조류이며 날수있다.");
	}
	void show1(String s)
	{
		System.out.println(s + "는 포유류이며 달릴수 있다.");
	}
	void show2(String s)
	{
		System.out.println(s + "는 어류이며 헤엄칠수 있다.");
	}
}

public class Quest_Wonji_03 {

	public static void main(String[] args) {
		animalss bird = new animalss("새");
		bird.eat("새");
		bird.show("새");
		animalss lion = new animalss("사자");
		lion.eat("사자");
		lion.show1("사자");
		animalss fish = new animalss("물고기");
		fish.eat("물고기");
		fish.show2("물고기");

	}

}
