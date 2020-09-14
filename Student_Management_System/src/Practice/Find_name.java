package Practice;

public class Find_name {

	public static void main(String[] args) {
		//"박헌준박현춘박현츈박현준박현주박현준박현준박현조벅현주박혀주박휴주~~~" 문자열에서 "박현준"이 몇번 나왔나 계산해 보시오.
		
		Method_find_name find = new Method_find_name();
		
		System.out.println(find.findName("박헌준박현춘박현츈박현준박현주박현준박현준박현조벅현주박혀주박휴주~~~"));
		
		find.prac("박현준박현조벅현주박혀주박휴주~~~");
		find.substring("박현준박현조벅현주박혀주박휴주~~~");
	}

}
