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
	 * insertion sort
	 */
	public void createInsertionSort() {
		for(int i=0; i<data.length; i++) {
			for(int j=1; j<data.length; j++) {
				if(data[j]<data[j-1]) {
					swap(data,j,j-1);
				}
			}
		}
	}
	
	/*
	 *  quick sort 
	 */
	public void createQuickSort(int[] arr, int start, int end) {
		int pivot = partition(arr, start, end);
		if(start<pivot-1) createQuickSort(arr, start, pivot-1);
		if(end>pivot) createQuickSort(arr, pivot, end);
		
	}
	
	public int partition(int[] arr, int start, int end) {
		int mid = (start+end)/2;
		int pivot = data[mid];
		
		while(start<=end) {
			while(data[start]<pivot) start++;
			while(data[end]>pivot) end--;
			if(start<=end) {
				swap(data,start,end);
				start++;
				end--;
			}
		}
		return start;
	}
	
	/*
	 *  Binary search
	 */
	public int startBinarySearch(int[] data, int target, int start, int end) {
		int mid = (start+end)/2;

		if(start<=end) {
			if(data[mid] < target) {
				return startBinarySearch(data, target, mid+1, end);
			}else if(target < data[mid]) {
				end = mid;
				return startBinarySearch(data, target, start, mid-1);
			}else {
				return mid;
			}
		}
		return -1;
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
		sort.disp();
		System.out.println();
//		sort.createBubbleSort();
//		sort.createInsertionSort();
		sort.createQuickSort(sort.getData(), 0, sort.getData().length-1);
		sort.disp();
		System.out.println();
		int checkNum = sort.startBinarySearch(sort.getData(),40,0,100);
		if(checkNum==-1) {
			System.out.println("찾는 숫자가 없습니다.");
		}else {
			System.out.println(checkNum+1+"번째에 있습니다.");
		}
	}				
}
