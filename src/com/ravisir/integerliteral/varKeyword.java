package com.ravisir.integerliteral;
/*
 * var keyword is introduced from java 10v.
 * It can be used inside the method only.
 * It must be initialised in the same line where we are declaring the variable with var keyword.
 * It is also known as local variable type inference.
 * 
 * 
 * */
public class varKeyword {
    public static void main(String[] args) {
		    var x = 10;//Initialization is compulsory here
		    System.out.println(x);
	}
}
