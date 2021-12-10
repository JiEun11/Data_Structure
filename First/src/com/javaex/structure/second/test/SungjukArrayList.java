package com.javaex.structure.second.test;

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

	public float getAvg() {

		return avg = getTotal() / 3.f;

	}

	public String toString() {

		return "�̸�: " + name + "\t" + "��������: " + kor + "\t" + "��������: " + eng + "\t" + "��������: " + math + "\t" + "�հ�: "
				+ total + "\t" + "���: " + avg;

	}

//�л� ���� ���

//public void showInfo() {

//System.out.println("�л�: " + this.name);

//System.out.println("��������: " + this.kor);

//System.out.println("��������: " + this.eng);

//System.out.println("��������: " + this.math);

//}

}

public class SungjukArrayList {

	private Student[] stu;

	public SungjukArrayList(int num) {

		stu = new Student[num];

	}

	public void input() {

		for (int i = 0; i < stu.length; i++) {

			Scanner sc = new Scanner(System.in);

			stu[i] = new Student();

			System.out.print("�̸��� �Է��ϼ���: ");

			stu[i].setName(sc.next()); // ���� �̷��� �� ���ڴ� �ϸ�

			System.out.print("���� ������ �Է��ϼ���: ");

			stu[i].setKor(sc.nextInt()); // ���� ���� �Է�

			System.out.print("���� ������ �Է��ϼ���: ");

			stu[i].setEng(sc.nextInt()); // ���� ���� �Է�

			System.out.print("���� ������ �Է��ϼ���: ");

			stu[i].setMath(sc.nextInt()); // ���� ���� �Է�

//Student stu = new Student(name, kor, eng, math); // �� �־��ְ� ��ü ����

		}

	}

//�л� �̸� �Է� �� ���� ��ȸ

	public void search() {

		System.out.println("�л� �̸��� �Է��ϼ���. ��)������");

		Scanner sc = new Scanner(System.in);

		String nameSearch = sc.next();

		for (int i = 0; i < stu.length; i++) {

			if (stu[i].getName().equals(nameSearch)) {

				System.out.println("���� ����: " + stu[i].getKor());

				System.out.println("���� ����: " + stu[i].getEng());

				System.out.println("���� ����: " + stu[i].getMath());

				System.out.println("�� ��: " + stu[i].getTotal());

				System.out.println("�� ��: " + stu[i].getAvg());

			}

		}

	}

//��� 50�� �̻��� �л��� �̸� ���

	public void searchAvg50() {

		for (int i = 0; i < stu.length; i++) {

			if (stu[i].getAvg() >= 50) {

				System.out.println(stu[i].getName());

			}

		}

	}

//��ü ��� ��ȸ

	public void showInfo() {

		for (int i = 0; i < stu.length; i++) {

			System.out.println(stu[i].toString());

		}

	}

	public static void main(String[] args) {
		System.out.println("-------------------------");

		System.out.println("------����ó�� ���α׷�-------");

		System.out.print("�л� ���� �Է��ϼ���: ");

		Scanner sc = new Scanner(System.in);

		SungjukArrayList sj = new SungjukArrayList(sc.nextInt());

		sj.input();

		boolean stop = true;

		while (stop) {

			System.out.println("1.�л� ���� ��ȸ | 2.��� 50���̻� �л� ��ȸ | 3.��ü ��� ��ȸ | 4.���α׷� ����");

			int num = sc.nextInt();

			if (num == 1) {

				sj.search();

			} else if (num == 2) {

				sj.searchAvg50();

			} else if (num == 3) {

				sj.showInfo();

			} else if (num == 4) {

				System.out.println("���α׷��� ����˴ϴ�.");

				stop = false;

			} else {

				System.out.println("���� 1���� 5���� �߿� �Է����ּ���. ");

			}

		}

	}

}