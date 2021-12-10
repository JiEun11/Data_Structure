package com.javaex.structure.second.test;

import java.util.ArrayList;
import java.util.Scanner;

//Student ������ ��� Ŭ����

class Student {

	private String name;

	private int kor;

	private int eng;

	private int math;

	private int total;

	private float avg;

	public Student() {

	}

	public Student(String name, int kor, int eng, int math) {

		this.name = name;

		this.kor = kor;

		this.eng = eng;

		this.math = math;

		this.total = kor + eng + math;

		this.avg = total / 3.f;

	}

	public String getName() {

		return name;

	}

	public void setName(String name) {

		this.name = name;

	}

	public int getKor() {

		return kor;

	}

	public void setKor(int kor) {

		this.kor = kor;

	}

	public int getEng() {

		return eng;

	}

	public void setEng(int eng) {

		this.eng = eng;

	}

	public int getMath() {

		return math;

	}

	public void setMath(int math) {

		this.math = math;
	}

	public int getTotal() {

		return total = kor + eng + math;

	}
	
	public void setTotal(int total) {
		this.total = total;
	}
	
	public float getAvg() {

		return avg = getTotal() / 3.f;
	}
	
	public void setAvg(float avg) {
		this.avg = avg;
	}

	public String toString() {

		return "�̸�: " + name + "\t" + "��������: " + kor + "\t" + "��������: " + eng + "\t" + "��������: " + math + "\t" + "�հ�: "
				+ total + "\t" + "���: " + avg;

	}
}

public class SungjukArrayList {

	static int num; // �л� ��� ���� ����� ��
	private ArrayList<Student> stu; // Student ��ü Ÿ���� ArrayList�� stu ����

	public SungjukArrayList(int numStudent) { // ����� �����ڷ� ArrayList �뷮 ����

		stu = new ArrayList<Student>(numStudent); // Student ��ü Ÿ���� ArrayList Heap �޸𸮿� �ø�.
		System.out.println(stu.size());
	}

	public void input() {
		Scanner sc = new Scanner(System.in); // for���ȿ� X

		for (int i = 0; i < num; i++) {

			Student student = new Student();

			System.out.print("�̸��� �Է��ϼ���: ");
			student.setName(sc.next());

			System.out.print("���� ������ �Է��ϼ���: ");

			student.setKor(sc.nextInt()); // ���� ���� �Է�

			System.out.print("���� ������ �Է��ϼ���: ");

			student.setEng(sc.nextInt()); // ���� ���� �Է�

			System.out.print("���� ������ �Է��ϼ���: ");

			student.setMath(sc.nextInt()); // ���� ���� �Է�
			
			stu.add(student); // ArrayList�� ��ü�� ���� �ٷ�� �ֶ� ��ü �־������.

//			���� �����ڷ� add�� �־��ٲ��� �� �� �Է� �ް� �����ڸ� �ִ���
//			String name = sc.next();
//			int kor = sc.nextInt();
//			int eng = sc.nextInt();
//			int math = sc.nextInt();
//			stu.add(new Student(name, kor, eng, math));
//			Student student = new Student(name, kor, eng, math);
//			���ְ� stu.add(student); ���ִ���

		}

	}

//�л� �̸� �Է� �� ���� ��ȸ

	public void search() {

		System.out.println("�л� �̸��� �Է��ϼ���. ��)������");

		Scanner sc = new Scanner(System.in);

		String nameSearch = sc.next();

		for (Student student : stu) {

			if (student.getName().contains(nameSearch)) {

				System.out.println("���� ����: " + student.getKor());

				System.out.println("���� ����: " + student.getEng());

				System.out.println("���� ����: " + student.getMath());

				System.out.println("�� ��: " + student.getTotal());

				System.out.println("�� ��: " + student.getAvg());

			}

		}

	}

//��� 50�� �̻��� �л��� �̸� ���

	public void searchAvg50() {

		for (Student student : stu) {

			if (student.getAvg() >= 50) {

				System.out.println(student.getName());

			}

		}

	}

//��ü ��� ��ȸ

	public void showInfo() {

//		for (int i = 0; i < stu.size(); i++) {
//
//			System.out.println(stu[i].toString());
//
//		}
		for (Student student : stu) {
			System.out.println(student.toString());
		}

	}

// ���ϴ� �л� ����
	public void deleteInfo() {
		System.out.print("������ �л��� �̸��� �Է��ϼ���: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (Student student : stu) {
			if (student.getName().contains(name)) {
				stu.remove(student);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("-------------------------");

		System.out.println("------����ó�� ���α׷�-------");

		System.out.print("�л� ���� �Է��ϼ���: ");

		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		SungjukArrayList sj = new SungjukArrayList(num);

		sj.input();

		boolean stop = true;

		while (stop) {

			System.out.println("1.�л� ���� ��ȸ | 2.��� 50���̻� �л� ��ȸ | 3.��ü ��� ��ȸ | 4.���� ���� | 5.���α׷� ����");

			int num = sc.nextInt();

			if (num == 1) {

				sj.search();

			} else if (num == 2) {

				sj.searchAvg50();

			} else if (num == 3) {

				sj.showInfo();

			} else if (num == 4) {

				sj.deleteInfo();

			} else if (num == 5) {

				System.out.println("���α׷��� ����˴ϴ�.");

				stop = false;

			} else {
				System.out.println("���� 1���� 5���� �߿� �Է����ּ���. ");
			}

		}

	}

}