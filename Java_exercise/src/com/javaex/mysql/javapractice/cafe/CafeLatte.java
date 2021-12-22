package com.javaex.mysql.javapractice.cafe;

public class CafeLatte extends Coffee{

	CafeLatte(){}
	
	CafeLatte(int tem, int size, int count, int price){
		this.size = size; 
		this.tem = tem;
		this.count = count;
		this.price = price;
	}
	
}
