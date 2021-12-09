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

		// halbe�� abeŸ�� ����
		h = abe; // ���� ���ε�: �θ��� ���۷����� �ڽ� ����
		h.disp();

		h = me;
		h.disp();

		halbe.disp();
		abe.disp();
		me.disp();
	}

}
