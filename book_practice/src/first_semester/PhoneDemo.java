package first_semester;

class Phone {
	String model;
	int value;
	
	void print() {
		System.out.println(value + "만 원짜리" + model + "스마트폰");
	}
}


public class PhoneDemo {
	public static void main(String[] args) {
		Phone myPhone = new Phone();   //phone 타입의 객체를 생성한 후 myphone이라는 참조 변수에 대입
		myPhone.model = "갤럭시 S8";   // 객체의 필드에 값을 대입한다
		myPhone.value = 100;      // 객체의 필드에 값을 대입한다
		myPhone.print();  //객체의 메서드를 호출한다.
		
		Phone yourPhone = new Phone();
		yourPhone.model = "G6";
		yourPhone.value = 85;
		yourPhone.print();
	}
}