package Assignment;

import java.util.ArrayList;
import java.util.Collections;

public class Method_Stick {
	
	ArrayList<Integer> factor = new ArrayList<Integer>();
	
	int num = 64, addFactor, exceptNum, count = 0;
	
	void factors() // 64�� �μ��� ���ؼ� ����Ʈ�� �����س���
	{
		while(num >= 1)
		{
			factor.add(num);
			num = num / 2;
		}
		Collections.sort(factor);
	}	
	
	void cal(int input) // ������ ���� ���ϱ�
	{
		for(int i = 0; i < factor.size(); i++) //input���� ���� �μ����� ����
		{
			if(factor.get(i) < input)
			{
				addFactor += factor.get(i);
			}
		}
		exceptNum = addFactor - input; // ���տ��� input �E���� ���� �����ؾ� �� �μ� ����
		
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
		System.out.println("���: " + count);
	}
}