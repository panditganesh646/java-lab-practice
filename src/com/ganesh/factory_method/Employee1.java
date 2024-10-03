package com.ganesh.factory_method;

import java.util.Scanner;

import com.ravisir.encapsulation.Employee;

public class Employee1 {
      private int employeeId;
      private String employeeName;
      private double employeeSalary;
      
      public Employee1(int employeeId,String employeeName,double employeeSalary) {
    	    super();
    	    this.employeeId = employeeId;
    	    this.employeeName = employeeName;
    	    this.employeeSalary = employeeSalary;
      }

	@Override
	public String toString() {
		return "Employee1 [employeeId=" + employeeId + ", employeeName=" + employeeName + ", employeeSalary="
				+ employeeSalary + "]";
	}
	public static Employee1 getEmployeeObject()
	{
		 Scanner sc = new Scanner(System.in);
		 System.out.println("Enter Employee Id:");
		 int id = sc.nextInt();
		 
		 System.out.println("Employee Name: ");
		 String name = sc.nextLine();
		 name = sc.nextLine();
		 
		 System.out.println("Enter Employee Salary: ");
		 double sal = sc.nextDouble();
		 
		 return new Employee1(id,name,sal);
		 
	}
      
}
