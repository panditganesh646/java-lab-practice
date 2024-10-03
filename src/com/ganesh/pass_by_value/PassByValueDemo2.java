package com.ganesh.pass_by_value;

public class PassByValueDemo2 {
     public static void main(String[] args) {
		     int x = 100;
		     x = changeData(x);
		     System.out.println(x);
	}
     public static int changeData(int y) {
    	  y = 150;
    	  return y;
     }
}
