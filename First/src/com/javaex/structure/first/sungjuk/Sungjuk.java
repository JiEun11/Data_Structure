package com.javaex.structure.first.sungjuk;

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
		this.avg = total/3.f;
	}

	public String getName() {
		return name;
	}

	public int getKor() {
		return kor;
	}

	public int getEng() {
		return eng;
	}

	public int getMath() {
		return math;
	}

	public int getTotal() {
		return total = kor+eng+math;
	}

	public float getAvg() {
		return avg = getTotal()/3.f;
	}
	
	public String toString() {
		return name+"\t"+kor+"\t"+eng+"\t"+math+"\t"+total+"\t"+avg;
	}
	
	public void showInfo() {
		System.out.println("학생: " + this.name);
		System.out.println("국어점수: " + this.kor);
		System.out.println("영어점수: " + this.eng);
		System.out.println("수학점수: " + this.math);
	}	
}

public class Sungjuk {
	
	private Student []stu;
	
	public Sungjuk(int num) {
		stu = new Student[num];
	}
	
	public void input() {
		for(int i = 0; i<stu.length; i++) {
			stu[i] = new Student();
			stu[i].setName(sc.next());
			
			Student str = new Student(name, kor, eng, math);
		}
	}
	
	public static void main(String[] args) {
		
	
	}
}
