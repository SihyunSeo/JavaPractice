package book_practice;

class Circles {
	double radius;
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("반지름 = %.1f, 넓이 = %.1f\n ", x, y);
	}
}

public class Chap_04_prac_4_4 {

	public static void main(String[] args) {
		Circles myCircle = new Circles();
		myCircle.radius = 10.0;
		myCircle.show(myCircle.radius, myCircle.findArea());
		

	}

}
