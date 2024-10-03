package com.ravisir.integerliteral;
/*
 * If we want to convert decimal to another number system then 
 * Integer class has provided the following methods toBinaryString(),
 * toOctalString(),toHexString() to convert from decimal to binary, octal,
 * and hexadecimal respectively.
 * 
 * Integer class Static Methods: 
 * 1) public static String toBinaryString(int x);
 * 2) public static String toOctalString(int x);
 * 3) public static String toHexString(int x);
 * */
public class Test3 {
   public static void main(String[] args) {
	     //decimal to Binary
	   System.out.println(Integer.toBinaryString(7));
	   
	   //decimal to Octal 
	   System.out.println(Integer.toOctalString(15));//17
	   
	   //decimal to Hexadecimal
	   System.out.println(Integer.toHexString(2781));
}
}
