package com.javaex.structure.first.sungjuk;

public class Sungjuk {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

	}

	public class Student {

		private String name;
		private int kor;
		private int eng;
		private int math;

		public Student() {
		}

		public Student(String name, int kor, int eng, int math) {
			this.setName(name);
			this.setKor(kor);
			this.setEng(eng);
			this.setMath(math);
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

		public void showInfo() {
			System.out.println("학생: " + this.name);
			System.out.println("국어점수: " + this.kor);
			System.out.println("영어점수: " + this.eng);
			System.out.println("수학점수: " + this.math);
		}

	}

}
