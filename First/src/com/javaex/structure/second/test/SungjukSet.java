package com.javaex.structure.second.test;

import java.util.HashSet;
import java.util.Scanner;

// Student Class는 ArrayList 클래스에 있음.

public class SungjukSet {

	static int num; // 학생 명수 받을 사용자 값
	private HashSet<Student> stu; // Student 객체 타입의 HashSet인 stu 선언

	public SungjukSet(int numStudent) { // 사용자 생성자로 HashSet 용량 정의

		stu = new HashSet<Student>(numStudent); // Student 객체 타입의 HashSet을 Heap 메모리에 올림.
	}

	public void input() {
		Scanner sc = new Scanner(System.in); // for문안에 X

		for (int i = 0; i < num; i++) {

			Student student = new Student();

			System.out.print("이름을 입력하세요: ");
			student.setName(sc.next());

			System.out.print("국어 점수를 입력하세요: ");

			student.setKor(sc.nextInt()); // 국어 점수 입력

			System.out.print("영어 점수를 입력하세요: ");

			student.setEng(sc.nextInt()); // 영어 점수 입력

			System.out.print("수학 점수를 입력하세요: ");

			student.setMath(sc.nextInt()); // 수학 점수 입력
			
			stu.add(student); // ArrayList는 객체를 갖고 다루는 애라 객체 넣어줘야함.

//			만약 생성자로 add에 넣어줄꺼면 값 다 입력 받고 생성자를 넣던지
//			String name = sc.next();
//			int kor = sc.nextInt();
//			int eng = sc.nextInt();
//			int math = sc.nextInt();
//			stu.add(new Student(name, kor, eng, math));
//			Student student = new Student(name, kor, eng, math);
//			해주고 stu.add(student); 해주던지
		}
	}

//학생 이름 입력 시 성적 조회

	public void search() {

		System.out.println("학생 이름을 입력하세요. 예)김지은");

		Scanner sc = new Scanner(System.in);

		String nameSearch = sc.next();

		for (Student student : stu) {

			if (student.getName().equals(nameSearch)) {

				System.out.println("국어 점수: " + student.getKor());

				System.out.println("영어 점수: " + student.getEng());

				System.out.println("수학 점수: " + student.getMath());

				System.out.println("합 계: " + student.getTotal());

				System.out.println("평 균: " + student.getAvg());

			}

		}

	}

//평균 50점 이상인 학생들 이름 출력

	public void searchAvg50() {

		for (Student student : stu) {

			if (student.getAvg() >= 50) {

				System.out.println(student.getName());

			}

		}

	}

//전체 목록 조회

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

// 원하는 학생 삭제
	public void deleteInfo() {
		System.out.print("삭제할 학생의 이름을 입력하세요: ");
		Scanner sc = new Scanner(System.in);
		String name = sc.next();
		for (Student student : stu) {
			if (student.getName().equals(name)) {
				System.out.println(name+" 학생에 대한 정보가 삭제됩니다.");
				stu.remove(student);
			}
		}
	}

	public static void main(String[] args) {
		System.out.println("-------------------------");

		System.out.println("------성적처리 프로그램-------");

		System.out.print("학생 수를 입력하세요: ");

		Scanner sc = new Scanner(System.in);
		
		num = sc.nextInt();
		
		SungjukSet sj = new SungjukSet(num);

		sj.input();

		boolean stop = true;

		while (stop) {

			System.out.println("1.학생 성적 조회 | 2.평균 50점이상 학생 조회 | 3.전체 목록 조회 | 4.정보 삭제 | 5.프로그램 종료");

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

				System.out.println("프로그램이 종료됩니다.");

				stop = false;

			} else {
				System.out.println("숫자 1부터 5까지 중에 입력해주세요. ");
			}

		}

	}

}