package com.javaex.structure.first.practice2;


class Outter{
	private int num1 = 10;
	static int num2 = 3;

	static class Inner{
		public void disp() {
//			System.out.println(num1);
			System.out.println(num2);
		}
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
		
		Outter.Inner inner = new Outter.Inner();
		inner.disp();
		
	}

}
