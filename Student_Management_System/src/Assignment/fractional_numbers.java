package Assignment;

public class fractional_numbers 
{
	void get(int put)
	{
		int denominator = 1;  //�и�
		int numerator = 1;    //����
		int add = 0;		  
		
		for(int i = 1; i < put; i ++)
		{
			if(denominator == numerator) // �и�� ���ڰ� ������
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
			else if(denominator > numerator) // �и� ���ں��� Ŭ��
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
			else // ���ڰ� �и𺸴� Ŭ��
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
