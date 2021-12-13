package com.javaex.structure.third.codingtest;

import java.io.*;
import java.util.Arrays;
public class Sort {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		int size = Integer.parseInt(br.readLine());
		
		
		String input = br.readLine();
		int[] arr = new int[size];
		int idx=0;
		for(String values : input.split(" ")){
			arr[idx++] = Integer.parseInt(values);
		}
		
		int cnt=0;
		int step = Integer.parseInt(br.readLine());
		for(int i=1; i<arr.length; i++){
			for(int j=i; j>0; j--) {
				if(arr[j-1] > arr[j]) {
					swap(arr, j-1, j);
				}
				cnt++;
			}
			if(cnt==step) break;
			
		}
		System.out.println(Arrays.toString(arr));
	}
	
	public static void swap(int[] arr, int x, int y){
		int temp = arr[x];
		arr[x] = arr[y];
		arr[y] = temp;
	}
}