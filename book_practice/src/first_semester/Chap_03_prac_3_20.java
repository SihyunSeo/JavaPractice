package first_semester;

public class Chap_03_prac_3_20 {

	public static void main(String[] args) {

		printScore(99);
		printScore(120);

	}
	public static void printScore(int score) {
		if(score <=0 || score >= 100) {
			System.out.println("�߸��� ���� : " + score);
			return;
		}
		System.out.println("���� : " + score);
	}
}
