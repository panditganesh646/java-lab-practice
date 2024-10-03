package com.ganesh.scenario_program;
public class CardType {
    private String cardType;
    private Customer customer;
    
    public CardType(String cardType,Customer customer) {
    	  super();
    	  this.cardType = cardType;
    	  this.customer = customer;
    }

	@Override
	public String toString() {
		return "CardType [cardType=" + cardType + ", customer=" + customer + "]";
	}
    
    
}
