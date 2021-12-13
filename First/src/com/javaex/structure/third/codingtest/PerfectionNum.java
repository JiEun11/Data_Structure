package com.javaex.structure.third.codingtest;

import java.io.*;

public class PerfectionNum {
	public static void main(String[] args) throws Exception {
		BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
		String[] input = br.readLine().split(" ");
		
		int start = Integer.parseInt(input[0]);
		int end = Integer.parseInt(input[1]);

		for(int i = start; i<= end; i++){
			int sum = 0;
			for(int j = 1; j < i; j++){
				if(i%j==0){
					sum+=j;
				}
			}
			if(sum==i){
				System.out.print(i+ " " + sum);
				System.out.println();
			}
		}
	}
}