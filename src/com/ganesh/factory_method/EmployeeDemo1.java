package com.ganesh.factory_method;
import java.util.Scanner;
public class EmployeeDemo1 {
    public static void main(String[] args) {
		   Scanner sc = new Scanner(System.in);
		   System.out.println("How many Employee Object You want?");
		   int noOfObj = sc.nextInt();
		   
		   for(int i=0;i<noOfObj;i++) {
			     Employee1 employee1 = Employee1.getEmployeeObject();
			     System.out.println(employee1);
		   }
		   sc.close();
	}
}
