package first_semester;

import java.util.ArrayList;

class Route {
	String a;
	String fileName;
	int findNum = 0;
	int endNum = 0;
	void print() {
		System.out.println(a);
	}
	
	void show() {
		for(int i = 0; i < a.length(); i++) {   // 마지막 '\\'의 주소 검출 후 findNum에 주소값 저장
			if(a.charAt(i) == '\\')
			{
				findNum = i;
			}
			if(a.charAt(i) == '.')
			{
				endNum = i;
			}
		}
		System.out.println(a.substring(findNum+1, endNum));
		fileName = a.substring(findNum+1, endNum);
	}
}

public class Quest_Wonji_01 {

	public static void main(String[] args) {
		
		ArrayList nameList = new ArrayList();
		
		Route one = new Route();
		one.a = "C:\\Users\\wonji\\Desktop\\기타 폴더\\캡처.PNG";
		Route two = new Route();
		two.a = "C:\\Users\\wonji\\Desktop\\cppPractice\\Hello.cpp";
		
		//one.print();
		//two.print();
		
		one.show();
		two.show();
		
		nameList.add(one.fileName);
		nameList.add(two.fileName);
		nameList.add("기모링");
		
		System.out.println(nameList);
		System.out.println(nameList.size());
		System.out.println(one.fileName.length());

	}

}
