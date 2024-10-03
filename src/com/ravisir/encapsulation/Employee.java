package com.ravisir.encapsulation;

public class Employee {
    private double employeeSalary;
    public Employee(double employeeSalary) {
    	 super();
    	 this.employeeSalary  = employeeSalary;
    }
    public double getEmployeeSalary() {
    	  return employeeSalary;
    }
    public void setEmployeeSalary(double employeeSalary) {
    	  if(employeeSalary<=0) {
    		    System.out.println("Invalid data");
    	  }
    	  else {
    		    this.employeeSalary  = employeeSalary;
    	  }
    }
	@Override
	public String toString() {
		return "Employee [employeeSalary=" + employeeSalary + "]";
	}
    
    
}
