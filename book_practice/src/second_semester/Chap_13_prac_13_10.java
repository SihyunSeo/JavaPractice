package second_semester;

class JoinThread extends Thread{
	int total;
	
	public void run() {
		for(int i = 1; i <= 100; i ++)
		{
			total += i;
		}
	}
}
public class Chap_13_prac_13_10 {

	public static void main(String[] args) {
		JoinThread t = new JoinThread();
		t.start();
		
		try {
			t.join();
			System.out.println("스레드 t가 끝날때까지 대기...");
		} catch(InterruptedException e) {
			
		}
		System.out.println("총합 : " + t.total);

	}

}
