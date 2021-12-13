package com.javaex.structure.third.practice;

import java.util.Arrays;

class Sort{

	/*
	 * create array which has random values 
	 */
	private int[] data;
	public Sort(int num) {
		data = new int[num]; 
		for(int i=0; i < data.length; i++) {
			data[i] = (int)((Math.random()*100)+0);
		}  
	}
	
	
	public int[] getData() {
		return data;
	}


	public void setData(int[] data) {
		this.data = data;
	}
	
	
	/*
	 * bubble sort 
	 */
	public void createBubbleSort() {
		for(int i = 0; i < data.length; i++) {
			for(int j = 0; j < data.length-i-1 ; j++) {
				if(data[j] > data[j+1]) {
					swap(data, j, j+1);
				}
			}	
		}
	}
	
	/*
	 * swap method
	 */
	public void swap(int arr[], int x, int y) {
		int temp = data[x];
		data[x] = data[y];
		data[y] = temp;
	}
	
	/*
	 *  display method
	 */
	public void disp() {
		for(int values : data) {
			System.out.print(values+" ");
		}
	}
}


public class SortApp {
	
	public static void main(String[] args) {	
	
		
		Sort sort = new Sort(100);   // Call a constructor
//		sort.disp();
//		System.out.println();
		sort.createBubbleSort();
		
		sort.disp();
	}				
}
