package second_semester;

import java.util.concurrent.Executor;
import java.util.concurrent.Executors;

public class Chap_13_prac_13_06 {

	public static void main(String[] args) {
		//������ Ǯ�� �̿��� ������
		Runnable task = () -> {
			for(int i = 0; i < 5; i ++)
			{
				System.out.println("�߰�.");
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
