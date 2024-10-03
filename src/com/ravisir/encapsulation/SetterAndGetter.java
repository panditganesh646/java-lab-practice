package com.ravisir.encapsulation;

public class SetterAndGetter {
    public static void main(String[] args) {
		 Employee scott = new Employee(55000);
		 scott.setEmployeeSalary(scott.getEmployeeSalary()+10000);
		 System.out.println(scott);
		 double empSalary = scott.getEmployeeSalary();
		 if(empSalary>=60000) {
			  System.out.println("Scott is Developer");
		 }
		 else if(empSalary>=40000) {
			  System.out.println("Scott is Designer");
		 }
		 else {
			  System.out.println("Scott is Tester");
		 }
		 
	}
}
