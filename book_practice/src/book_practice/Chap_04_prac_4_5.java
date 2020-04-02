package book_practice;

class type{
	private double radius;
	
	public double getRadius() {
		return radius;
	}
	
	public void setRadius(double r) {
		this.radius = r;
	}
	
	double findArea() {
		return 3.14 * radius * radius;
	}
	
	void show(double x, double y) {
		System.out.printf("¹ÝÁö¸§ = %.1f ³ÐÀÌ = %.1f\n", x, y);
	}
}

public class Chap_04_prac_4_5 {

	public static void main(String[] args) {
		type myCircle = new type();
		myCircle.setRadius(10.0);
		myCircle.show(myCircle.getRadius(), myCircle.findArea());
		

	}

}
