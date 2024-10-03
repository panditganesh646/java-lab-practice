package com.ganesh.pass_by_value;

public class ReferenceDemoProduct1 {
      public static void main(String[] args) {
		     Product p1 = new Product();
		     System.out.println(p1.getProductId());
		     
		     accept(p1);
		     System.out.println(p1.getProductId());
	}
      public static void accept(Product prod) {
    	    prod = new Product();
    	    prod.setProductId(999);
      }
}
