package Practice;

public class Method_find_name 
{
	String quest;
	int count;
	//"박헌준박현춘박현츈박현준박현주박현준박현준박현조벅현주박혀주박휴주~~~"
	public int findName(String quest)
	{
		while(quest.contains("박현준"))
		{
			count ++;
			quest = quest.substring(quest.indexOf("박현준") + 3 ); // substring은 
		}
		return count;
	}
	
	void prac(String quest)
	{
		System.out.println(quest.indexOf("박현준"));
	}
	
	void substring(String quest)
	{
		System.out.println(quest.substring(0, 4));
	}
}
