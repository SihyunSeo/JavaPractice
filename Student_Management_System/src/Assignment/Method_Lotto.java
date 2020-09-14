package Assignment;

import java.util.ArrayList;

public class Method_Lotto {
	
	long n, m, denominator = 1, newDenominator, numerator = 1;
	ArrayList<Long> nums = new ArrayList<Long>();
	
	void setNumber(String number)
	{
		String[] numList = number.split("\\s+");
		for(int i = 0; i < numList.length; i ++)
		{
			nums.add(Long.parseLong(numList[i]));
		}
	}
	
	void probability()
	{
		n = nums.get(0);
		m = nums.get(1);
		
		for(long i = m; m > 0; m --)
		{
			denominator *= n;
			numerator *= m;
			n --;
		}
		newDenominator = denominator / numerator;
		System.out.println("Ãâ·Â: " + 1 + "/" + newDenominator);
	}
}
