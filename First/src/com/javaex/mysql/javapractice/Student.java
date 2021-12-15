package com.javaex.mysql.javapractice;

public class Student extends Human {
	String major;
	String number;

	public Student() {};

	public Student(String name,int age,int height, int weight, 
			String number, String major) {
		this.name = name;
		this.age = age;
		this.height = height;
		this.weight = weight;
		this.number = number;
		this.major = major;
	}
	
	public String printInformation() {
		return name+"\t"+age+"\t"+height+"\t"+weight
				+"\t" + number + "\t" + major; 
	}
}
