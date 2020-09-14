package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Method_Stick {
	
	ArrayList<Integer> factor = new ArrayList<Integer>();
	
	int num = 64, addFactor, exceptNum, count = 0;
	
	void factors() // 64의 인수들 구해서 리스트에 정렬해놓기
	{
		while(num >= 1)
		{
			factor.add(num);
			num = num / 2;
		}
		Collections.sort(factor);
	}	
	
	void cal(int input) // 막대의 개수 구하기
	{
		for(int i = 0; i < factor.size(); i++) //input보다 작은 인수들의 총합
		{
			if(factor.get(i) < input)
			{
				addFactor += factor.get(i);
			}
		}
		exceptNum = addFactor - input; // 총합에서 input 뺼샘을 통해 제외해야 할 인수 도출
		
		for(int j = 0; j < factor.size(); j++) // 
		{
			if(factor.get(j) != exceptNum && factor.get(j) < input)
			{
				count ++;
			}
			else if(factor.get(j) == input)
			{
				count = 1;
			}
		}
		System.out.println("출력: " + count);
	}
}