package com.javaex.structure.first.practice2;

abstract class Abs{
	abstract void disp();  //"disp" ��� ��µǰԲ� 
}

class Outter {
	private int num1 = 10;
	static int num2 = 3;

	public void output() {
		
		new Abs() {
			@Override
			void disp() {
				System.out.println(num1);
				System.out.println(num2);
			}
		}.disp();
	}
}

public class MemberInnerTest {

	public static void main(String[] args) {
	
//		Outter outter = new Outter();   //Outter ��ü ���� 
//		Outter.Inner inner1 = outter.new Inner();   //OutterŬ���� �ȿ� Inner Ŭ������ ��ü ����
//		inner1.disp();
//		
//		Outter.Inner inner2 = (new Outter()).new Inner(); // ������ �� �ٷ� �����
//		Outter.Inner in = new Outter().new Inner();  // ����� ��
//		inner2.disp();
		
//		Outter.Inner inner = new Outter.Inner();
//		inner.disp();
		
//		<local inner class ����>
		Outter out = new Outter();
		out.output();
//		out.output() outinner = out.output().new Inner();
	}

}
