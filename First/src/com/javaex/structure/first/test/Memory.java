package com.javaex.structure.first.test;

public abstract class Memory {
	protected int[] array = new int[5];
	protected int pivot = 0; //�� �� ���� ����Ű�� ����
	int num;
//	protected void push(int num) {
//		
//		array[pivot] = num;
//		pivot++;
//	}
	
	// ������ �������� Ȯ��
	protected boolean isFull() {
		return (pivot == array.length-1); //pivot�� �迭 ������ �ε����� ���ٸ� true 
	}
	
	// ����ִ� �������� Ȯ��
	protected boolean isEmpty() {
		return (pivot == -1);  //pivot�� -1�̸� �����Ͱ� ���� �����̴ϱ� true ����
	}
	
	protected abstract void push(int num);
	protected abstract int pop();
	protected abstract void overflow();
	protected abstract void underflow();
}
