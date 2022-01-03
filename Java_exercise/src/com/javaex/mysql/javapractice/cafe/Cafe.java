package com.javaex.mysql.javapractice.cafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cafe {

	private ArrayList<Coffee> al = new ArrayList<>();
	// coffee class 타입으로 arraylist 객체 생성
	int sum = 0;
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cafe cafe = new Cafe();
		/*
		 * 1. 종류선택
		 */
		int total = 0;
		boolean stop = true;
		while (stop) {
			System.out.println("-------카페 주문 시스템 -------");
			System.out.println("종류를 선택하세요.");
			System.out.println("1.아메리카노 2.카페라떼  3.콜드브루  4.카페모카  5.주문종료");
			int chooseNum = sc.nextInt();

			if (chooseNum == 1) {
				// 아메리카노 객체 생성
				cafe.createAmericano();

			} else if (chooseNum == 2) {
				// 카페라떼 객체 생성
				cafe.createCafeLatte();
			} else if (chooseNum == 3) {
				// 콜드브루 객체 생성
				cafe.createColdbrew();

			} else if (chooseNum == 4) {
				// 카페모카 객체 생성
				cafe.createCafeMocha();
			} else if (chooseNum == 5) {
				total = cafe.calculatePrice();
				System.out.println("Total price is " + total + "won");
				cafe.sum = 0;
				cafe.al.clear();
				stop = !stop;

			} else {
				System.out.println("Please choose the number between 1 and 5.");
			}
		}
	}

	/*
	 * 아메리카노 객체 생성 메소드
	 */
	public void createAmericano() {
		Scanner sc = new Scanner(System.in);
		boolean stop = true;
		System.out.println("1.Hot  |  2.Ice ");
		int hotOrIce = sc.nextInt();
		System.out.println("1.Regular   |  2. Large");
		int DrinkSize = sc.nextInt();
		System.out.println("Number of Drinks: (only input the number)");
		int DrinkCount = sc.nextInt();
		int DrinkPrice = 2000 * DrinkCount+ chooseSize(DrinkSize);

		al.add(new Americano(hotOrIce, DrinkSize, DrinkCount, DrinkPrice));
		System.out.println("");

	}

	/*
	 * 카페라떼 객체 생성 메소드
	 */
	public void createCafeLatte() {
		Scanner sc = new Scanner(System.in);
		boolean stop = true;
		System.out.println("1.Hot  |  2.Ice ");
		int hotOrIce = sc.nextInt();
		System.out.println("1.Regular   |  2. Large");
		int DrinkSize = sc.nextInt();
		System.out.println("Number of Drinks: (only input the number)");
		int DrinkCount = sc.nextInt();
		int DrinkPrice = 3000 * DrinkCount + chooseSize(DrinkSize);
		CafeLatte cl = new CafeLatte(hotOrIce, DrinkSize, DrinkCount, DrinkPrice);
		al.add(cl);

	}

	/*
	 * 콜드브루 객체 생성 메소드
	 */
	public void createColdbrew() {
		Scanner sc = new Scanner(System.in);
		boolean stop = true;
		System.out.println("1.Regular   |  2. Large");
		int DrinkSize = sc.nextInt();
		System.out.println("Number of Drinks: (only input the number)");
		int DrinkCount = sc.nextInt();
		int DrinkPrice = 4000 * DrinkCount + chooseSize(DrinkSize);;
		Coldbrew cb = new Coldbrew(DrinkSize, DrinkCount, DrinkPrice);
		al.add(cb);
	}

	/*
	 * 카페모카 객체 생성 메소드
	 */
	public void createCafeMocha() {
		Scanner sc = new Scanner(System.in);
		boolean stop = true;
		System.out.println("1.Hot  |  2.Ice ");
		int hotOrIce = sc.nextInt();
		System.out.println("1.Regular   |  2. Large");
		int DrinkSize = sc.nextInt();
		System.out.println("Number of Drinks: (only input the number)");
		int DrinkCount = sc.nextInt();
		int DrinkPrice = 3800 * DrinkCount + chooseSize(DrinkSize);
		CafeMocha cm = new CafeMocha(hotOrIce, DrinkSize, DrinkCount, DrinkPrice);
		al.add(cm);

	}
	
	/*
	 *  size  
	 */
	public int chooseSize(int num) {
		if(num == 2) {
			return 500;
		}
		return 0;
	}
	
	/*
	 * 최종 계산 메소드
	 */
	public int calculatePrice() {
//		Iterator<Coffee> cp = al.iterator()
//		while (cp.hasNext()) {
		al.forEach(x -> sum += x.getPrice());
//		}
		return sum;
	}

}
