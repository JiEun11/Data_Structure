package com.javaex.mysql.javapractice;

public class StudentTest {

	public static void main(String[] args) {
		
		Student arrays[] = new Student[3];
		Student stu1 = new Student("ȫ�浿",20,171,81,"201101","����");
		Student stu2 = new Student("��浿",21,183,72,"201102","����");
		Student stu3 = new Student("�ڱ浿",22,175,65,"201103","�İ�");
	
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
