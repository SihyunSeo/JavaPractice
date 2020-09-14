package first_semester;

public class LocalVariableDemo {

	public static void main(String[] args) {
		int a = 0;
		double b = 0;
		
		//System.out.print(b);     //초기화되지 않고는 사용할 수 없다.
		//System.out.print(a+c);   //c 변수는 아직 선언되지 않았기 때문에 사용할 수 없다.
		
		int c = 0;
		
		//public double d = 0.0;	// 지역 변수는 public 으로 지정할 수 없다.
		
		for(int e = 0; e<10; e++) {
			//int a = 1;  	// 3행에서 선언된 지역 변수 이름이다. 블록이 달라도 같은 이름으로는 다시 선언할 수 없다.
			System.out.print(e);
		}
		
		
	}

}
