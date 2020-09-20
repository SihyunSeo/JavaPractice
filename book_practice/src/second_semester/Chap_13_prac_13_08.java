package second_semester;

public class Chap_13_prac_13_08 {

	public static void main(String[] args) {
		// 인터럽트를 이용한 스레드 종료 1
		Runnable task = () -> {
			try {
				while (true) {
					System.out.println("실행중.....");
					Thread.sleep(1);
				}
			} catch(InterruptedException e) {
				
			}
			System.out.println("정상 종료");
		};
		
		Thread t = new Thread(task);
		t.start();
		
		try {
			Thread.sleep(3);
		} catch(InterruptedException e) {
			
		}
		t.interrupt();

	}

}
