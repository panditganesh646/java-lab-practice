package com.ganesh.pass_by_value;

public class PassByValueDemo1 {
      public static void main(String[] args) {
		    int x = 100;
		    changeData(x);
		    System.out.println(x);
	}
      public static void changeData(int y) {
    	   y = 150;
      }
}
