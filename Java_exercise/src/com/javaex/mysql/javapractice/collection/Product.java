package com.javaex.mysql.javapractice.collection;

public class Product {

	private String productID;
	private String productName;
	private String productPrice;

	Product(String productID, String productName, String productPrice) {
		this.productID = productID;
		this.productName = productName;
		this.productPrice = productPrice;
	}

	public String getProductID() {
		return productID;
	}

	public void setProductID(String productID) {
		this.productID = productID;
	}

	public String getProductName() {
		return productName;
	}

	public void setProductName(String productName) {
		this.productName = productName;
	}

	public String getProductPrice() {
		return productPrice;
	}

	public void setProductPrice(String productPrice) {
		this.productPrice = productPrice;
	}

	/*
	 * hasCode() 비교 -> equals 확인 -> 동등
	 */
//	@Override
//	public int hashCode() {
//		System.out.println(getProductID());
//		return Integer.parseInt(getProductID());
//	}

	@Override
	public boolean equals(Object obj) {
		if (obj instanceof Product) {
			Product other = (Product) obj;
			return productID.equals(other.productID);
		}
//		return super.equals(obj);
		return false;
	}
	
	@Override
	public String toString() {
		return getProductID()+"\t"+getProductName()+"\t"+getProductPrice()+"\t";
	}

}
