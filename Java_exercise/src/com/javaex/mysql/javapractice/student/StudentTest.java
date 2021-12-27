package com.javaex.mysql.javapractice.student;

public class StudentTest {

	public static void main(String[] args) {
		
		Student arrays[] = new Student[3];
		Student stu1 = new Student("홍길동",20,171,81,"201101","영문");
		Student stu2 = new Student("고길동",21,183,72,"201102","건축");
		Student stu3 = new Student("박길동",22,175,65,"201103","컴공");
	
		arrays[0] = stu1;
		arrays[1] = stu2;
		arrays[2] = stu3;
		
		String print1 = arrays[0].printInformation();
		String print2 = arrays[1].printInformation();
		String print3 = arrays[2].printInformation();
		
		
		System.out.println(print1);
		System.out.println(print2);
		System.out.println(print3);

	}

}
