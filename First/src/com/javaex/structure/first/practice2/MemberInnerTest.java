package com.javaex.structure.first.practice2;

abstract class Abs{
	abstract void disp();  //"disp" 라고 출력되게끔 
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
	
//		Outter outter = new Outter();   //Outter 객체 생성 
//		Outter.Inner inner1 = outter.new Inner();   //Outter클래스 안에 Inner 클래스의 객체 생성
//		inner1.disp();
//		
//		Outter.Inner inner2 = (new Outter()).new Inner(); // 위에꺼 한 줄로 만들기
//		Outter.Inner in = new Outter().new Inner();  // 강사님 답
//		inner2.disp();
		
//		Outter.Inner inner = new Outter.Inner();
//		inner.disp();
		
//		<local inner class 연습>
		Outter out = new Outter();
		out.output();
//		out.output() outinner = out.output().new Inner();
	}

}
