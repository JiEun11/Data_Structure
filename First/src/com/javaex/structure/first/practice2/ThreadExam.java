package com.javaex.structure.first.practice2;

public class ThreadExam implements Runnable{

	private int []arr;
	
	public ThreadExam() {
		arr = new int[4]; //�����ڷ� arr
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=i;
		}
	}
	
	@Override
	public void run() {
		for(int i=0; i<arr.length; i++) {
			try {
				Thread.sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(Thread.currentThread() + " " + arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExam te = new ThreadExam();   //thread ����
//		te.start();   // thread runnable ���·� (������) �����ٷ��� �����ִٰ� �� ������ ��� ��.
		Thread th = new Thread(te);  //���� ���� ���ʺ� te�� �־��� ---> ���� ���ε� 
		th.start();
				
	}

}
