package second_semester;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Chap_13_prac_13_06 {

	public static void main(String[] args) {
		//스레드 풀을 이용한 스레드
		Runnable task = () -> {
			for(int i = 0; i < 5; i ++)
			{
				System.out.println("잘가.");
				try {
					Thread.sleep(500);
				} catch(InterruptedException e) {
					
				}
			}
		};
		
		Executor exec = Executors.newCachedThreadPool();
		exec.execute(task);

	}

}
