package lastYearFile;
import java.lang.Thread;
public class examOneRun implements Runnable{
	int nId; // 작업 스레드 id
	
	// 생성자 (숫자 받아서 작업스레드 id로 넣음)
	examOneRun(int nNum){
		nId = nNum;
	}
	
	// 메인함수
	public static void main(String[] args) {
		//메인 스레드 실행
		new examOne("메인 스레드", 0, 0);
		
		//작업 스레드 실행
		for(int i = 1 ; i < 4 ; i++) {
			examOneRun thr = new examOneRun(i);
			Thread th = new Thread(thr);
			th.start();
		}
	}

	@Override
	public void run() {
		// 작업 스레드 id를 제목에 넣고, 위치값에 곱하기로 사용
		new examOne("작업 스레드" + nId, 0, (200*nId));
	}
}
