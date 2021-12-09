package com.javaex.structure.first.test;

public class MyStack extends Memory {

	@Override
	public void push(int num) {
		if (pivot == array.length ) {
			overflow();
		} else {
			array[pivot] = num;
			pivot++;
		}
	}

	@Override
	public void pop() {
		if (pivot <= 0) {
			underflow();
		} else {
			System.out.println("배열 값 추출:" + array[--pivot]); // 마지막 값 추출
			array[pivot] = 0; // 추출한 곳 0으로 초기화
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
