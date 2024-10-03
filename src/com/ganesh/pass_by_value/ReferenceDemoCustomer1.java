package com.ganesh.pass_by_value;

public class ReferenceDemoCustomer1 {
    public static void main(String[] args) {
		   Customer c1= new Customer();
		   System.out.println(c1.getCustomerId());
		   accept(c1);
		   System.out.println(c1.getCustomerId());
	}
    public static void accept(Customer cust) {
    	 cust.setCustomerId(555);
    }
}
