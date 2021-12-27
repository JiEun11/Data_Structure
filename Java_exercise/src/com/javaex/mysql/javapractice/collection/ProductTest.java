package com.javaex.mysql.javapractice.collection;

import java.util.HashSet;
import java.util.Iterator;

public class ProductTest {
	private HashSet<Product> hs = new HashSet<>();

	public static void main(String[] args) {
		ProductTest pt = new ProductTest();

		pt.addProductObj(new Product("p100", "TV", "20000"));
		pt.addProductObj(new Product("p200", "Computer", "10000"));
		pt.addProductObj(new Product("p100", "MP3", "700"));
		pt.addProductObj(new Product("p400", "Audio", "1000"));


	}

	/*
	 * add Obj
	 */
	public void addProductObj(Product p) {
		if (checkProductID(p)) {
			hs.add(p);
			System.out.println("성공적으로 저장되었습니다.");
		} else {
			System.out.println("동일한 ID의 제품이 이미 저장되어 있습니다.");
		}
	}

	/*
	 * Check the productID if they are same
	 *
	 */
	public boolean checkProductID(Product p) {
		Iterator<Product> pi = hs.iterator();

		while (pi.hasNext()) {
			if (pi.next().equals(p)) {
				return false;
			}

		}

		return true;
	}
	
	/*
	 * print the result
	 */
	public void displayProduct(Product p) {
		System.out.println("제품ID       제품명        가격      ");
		System.out.println("--------------------------------");
		System.out.println(p.toString());
	}
}
