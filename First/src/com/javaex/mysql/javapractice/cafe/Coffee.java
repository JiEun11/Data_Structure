package com.javaex.mysql.javapractice.cafe;

public class Coffee {
	
	protected int price;     // ���� ����
	protected String name;  // Ŀ�� ����
	protected int size;     //  1. regular   2.large
	protected int tem;      //  1. hot       2.ice
	protected int count;   // ����
	
	public int getPrice() {
		return price;
	}
	public void setPrice(int price) {
		this.price = price;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getSize() {
		return size;
	}
	public void setSize(int size) {
		this.size = size;
	}
	public int getTem() {
		return tem;
	}
	public void setTem(int tem) {
		this.tem = tem;
	}
	public int getCount() {
		return count;
	}
	public void setCount(int count) {
		this.count = count;
	}
	
	
}
