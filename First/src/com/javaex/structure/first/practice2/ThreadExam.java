package com.javaex.structure.first.practice2;

public class ThreadExam extends Thread{

	private int []arr;
	
	public ThreadExam() {
		arr = new int[4]; //생성자로 arr
		
		for(int i=0; i<arr.length;i++) {
			arr[i]=i;
		}
	}
	
	public void run() {
		for(int i=0; i<arr.length; i++) {
			try {
				sleep(100);
			} catch (InterruptedException e) {
				
				e.printStackTrace();
			}
			
			System.out.println(currentThread() + " " + arr[i]);
		}
	}
	
	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ThreadExam te = new ThreadExam();   //thread 생성
		te.start();   // thread runnable 상태로 (대기상태) 스케줄러가 보고있다가 너 동작해 라고 함.
		
				
	}

}
