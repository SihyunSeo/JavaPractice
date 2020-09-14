package first_semester;

import java.util.ArrayList;

class sibal {
	
	String a;
	//ArrayList fiveList = new ArrayList();
	int subal = 0;
	int ssubal = 1;
	int stackNum = 0;
	
	void show() 
	{
		for(int i = 0; i < a.length(); i++)
		{
			if(a.charAt(i)=='<')
			{
				subal = i;
				
			}
			
			if(a.charAt(i)=='@')
			{
				ssubal = i;
				if(stackNum <5)
				{
					System.out.print((a.substring(subal+1, ssubal))+" ");
				}
				stackNum ++;
				//fiveList.add(a.substring(subal+1, ssubal));
				
			}
			/* 동적 배열을 통한 5개 입력값 출력
			if(fiveList.size() == 5)
			{
				break;
			}
			*/
			//System.out.println(a.substring(subal, ssubal));
		}
		//System.out.println(a.substring(subal+1, ssubal));
		
	}
}


class findUser {
	String a;
	int numUser = 0;
	
	public findUser(String s)
	{
		a = s;
		for(int i = 0; i < a.length(); i++)
		{
			if(a.charAt(i) == '@')
			{
				numUser += 1;
			}
		}
		System.out.println(numUser);
	}
}


public class Quest_Wonji_02 {

	public static void main(String[] args) {
		
		sibal one = new sibal();
		one.a = "<yeskang@yeskang.com><kang4you@assembly.go.kr><khk@gobundang.org><yskwon21@assembly.go.kr><koy@assembly.go.kr><master@chkwon.com><kkw604@assembly.go.kr><kt21@ktcamp.or.kr><kckim@assembly.go.kr><new21@assembly.go.kr><dr21@chol.com>";
		findUser Quest = new findUser("<yeskang@yeskang.com><kang4you@assembly.go.kr><khk@gobundang.org><yskwon21@assembly.go.kr><koy@assembly.go.kr><master@chkwon.com><kkw604@assembly.go.kr><kt21@ktcamp.or.kr><kckim@assembly.go.kr><new21@assembly.go.kr><dr21@chol.com>");
		String[]exSplit = (Quest.a.split(">"));
		ArrayList userS = new ArrayList();
		
		for(int i=0; i< exSplit.length; i++)
		{
			userS.add(exSplit[i].replace('<', ' '));
		}
		
		System.out.println(userS);
		
		one.show();
		//System.out.println(one.fiveList);
		
	}

}
