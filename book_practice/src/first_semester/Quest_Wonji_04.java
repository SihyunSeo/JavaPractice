package first_semester;

class change
{
	String a = "11110110";
	char b;
	int q = 0, r = 0, w = 0;
	void show(String s)
	{
		for(int i =0; i<a.length(); i++)
		{
			q = a.length()-i-1;
			b = a.charAt(q); //¿ª¼øÀ¸·Î »Ì¾Æ³»´Â ½Ä
			w = (int)b - 48;  //?
			r += (w * (int)(Math.pow(2, i)));
		}
		System.out.println(r);
	}
	
	int number[] = {0,1,2,3,4,5,6,7,8,9};
	String lec[] = {" ","ÀÏ","ÀÌ","»ï","»ç","¿À","À°","Ä¥","ÆÈ","±¸"};
	void show1()
	{
		for (int i = 1; i <= 9; i++)
			{
			if (r / 100 == i)
				{
					System.out.print(lec[i] + "¹é ");
				}
			}
	     for (int i = 1; i <= 9; i++)
	    	 {
	    	 if ((r % 100) / 10 == i)
	    		 {
	    		 System.out.print(lec[i] + "½Ê ");
	    		 }
	    	 }
	     for (int i = 1; i <= 9; i++)
	    	 {
	    	 if ((r % 10) == i)
	    		 {
	    		 System.out.print(lec[i]);
	    		 }
	    	 }
	}
	
}

public class Quest_Wonji_04 {

	public static void main(String[] args) {
		String a = "11110110";
		change num = new change();
		int number[] = {0,1,2,3,4,5,6,7,8,9};
		String lec[] = {" ","ÀÏ","ÀÌ","»ï","»ç","¿À","À°","Ä¥","ÆÈ","±¸"};
		
		num.show(a);
		num.show1();
	}

}
