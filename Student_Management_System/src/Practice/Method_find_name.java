package Practice;

public class Method_find_name 
{
	String quest;
	int count;
	//"�����ع��������������ع����ֹ����ع����ع����������ֹ����ֹ�����~~~"
	public int findName(String quest)
	{
		while(quest.contains("������"))
		{
			count ++;
			quest = quest.substring(quest.indexOf("������") + 3 ); // substring�� 
		}
		return count;
	}
	
	void prac(String quest)
	{
		System.out.println(quest.indexOf("������"));
	}
	
	void substring(String quest)
	{
		System.out.println(quest.substring(0, 4));
	}
}
