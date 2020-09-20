package second_semester;

class Counter extends Thread {
	private int count = 0;
	
	public Counter(String name) {
		setName(name);
	}
	
	public void run() {
		while(count++ < 5)
		{
			System.out.println(getName() + "->");
			try {
				sleep(500);
			} catch(InterruptedException e) {
				
			}
		}
	}
}
public class Chap_13_prac_13_11 {

	public static void main(String[] args) {
		Counter c1 = new Counter("´À±ßÇÑ");
		c1.setPriority(Thread.MIN_PRIORITY);
		
		Counter c2 = new Counter("±ÞÇÑ");
		c2.setPriority(Thread.MAX_PRIORITY);
		
		c1.start();
		c2.start();

	}

}
