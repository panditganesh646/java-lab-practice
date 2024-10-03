package com.ravisir.encapsulation;

import java.util.Scanner;

public class EmployeeDemo1 {
  public static void main(String[] args) {
	    Scanner sc = new Scanner(System.in);
	    System.out.println();
	    System.out.println("How many Employee Object You want ?");
	    int noOfObj = sc.nextInt();
	    
	    for(int i=1;i<=noOfObj;i++) {
	    	   Employee1 employee = Employee1.getEmployeeObject();
	    	   System.out.println(employee);
	    }
}
}
