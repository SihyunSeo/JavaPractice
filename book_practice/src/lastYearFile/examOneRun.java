package lastYearFile;
import java.lang.Thread;
public class examOneRun implements Runnable{
	int nId; // �۾� ������ id
	
	// ������ (���� �޾Ƽ� �۾������� id�� ����)
	examOneRun(int nNum){
		nId = nNum;
	}
	
	// �����Լ�
	public static void main(String[] args) {
		//���� ������ ����
		new examOne("���� ������", 0, 0);
		
		//�۾� ������ ����
		for(int i = 1 ; i < 4 ; i++) {
			examOneRun thr = new examOneRun(i);
			Thread th = new Thread(thr);
			th.start();
		}
	}

	@Override
	public void run() {
		// �۾� ������ id�� ���� �ְ�, ��ġ���� ���ϱ�� ���
		new examOne("�۾� ������" + nId, 0, (200*nId));
	}
}
