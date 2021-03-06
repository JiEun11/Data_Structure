package com.javaex.structure.first.practice1;

/*
추상 클래스
1. 오직 상속을 목적으로 사용.
2. 추상 클래스를 상속받는 sub class는 무조건 추상메소드를 오버라이드 해야한다.
	하지 않을 경우 추상클래스화 되서 객체를 생성할 수 없다.
3. 추상메소드는 강제성을 발휘하기 때문에 꼭 오버라이드 해야만 한다.

4. 추상클래스 보다 더 추상화 된 것은 interface 이다.

5. 추상메소드, 상수를 갖는게 원칙
6. 인터페이스는 다중 상속을 허용한다. (모호성이 발생하지 않는다.)
7. 다중상속을 대체하기 위해 만들어 졌다.


*/
interface ss{
	//상수, 추상메소드
	
	final static int num = 10;  //상수임..
	abstract void disp();
}

interface sss extends ss{
	//상수, 추상메소드
	
	final static int num = 10;  //상수임..
	abstract void disp();
}

interface ssss extends ss, sss{
	//상수, 추상메소드
	
	final static int num = 10;  //상수임..
	abstract void disp();
}

class First implements ssss{

	@Override
	public void disp() {
		// TODO Auto-generated method stub
		
	}
	
}