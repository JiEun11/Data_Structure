package com.javaex.mysql.javapractice.gugudan;

public class GuGuDanExpr extends Multiplication{
	public GuGuDanExpr() {}
	
	public GuGuDanExpr(int dan) {
		this.setDan(dan);
	}
	
	
	public GuGuDanExpr(int dan, int number) {
		this.setDan(dan);
		this.setNumber(number);
	}
	
	static void printAll() {
		for(int i=1; i<10; i++) {
			for(int j=1; j<10; j++) {
				System.out.printf("%d * %d = %d %t",i,j);
			}
			System.out.println();
		}
	}
}
