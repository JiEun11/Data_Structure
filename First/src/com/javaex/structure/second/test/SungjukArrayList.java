package com.javaex.structure.second.test;

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

	public float getAvg() {

		return avg = getTotal() / 3.f;

	}

	public String toString() {

		return "이름: " + name + "\t" + "국어점수: " + kor + "\t" + "영어점수: " + eng + "\t" + "수학점수: " + math + "\t" + "합계: "
				+ total + "\t" + "평균: " + avg;

	}

//학생 정보 출력

//public void showInfo() {

//System.out.println("학생: " + this.name);

//System.out.println("국어점수: " + this.kor);

//System.out.println("영어점수: " + this.eng);

//System.out.println("수학점수: " + this.math);

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

			System.out.print("이름을 입력하세요: ");

			stu[i].setName(sc.next()); // 만약 이렇게 안 쓰겠다 하면

			System.out.print("국어 점수를 입력하세요: ");

			stu[i].setKor(sc.nextInt()); // 국어 점수 입력

			System.out.print("영어 점수를 입력하세요: ");

			stu[i].setEng(sc.nextInt()); // 영어 점수 입력

			System.out.print("수학 점수를 입력하세요: ");

			stu[i].setMath(sc.nextInt()); // 수학 점수 입력

//Student stu = new Student(name, kor, eng, math); // 다 넣어주고 객체 생성

		}

	}

//학생 이름 입력 시 성적 조회

	public void search() {

		System.out.println("학생 이름을 입력하세요. 예)김지은");

		Scanner sc = new Scanner(System.in);

		String nameSearch = sc.next();

		for (int i = 0; i < stu.length; i++) {

			if (stu[i].getName().equals(nameSearch)) {

				System.out.println("국어 점수: " + stu[i].getKor());

				System.out.println("영어 점수: " + stu[i].getEng());

				System.out.println("수학 점수: " + stu[i].getMath());

				System.out.println("합 계: " + stu[i].getTotal());

				System.out.println("평 균: " + stu[i].getAvg());

			}

		}

	}

//평균 50점 이상인 학생들 이름 출력

	public void searchAvg50() {

		for (int i = 0; i < stu.length; i++) {

			if (stu[i].getAvg() >= 50) {

				System.out.println(stu[i].getName());

			}

		}

	}

//전체 목록 조회

	public void showInfo() {

		for (int i = 0; i < stu.length; i++) {

			System.out.println(stu[i].toString());

		}

	}

	public static void main(String[] args) {
		System.out.println("-------------------------");

		System.out.println("------성적처리 프로그램-------");

		System.out.print("학생 수를 입력하세요: ");

		Scanner sc = new Scanner(System.in);

		SungjukArrayList sj = new SungjukArrayList(sc.nextInt());

		sj.input();

		boolean stop = true;

		while (stop) {

			System.out.println("1.학생 성적 조회 | 2.평균 50점이상 학생 조회 | 3.전체 목록 조회 | 4.프로그램 종료");

			int num = sc.nextInt();

			if (num == 1) {

				sj.search();

			} else if (num == 2) {

				sj.searchAvg50();

			} else if (num == 3) {

				sj.showInfo();

			} else if (num == 4) {

				System.out.println("프로그램이 종료됩니다.");

				stop = false;

			} else {

				System.out.println("숫자 1부터 5까지 중에 입력해주세요. ");

			}

		}

	}

}