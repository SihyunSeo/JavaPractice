package first_semester;

class ballDemo {
	String name;
	
	void shoot() {
		System.out.println(name + "이 통통 튀긴다");
	}
}	

public class Ball_Quest {

	public static void main(String[] args) {
		
		ballDemo type1 = new ballDemo();
		type1.name = "soccerball";
		type1.shoot();
		
		ballDemo type2 = new ballDemo();
		type2.name = "basketball";
		type2.shoot();
	}
	
}
