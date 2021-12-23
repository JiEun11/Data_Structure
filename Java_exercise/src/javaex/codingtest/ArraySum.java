package javaex.codingtest;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.Arrays;

public class ArraySum {

	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String input = br.readLine();
		
		String arrSize[] = input.split(" ");
		
		int arr1Size = Integer.parseInt(arrSize[0]);
		int arr2Size = Integer.parseInt(arrSize[1]);
		int arr3Size = arr1Size + arr2Size ;
		int arr3[] = new int[arr3Size];
		
				
		String arr1 = br.readLine();		//배열 입력받기 
		String arr2 = br.readLine();
		
		String value1[] = arr1.split(" ");
		
		for(int i=0; i<arr1Size; i++){
			
			arr3[i] = Integer.parseInt(value1[i]);
		}
		
		String value2[] = arr2.split(" ");
		int idx = 0;
		for(int i=arr1Size ; i<arr3Size; i++){
			
			arr3[i] = Integer.parseInt(value2[idx++]);
		}
		
		Arrays.sort(arr3);
		for(int value : arr3 ){
			System.out.print(value+ " ");
		}		
	}
}
