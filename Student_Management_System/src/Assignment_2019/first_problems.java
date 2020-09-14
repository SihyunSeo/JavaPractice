package Assignment_2019;

import java.util.Scanner;


public class first_problems {

	public static void main(String[] args) {
		Scanner sc =new Scanner(System.in);
	  	System.out.printf("몇 번째 분수를 구하시겠습니까? : ");	
		int x = sc.nextInt();
		sc.close();
		
		first_problems one = new first_problems();
		
		one.get(x);
	}
	
	void get(int n) {
		int son=1;
		int	mother=1;
		int turn=0;
		for (int i = 1 ; i < n ; i ++) {		
			if (son==mother) {
				if(i==1)
					{ mother+=1; }
				else 
					{ mother+=1; son-=1; }		
			}
			
			else if (son > mother) {
				if (mother==1 && son%2==0)
					{son+=1; turn+=1;}
					
				else if(turn == 1 )
					{mother+=1; son-=1;}
				else
					{mother-=1; son+=1;}
			}
			
			else{
				if (son==1 && mother%2==1)
					{ mother+=1; turn-=1;}
				else if( turn == 0 )
					{ mother-=1; son+=1;}
				else
					{ mother+=1; son-=1;}
			}
			
		}
		
		System.out.println(son+"/"+mother);
	}


}
