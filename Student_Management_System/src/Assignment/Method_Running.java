package Assignment;

import java.util.ArrayList;

public class Method_Running {
	
	ArrayList<Integer> inform = new ArrayList<Integer>();
	int x, t, n, M, m;
	void collect(String nums)
	{
		String[] list_of_nums = nums.split("\\s+");
		for(int i = 0 ; i < list_of_nums.length; i ++)
		{
			inform.add(Integer.parseInt(list_of_nums[i]));
		}
	}
	
	void calculate()
	{
		x = inform.get(0);
		n = inform.get(1);
		t = inform.get(2);
		M = (x * t) / n; //¸ò
		m = (x * t) % n; //³ª¸ÓÁö
		
		if(M % 2 != 0)
		{
			System.out.println(n - m);
		}
		else
		{
			System.out.println(m);
		}
	}
}
