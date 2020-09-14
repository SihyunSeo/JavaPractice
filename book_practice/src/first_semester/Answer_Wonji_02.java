package first_semester;

class userS
{
	String allUserName;
	String userName;
	String userAddress;
	
	public userS(String inputString) // Constructor
	{
		allUserName = inputString;
	}
	void printUserName() // 유저이름 출력
	{
		int golbangind = 0;
		golbangind = allUserName.lastIndexOf('@');
		System.out.println(allUserName.substring(1,golbangind));
	}
	void printUserAddress() // 유저 주소 출력
	{
		int golbangind = 0;
		golbangind = allUserName.lastIndexOf('@');
		System.out.println(allUserName.substring(golbangind+1, allUserName.length()));
		
	}
	void printUserAddressLen() // 주소 길이 출력
	{
		int golbangind = 0;
		golbangind = allUserName.lastIndexOf('@');
		String allUserAddress = allUserName.substring(golbangind+1, allUserName.length());
		System.out.println(allUserAddress.length());
	}
}

public class Answer_Wonji_02 {

	public static void main(String[] args) {
		String allName = "<yeskang@yeskang.com><kang4you@assembly.go.kr><khk@gobundang.org><yskwon21@assembly.go.kr><koy@assembly.go.kr><master@chkwon.com><kkw604@assembly.go.kr><kt21@ktcamp.or.kr><kckim@assembly.go.kr><new21@assembly.go.kr><dr21@chol.com>";
		String[]exSplit = (allName.split(">"));
		
		userS one = new userS(exSplit[0]);
		userS two = new userS(exSplit[1]);
		userS three = new userS(exSplit[2]);
		userS four = new userS(exSplit[3]);
		userS five = new userS(exSplit[4]);
		
		one.printUserName();
		one.printUserAddress();
		one.printUserAddressLen();
		
		two.printUserName();
		two.printUserAddress();
		two.printUserAddressLen();
		
		three.printUserName();
		three.printUserAddress();
		three.printUserAddressLen();
		
		four.printUserName();
		four.printUserAddress();
		four.printUserAddressLen();
		
		five.printUserName();
		five.printUserAddress();
		five.printUserAddressLen();
		
	}

}
