package second_semester;

class CarThread extends Thread{
	private String who;
	private SharedCar car;
	private String where;
	
	public CarThread(String who, SharedCar car, String where)
	{
		this.who = who;
		this.car = car;
		this.where = where;
	}
	
	public void run()
	{
		car.drive(who, where);
	}
}

public class SynchroDemo {
	public static void main(String[] args) {
		SharedCar car = new SharedCar();
		new CarThread("–AÁö¸®", car, "¼­¿ï").start();
		new CarThread("¹®µÕÀÌ", car, "±¤ÁÖ").start();
		new CarThread("²¤²¤ÀÌ", car, "ºÎ»ê").start();
	}
}
