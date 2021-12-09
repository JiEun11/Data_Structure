package com.javaex.structure.first.practice1;

public class First2 {

	// field
	private int a;
	private int b;

	// constructor : class명과 똑같고 return type이 아예 없다.
	public First2() {
//		a=b=0;   // 앵간해서 내가 직접 초기화 해주는게 좋음
		this(0, 0); // 초기화 위임
	}

	public First2(int a) {
//		this.a = a; // 매개변수랑 필드랑 구분하기 위한 this
//		b=0;
		this(a, 0);
	}

	public First2(int a, int b) {
		this.a = a;
		this.b = b;
	}

	// method
	public int getA() {
		return a;
	}

	public int getB() {
		return b;
	}

	public static void main(String[] args) {

		First2 aa = new First2();
		First2 bb = new First2(10);
		First2 cc = new First2(20, 3);

		System.out.println(aa.getA() + "\t" + aa.getB()); // 0,0
		System.out.println(bb.getA() + "\t" + bb.getB()); // 10,0
		System.out.println(cc.getA() + "\t" + cc.getB()); // 20,3
	}
}
