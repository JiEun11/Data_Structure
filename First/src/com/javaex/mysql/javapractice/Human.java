package com.javaex.mysql.javapractice;

public class Human {
	String name;
	int age;
	int height;
	int weight;
	
	public Human() {}
	
	public Human(String name, int age, int height,int weight) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
	}
	
	public String printInformation() {
		return "이름: "+name+" 나이: "+age+" 키: "+height+" 몸무게: "+weight;
	}
}
