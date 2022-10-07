package com.vending_mc;

import java.util.Scanner;

public class Vending_Machine {
	public static void main(String[] args) {
		String[] AvailableItems={"No:1=Biscuit,No:2=Chocolate,No:3=Chips,No:4=Juice,No:5=IceCream,No:6=Coffee"};
		int trayno;
		Scanner scan = new Scanner(System.in);
		System.out.println("Enter Vending machine tray No");
		trayno = scan.nextInt();
		switch (trayno) {
		case 1:
			System.out.println("You Have Selected Biscuit");
			System.out.println("Price for the item is:5");
			break;
		case 2:
			System.out.println("You Have Selected Chocolate");
			System.out.println("Price for the item is:23");
			break;
		case 3:
			System.out.println("You Have Selected Chips");
			System.out.println("Price for the item is:25");
			break;
		case 4:
			System.out.println("You Have Selected Juice");
			System.out.println("Price for the item is:66");
			break;
		case 5:
			System.out.println("You Have Selected Ice Cream");
			System.out.println("Price for the item is:100");
			break;
		case 6:
			System.out.println("You Have Selected Coffee");
			System.out.println("Price for the item is:51");
			break;
		default:
			System.out.println("Invalid item that you have mentioned");
			break;
		}
		System.out.println("Proceed with the payment: Y/N");
		String proceed = scan.next();
		if (proceed.equalsIgnoreCase("Y")) {
			System.out.println("Accepted Denomination Rs:1,5,10,100");
			System.out.println("Thanks you for purchase");
			
		} else if (proceed.equalsIgnoreCase("N")) {
			System.out.println("Trancation Cancelled");
		}
	}
}