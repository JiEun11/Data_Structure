package com.javaex.mysql.javapractice.collection;

import java.util.HashSet;
import java.util.Iterator;

public class ProductTest {
	private HashSet<Product> hs = new HashSet<>();
	
	public static void main(String[] args) {
		ProductTest pt = new ProductTest();
		

		Product pd1 = new Product("p100","TV","20000");
		Product pd2 = new Product("p200","Computer","10000");
		Product pd3 = new Product("p100","MP3","700");
		Product pd4 = new Product("p400","Audio","1000");
		
	
		
		System.out.println("제품ID       제품명        가격      ");
		System.out.println("--------------------------------");
		System.out.println(pd1.toString());
		
		System.out.println(pd1.equals(pd3));
		
	}
	
	/*
	 * 값을 넣어주는 메소드
	 *
	 */
	public boolean insertValues(Product p) {
		Iterator<Product> pi = hs.iterator();
		
		while(pi.hasNext()) {
			if(pi.next().equals(p)) {
				return false;
			}
			
		}
		
		return true;
	}
	
	
	/*
	 * id 같은지 체크하는 메소드
	 */

}
