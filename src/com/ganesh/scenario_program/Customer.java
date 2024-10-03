package com.ganesh.scenario_program;

public class Customer {
     private int creditPoints;
     private String customerName;
	public Customer(int creditPoints, String customerName) {
		super();
		this.creditPoints = creditPoints;
		this.customerName = customerName;
	}
	public int getCreditPoints() {
		return creditPoints;
	}
	
	@Override
	public String toString() {
		   return this.customerName;
	}
     
}
