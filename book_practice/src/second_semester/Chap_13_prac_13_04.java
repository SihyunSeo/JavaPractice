package second_semester;

class WorkerThread extends Thread{
	public void run() {
		for(int i = 0; i < 5; i ++)
		{
			System.out.println("�߰�.");
			try {
				Thread.sleep(500);
			} catch (InterruptedException e) {
				
			}
		}
	}
}
public class Chap_13_prac_13_04 {

	public static void main(String[] args) {
		Thread t = new WorkerThread();
		t.start();
		
		for(int i = 0; i < 5; i ++)
		{
			System.out.println("�ȳ�. ");
			try {
				Thread.sleep(500);
			} catch(InterruptedException e) {
				
			}
		}

	}

}
