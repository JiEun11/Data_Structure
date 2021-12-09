package com.javaex.structure.first.test;

public class MyStack extends Memory {

	@Override
	public void push(int num) {
		if (pivot == array.length - 1) {
			overflow();
		} else {
			array[++pivot] = num;
		}
	}

	@Override
	public int pop() {
		if (pivot == -1) {
			underflow();
			return 0;
		} else {
			System.out.println("�迭 �� ����:" + array[pivot]); // ������ �� ����
			array[pivot] = 0; // ������ �� 0���� �ʱ�ȭ
			return array[pivot--];
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

}
