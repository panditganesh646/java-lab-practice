package com.ganesh.pass_by_value;

public class Customer1 {
	private double customerBill  =4000;
	
    public static void main(String[] args) {
		  Customer1 c1 = new Customer1();
		  Customer1 c2 = c1;
		  c2.customerBill = 9000;
		  System.out.println(c1.customerBill);
		  System.out.println(c2.customerBill);
		  
	}
}
