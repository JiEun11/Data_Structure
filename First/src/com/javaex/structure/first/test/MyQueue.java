package com.javaex.structure.first.test;

public class MyQueue extends Memory {
	protected int front=0;   // ť�� ���� ������ ����Ű�� ����

	
	@Override
	protected void push(int num) {
		if(front==0 && pivot==array.length) {
			overflow();
		}else if(front != 0 && pivot == array.length){
			shift();
			array[pivot++] = num;
		}else {
			array[pivot++] = num;
		}
		
	}

	@Override
	protected void pop() {
		if(front==pivot) {
			underflow();
		}else {
			System.out.println("�迭 �� ����:" + array[front]);
			array[front++]=0;
			
		}
		
	}

	@Override
	protected void overflow() {
		System.out.println("Array is full");
		
	}

	@Override
	protected void underflow() {
		System.out.println("Array is empty");
		
	}
	
	protected void shift() {
		for(int i = front; i<array.length; i++) {
			array[i-1] = array[i];
			array[i] = 0;
		}
		front--;
		pivot--;
	}
}
