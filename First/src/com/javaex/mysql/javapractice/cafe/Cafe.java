package com.javaex.mysql.javapractice.cafe;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.Scanner;

public class Cafe {

	private ArrayList<Coffee> al = new ArrayList<>();
	// coffee class Ÿ������ arraylist ��ü ����
	int sum = 0;

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		Cafe cafe = new Cafe();
		/*
		 * 1. ��������
		 */
		int total = 0;
		boolean stop = true;
		while (stop) {
			System.out.println("-------ī�� �ֹ� �ý��� -------");
			System.out.println("������ �����ϼ���.");
			System.out.println("1.�Ƹ޸�ī�� 2.ī���  3.�ݵ���  4.ī���ī  5.�ֹ�����");
			int chooseNum = sc.nextInt();

			if (chooseNum == 1) {
				// �Ƹ޸�ī�� ��ü ����
				cafe.createAmericano();

			} else if (chooseNum == 2) {
				// ī��� ��ü ����
				cafe.createCafeLatte();
			} else if (chooseNum == 3) {
				// �ݵ��� ��ü ����
				cafe.createColdbrew();

			} else if (chooseNum == 4) {
				// ī���ī ��ü ����
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
	 * �Ƹ޸�ī�� ��ü ���� �޼ҵ�
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
	 * ī��� ��ü ���� �޼ҵ�
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
	 * �ݵ��� ��ü ���� �޼ҵ�
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
	 * ī���ī ��ü ���� �޼ҵ�
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
	 * ���� ��� �޼ҵ�
	 */
	public int calculatePrice() {
//		Iterator<Coffee> cp = al.iterator()
//		while (cp.hasNext()) {
		al.forEach(x -> sum += x.getPrice());
//		}
		return sum;
	}

}
