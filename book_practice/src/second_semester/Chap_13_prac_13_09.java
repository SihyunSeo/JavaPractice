package second_semester;

public class Chap_13_prac_13_09 {

	public static void main(String[] args) {
		// ���ͷ�Ʈ�� �̿��� ������ ����2
		Runnable task = () -> {
			while(!Thread.currentThread().isInterrupted()) {
				System.out.println("������,,,");
			}
			System.out.println("���� ����");
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
