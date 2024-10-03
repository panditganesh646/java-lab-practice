package com.ganesh.pass_by_value;

public class Customer2 {
	public double customerBill = 4000;
     public static void main(String[] args) {
		  Customer2 c1 = new Customer2();
		  Customer2 c2 = new Customer2();
		  c2.customerBill = 10000;
		  System.out.println(c1.customerBill);
		  System.out.println(c2.customerBill);
	}
}
