package com.javaex.structure.second.test;

import java.util.ArrayList;
import java.util.Scanner;

//Student 정보를 담는 클래스

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

		return "이름: " + name + "\t" + "국어점수: " + kor + "\t" + "영어점수: " + eng + "\t" + "수학점수: " + math + "\t" + "합계: "
				+ total + "\t" + "평균: " + avg;

	}
}

public class SungjukArrayList {

	static int num; // 학생 명수 받을 사용자 값
	private ArrayList<Student> stu; // Student 객체 타입의 ArrayList인 stu 선언

	public SungjukArrayList(int numStudent) { // 사용자 생성자로 ArrayList 용량 정의

		stu = new ArrayList<Student>(numStudent); // Student 객체 타입의 ArrayList Heap 메모리에 올림.
		System.out.println(stu.size());
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

			if (student.getName().contains(nameSearch)) {

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
			if (student.getName().contains(name)) {
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
		
		SungjukArrayList sj = new SungjukArrayList(num);

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