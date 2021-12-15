package com.javaex.mysql.javapractice;

public class Multiplication {
	private int dan;
	private int number;
	
	Multiplication() {}  // default contructor
	
	Multiplication(int dan){
		this.dan = dan;
	}
	
	Multiplication(int dan, int number){
		this.dan = dan;
		this.number = number;
	}
	
	public void printPart() {
		if(number == 0) {
			for(int n = 1; n <= 9; n++) {
				System.out.println("\t"+dan +"*"+n+"="+dan*n);
				System.out.println();
			}
		}else {
			System.out.println(dan * number);
		}
	}

	public int getDan() {
		return dan;
	}

	public void setDan(int dan) {
		this.dan = dan;
	}

	public int getNumber() {
		return number;
	}

	public void setNumber(int number) {
		this.number = number;
	}
	
	
}
