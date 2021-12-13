package com.javaex.structure.third.practice;

import java.util.Arrays;

public class BubbleSort {

	public static void main(String[] args) {
		createBubbleSort();

	}	
	private static void createBubbleSort() {
		int data[] = new int[100];
		for(int i = 0 ; i < 100; i++) {
			data[i] = (int)((Math.random()*100)+0);
		}
		for(int i = 1; i < data.length; i++) {
			for(int j = 0; j < data.length-i ; j++) {
				if(data[j] > data[j+1]) {
//					swap(data[j], data[j+1]);
					int temp = data[j+1];
					data[j+1] = data[j];
					data[j] = temp;
				}
			}	
		}
		System.out.println(Arrays.toString(data));
	}
	
//	private static void swap(int x, int y) {
//		int temp = y;
//		y = x;
//		x = temp;
//	}
}
