package second_semester;

public class Chap_13_prac_13_12 {

	public static void main(String[] args) {
		Runnable task = () -> {
			for(int i = 0; i < 3; i ++)
			{
				try {
					Thread.sleep(1000);
				} catch(InterruptedException e) {
					
				}
				System.out.println(Thread.currentThread().getName());
			}
		};
		
		Thread t1 = new Thread(task, "작업스레드");
		//t1.setDaemon(true);
		t1.start();
		
		try {
			Thread.sleep(1000);
		} catch (InterruptedException e) {
			
		}
		System.out.println("메인 스레드가 종료되었습니다.");

	}

}
