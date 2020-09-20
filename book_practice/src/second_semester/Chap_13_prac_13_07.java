package second_semester;

class StopThread extends Thread{
	public boolean stop;
	
	public void run() {
		while(!stop) {
			System.out.println("실행중.....");
			try {
				Thread.sleep(1);
			} catch(InterruptedException e) {
				
			}
		}
		System.out.println("정상 종료");
	}
}
public class Chap_13_prac_13_07 {

	public static void main(String[] args) {
		// 조건을 이용한 스레드 종료
		StopThread t = new StopThread();
		t.start();
		
		try {
			Thread.sleep(3);
		} catch(InterruptedException e) {
			
		}
		t.stop = true;
	}

}
