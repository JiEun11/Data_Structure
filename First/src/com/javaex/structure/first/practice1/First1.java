package com.javaex.structure.first.practice1;

class Halbe {

	public void disp() {
		System.out.println("halbe");
	}
}

class Abe extends Halbe {
	public void disp() {
		System.out.println("Abe");
	}
}

class Me extends Abe {
	public void disp() {
		System.out.println("Me");
	}
}

public class First1 {
	
	public static void main(String[] args) {
		Halbe halbe = new Halbe();
		Abe abe = new Abe();
		Me me = new Me();

		Halbe h;

		h = halbe;
		h.disp();

		// halbe가 abe타입 접근
		h = abe; // 동적 바인딩: 부모의 레퍼런스로 자식 접근
		h.disp();

		h = me;
		h.disp();

		halbe.disp();
		abe.disp();
		me.disp();
	}

}
