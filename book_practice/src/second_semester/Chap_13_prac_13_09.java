package second_semester;

public class Chap_13_prac_13_09 {

	public static void main(String[] args) {
		// 인터럽트를 이용한 스레드 종료2
		Runnable task = () -> {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("실행중,,,");
			}
			System.out.println("정상 종료");
		};
		
		Thread t = new Thread(task);
		t.start();
		
		try {
			Thread.sleep(2);
		} catch(InterruptedException e) {
			
		}
		t.interrupt();

	}

}
