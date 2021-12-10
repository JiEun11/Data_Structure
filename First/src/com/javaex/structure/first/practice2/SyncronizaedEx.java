package com.javaex.structure.first.practice2;

class ATM implements Runnable {
	private long depositeMoney = 10000;

	public void run() {
		synchronized (this){	//this : 내꺼를 synchro : 동기화 할꺼야.
		for (int i = 0; i < 10; i++) {
			try {
				Thread.sleep(1000);
			} catch (InterruptedException e) {
				e.printStackTrace();
			}
			if (getDepositeMoney() <= 0)
				break;
			withDraw(1000);
			
			// notify() : wait()에서 대기중인 쓰레드 대기 해제
			this.notify();
			
			// wait() : 점유 해제 및 notify() 호출 대기
			try {
				this.wait();
			}catch(InterruptedException e) {
				e.printStackTrace();
			}
			}
		}
		
	}

	public void withDraw(long howMuch) {
		System.out.println(Thread.currentThread().getName() + ", ");
		if (getDepositeMoney() > 0) {
			depositeMoney -= howMuch;
			System.out.printf("잔액: %d원 %n", getDepositeMoney());
		} else {
			System.out.printf("잔액이 부족합니다.");
		}
	}

	public long getDepositeMoney() {
		return depositeMoney;
	}

}

public class SyncronizaedEx {

	public static void main(String[] args) {

		ATM atm = new ATM();
		Thread trd_mom = new Thread(atm, "mom");  //thread에 이름 부여한 것
		Thread trd_son = new Thread(atm, "son");  // thread에 이름 부여한 것
		trd_mom.start();
		trd_son.start();

	}
}
