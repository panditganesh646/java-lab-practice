package com.ganesh.scenario_program;

public class CardsOnOffer {
     public static CardType getOfferedCard(Customer cust) {
    	    int creditPoint   = cust.getCreditPoints();
    	    if(creditPoint>=100 && creditPoint<=500) {
    	    	  return new CardType("Silver",cust);
    	    }
    	    else if(creditPoint>500 && creditPoint<=1000) {
    	    	    return new CardType("Gold",cust);
    	    }
    	    else if(creditPoint>1000) {
    	    	  return new CardType("Platinum", cust);
    	    }
    	    else {
    	    	 return new CardType("EMI", cust);
    	    }
     }
}
