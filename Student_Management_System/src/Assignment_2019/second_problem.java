package Assignment_2019;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;
import java.util.TreeSet;

public class second_problem {
	
	//����
	public static void main(String[] args) {
		

		
		System.out.printf("�Է��� ��(2~50) : ");  
		Scanner sc = new Scanner(System.in);		
		int num = sc.nextInt();					
		sc.nextLine();   //���๮��(����)�� �����ϱ� ���ؼ� �߰�
		System.out.printf(num+"���� �ٸ� ���� �Է��Ͻÿ�(1~100,spacebar�� ����) : ");		
		String list = sc.nextLine();  
		sc.close();
		
		second_problem two = new second_problem();
		two.setN(num);
		two.num_list(list);
		two.excute_program();

	}

	
	
	//�ʵ�
	int n;
	List<Integer> list = new ArrayList<Integer>();
	List<Integer> mult = new ArrayList<Integer>();
	
	
	
	//�޼ҵ�
	void setN(int x)//n�� �Է�
		{ n = x;}
	
	
	int getN()   //n�� ȣ��
		{return n;}
	
	List<Integer> getlist() //list ȣ��
		{return list;}
	
	void num_list (String x) {	//2���� �Է��� ����Ʈ�� ��ȯ�ϴ� �޼ҵ�
		List<Integer> listA = new ArrayList<Integer>();
		String[] arStrRegexMultiSpace = x.split("\\s+");	// split ���
		for (int i = 0; i < arStrRegexMultiSpace.length; i++) 
			{listA.add( Integer.parseInt(arStrRegexMultiSpace[i]));}	// String ���� Int�� ����ȯ
		
		TreeSet<Integer> listB = new TreeSet<Integer>(listA);   //�ߺ� ����
		List<Integer> listC = new ArrayList<Integer>(listB);	//�������� ����		
		
		list = listC;
			
		
	}	
	
	void solve() {	//��� �޼ҵ�
		int a;
		int b;		
		for(int i = 1; i < n-1 ; i++) {
			b = list.get(n-i);		
			for( int j =0; j < n-i ;j++) {
				a = list.get(j);
				if((a+b)%2==0 || (b-a)%2==0 ) {
					mult.add((a+b)/2);
					mult.add((b-a)/2);
					mult.add((a+b)/2*((b-a)/2));
				}

			}
		}
	}		

	
	void excute_program() {  //���� �޼ҵ�
		if(n>=2 && n <=50) {
			if(list.size()==n) {
				solve();
				System.out.println("��� : "+mult.get(0)+"x"+mult.get(1)+"="+mult.get(2));
			}
			else 
			{System.out.println("�ߺ��� ���� �ְų� �Է��� ���� �߸��Ǿ����ϴ�.");}		
		}
		else
			{System.out.println("�Է� ���� 2~50������ ������ �Է��Ͻÿ�");}		
	}
}

