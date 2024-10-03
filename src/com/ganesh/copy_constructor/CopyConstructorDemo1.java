package com.ganesh.copy_constructor;

public class CopyConstructorDemo1 {
     public static void main(String[] args) {
		   Employee raj = new Employee(111, "Raj");
		   Manager m1  = new Manager(raj);
		   System.out.println(m1);
	}
}
