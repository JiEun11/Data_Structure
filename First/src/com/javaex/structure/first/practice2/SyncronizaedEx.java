package com.javaex.structure.first.practice2;

class ATM implements Runnable {
	private long depositeMoney = 10000;

	public void run() {
		synchronized (this){	//this : ������ synchro : ����ȭ �Ҳ���.
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (getDepositeMoney() <= 0)
				break;
			withDraw(1000);
			}
		}
		
	}

	public void withDraw(long howMuch) {
		System.out.println(Thread.currentThread().getName() + ", ");
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.printf("�ܾ�: %d�� %n", getDepositeMoney());
		} else {
			System.out.printf("�ܾ��� �����մϴ�.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

}

public class SyncronizaedEx {

	public static void main(String[] args) {

		ATM atm = new ATM();
		Thread trd_mom = new Thread(atm, "mom");  //thread�� �̸� �ο��� ��
		Thread trd_son = new Thread(atm, "son");  // thread�� �̸� �ο��� ��
		trd_mom.start();
		trd_son.start();

	}
}
