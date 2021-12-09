package com.javaex.structure.first.test;

public abstract class Memory {
	protected int[] array = new int[5];
	protected int pivot = 0; //맨 끝 값을 가리키는 변수
	int num;
//	protected void push(int num) {
//		
//		array[pivot] = num;
//		pivot++;
//	}
	
	// 가득찬 상태인지 확인
	protected boolean isFull() {
		return (pivot == array.length-1); //pivot이 배열 마지막 인덱스랑 같다면 true 
	}
	
	// 비어있는 상태인지 확인
	protected boolean isEmpty() {
		return (pivot == -1);  //pivot이 -1이면 데이터가 없는 상태이니까 true 리턴
	}
	
	protected abstract void push(int num);
	protected abstract int pop();
	protected abstract void overflow();
	protected abstract void underflow();
}
