package second_semester;

public class Chap_13_prac_13_08 {

	public static void main(String[] args) {
		// ���ͷ�Ʈ�� �̿��� ������ ���� 1
		Runnable task = () -> {
			try {
				while (true) {
					System.out.println("������.....");
					Thread.sleep(1);
				}
			} catch(InterruptedException e) {
				
			}
			System.out.println("���� ����");
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
