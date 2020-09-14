package first_semester;

public class Chap_06_prac_6_3 extends Circle {

	public static void main(String[] args) {
		Circle c1 = new Circle();
		Ball c2 = new Ball("»¡°£»ö");
		
		System.out.println("¿ø : ");
		c1.findRadius();
		c1.findArea();
		
		System.out.println("\n°ø : ");
		c2.findRadius();
		c2.findColor();
		c2.findArea();
		c2.findVolume();
		

	}

}
