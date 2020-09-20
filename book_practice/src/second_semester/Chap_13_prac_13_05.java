package second_semester;

public class Chap_13_prac_13_05 {

	public static void main(String[] args) {
		new Thread() {
			public void run() {
				for(int i = 0; i < 5; i ++)
				{
					System.out.println("Àß°¡");
					try {
						Thread.sleep(500);
					} catch(InterruptedException e) {
						
					}
				}
			}
		}.start();

	}

}
