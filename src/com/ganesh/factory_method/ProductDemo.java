package com.ganesh.factory_method;

public class ProductDemo {
   public static void main(String[] args) {
	     Product obj = Product.getProductObject();
	     System.out.println(obj);
}
}
