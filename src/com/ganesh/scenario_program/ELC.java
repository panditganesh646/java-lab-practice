package com.ganesh.scenario_program;

import java.util.Scanner;

public class ELC {
  public static void main(String[] args) {
	     Scanner sc  = new Scanner(System.in);
	     System.out.println("Enter Customer Name: ");
	     String name = sc.nextLine(); 
	     System.out.println("Enter Customer Credit Points: ");
	     int creditPoint = sc.nextInt();
	     Customer c1 = new Customer(creditPoint, name);
	     CardType offeredCard = CardsOnOffer.getOfferedCard(c1);
	     System.out.println(offeredCard);
	     sc.close();
}
}
