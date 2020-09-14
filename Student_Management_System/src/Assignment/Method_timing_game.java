package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Method_timing_game 
{
	ArrayList<Integer> nums = new ArrayList<Integer>();
	ArrayList<Integer> re_nums = new ArrayList<Integer>();
	
	void numList(String number)//입력된 숫자들을 배열로 나열후 int로 형변환, 오름차순 정렬
	{
		String[] list_of_nums = number.split("\\s+");
		for(int i = 0 ; i < list_of_nums.length; i ++)
		{
			nums.add(Integer.parseInt(list_of_nums[i]));
		}
		Collections.sort(nums);
	}
	
	void calculate(int num)
	{
		for(int i = 1; i < num-i; i++)
		{
			for(int j = 0; j < num-i ; j ++)
			{
				if((nums.get(num-i) + nums.get(j)) % 2 == 0 || (nums.get(j) - nums.get(num-i)) % 2 == 0)
				{
					re_nums.add((nums.get(num-i) + nums.get(j))/2 * (nums.get(num-i) - nums.get(j))/2);
				}
			}
		}
		int maxValue = Collections.max(re_nums);
		System.out.println(maxValue);
	}
	
}
