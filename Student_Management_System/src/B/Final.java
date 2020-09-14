package B;
import java.util.ArrayList;
import java.util.Collections;
import A.SuperClass;

public class Final extends SuperClass implements Comparable<SuperClass> {
	
	int dan; //�� ���� ������ ���� ������ �Է�
	int total; // ����
	int x, n, y, t, final_position;
	
	ArrayList<Integer> nums = new ArrayList<Integer>();
	ArrayList<String> arraylist = new ArrayList<String>();
	
	public Final() 
	{
		this.nClassNum = 1;
	}
	public Final(String id, String name, int nClassNum) 
	{
	    this.id = id;
	    this.name = name;
	    this.nClassNum = nClassNum;
	}
	public String getName(String name)
	{
		return super.name;
	}
	public String getId(String id)
	{
		return super.id;
	}
	int getGuGuDanSum(int dan) // �������� ������ ��ȯ
	{
		return total;
	}
	
	public void guguDan(int dan) //������ ���� 
	{
		for(int i = 1; i < 10; i ++)
		{
			nums.add(dan * i);
		}
		
		for(int j = 0; j < nums.size() ; j ++)
		{
			total += nums.get(j);
		}
	}
	public void addData(String s)
	{
		this.arraylist.add(s);
	}
	public void removeData(String s)
	{
		this.arraylist.remove((String)s);
	}
	public void print()
	{
		System.out.println(arraylist);
	}
	public void sortData()
	{
		Collections.sort(arraylist);
	}
	public boolean isContains(String s) 
	{
		return this.arraylist.contains(s);
	}
	public void getData(int n)
	{
		this.arraylist.get(n);
	}
	
	public Final(int x, int n, int y, int t)
	{
		this.x = x;
		this.n = n;
		this.y = y;
		this.t = t;
	}
	int getHyunJunPosition(int x, int n, int y, int t)
	{
		return final_position;
	}
	public void positionCal()
	{
		int time = n / x; // �ӵ��� �پ��� ������ �ɸ��� �ð�
		while(x == 0)
		{
			if(x * time == n)
			{
				x = x - y;
				t = t - time;
				
				if((x * t) < n)
				{
					int position = (x * t) / n;
					int new_position = (x * t) % n;
					if(position % 2 != 0)
					{
						final_position = n - new_position;
					}
					else
					{
						final_position = new_position;
					}
				}
			}
		}
		
	}
	
	@Override
	public int compareTo(SuperClass o) {
		return 0;
	}
	@Override
	protected String getName() {
		return null;
	}
	@Override
	protected String getId() {
		return null;
	}


}
