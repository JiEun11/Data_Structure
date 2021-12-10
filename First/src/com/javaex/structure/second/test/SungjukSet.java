package com.javaex.structure.second.test;

import java.util.HashSet;
import java.util.Scanner;

// Student Class�� ArrayList Ŭ������ ����.

public class SungjukSet {

	static int num; // �л� ��� ���� ����� ��
	private HashSet<Student> stu; // Student ��ü Ÿ���� HashSet�� stu ����

	public SungjukSet(int numStudent) { // ����� �����ڷ� HashSet �뷮 ����

		stu = new HashSet<Student>(numStudent); // Student ��ü Ÿ���� HashSet�� Heap �޸𸮿� �ø�.
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

			if (student.getName().equals(nameSearch)) {

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
			if (student.getName().equals(name)) {
				System.out.println(name+" �л��� ���� ������ �����˴ϴ�.");
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
		
		SungjukSet sj = new SungjukSet(num);

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