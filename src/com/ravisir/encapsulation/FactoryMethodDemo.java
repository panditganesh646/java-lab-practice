package com.ravisir.encapsulation;

public class FactoryMethodDemo {
    int x;
    public  FactoryMethodDemo(int x){
    	  this.x = x;
    }
    public FactoryMethodDemo m1() {
    	   return new FactoryMethodDemo(5);
    }
}
