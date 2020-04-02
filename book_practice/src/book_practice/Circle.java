package book_practice;

public class Circle {
	private void secret() {  //해당 파일 내에서만 호출이가능
		System.out.println("비밀이다.");
		
	}
	
	protected void findRadius() {  //연관성을 가진 파일에 대해서만 호출가능
		System.out.println("반지름이 10.0 센티이다.");
	}
	
	public void findArea() {     //public은 어디서 파일을 불러오든 호출 가능
		System.out.println("넓이는 (π * 반지름 * 반지름)이다.");
	}

}
