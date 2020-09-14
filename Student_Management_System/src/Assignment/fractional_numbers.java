package Assignment;

public class fractional_numbers 
{
	void get(int put)
	{
		int denominator = 1;  //분모
		int numerator = 1;    //분자
		int add = 0;		  
		
		for(int i = 1; i < put; i ++)
		{
			if(denominator == numerator) // 분모와 분자가 같을때
			{
				if(i == 1)
				{
					denominator ++;
				}
				else
				{
					denominator ++;
					numerator --;			
				}
			}
			else if(denominator > numerator) // 분모가 분자보다 클때
			{
				if(numerator == 1 && denominator % 2 == 1)
				{
					denominator ++;
					add --;
				}
				else if(add == 0)
				{
					numerator ++;
					denominator --;
				}
				else
				{
					numerator --;
					denominator ++;
				}
			}
			else // 분자가 분모보다 클때
			{
				if(denominator == 1 && numerator % 2 == 0)
				{
					numerator ++;
					add ++;
				}
				else if(add == 1)
				{
					numerator --;
					denominator ++;
				}
				else
				{
					numerator ++;
					denominator --;
				}
				
			}
			
		}
		
		System.out.println(numerator + "/" + denominator);
	}
}
