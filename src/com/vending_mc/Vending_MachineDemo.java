package com.vending_mc;

import java.util.LinkedHashMap;
import java.util.Map;
import java.util.Map.Entry;
import java.util.Scanner;
import java.util.Set;

public class Vending_MachineDemo {

	public static void main(String[] args) {

		Map<Integer, String> m = new LinkedHashMap<>();
		m.put(1, "Biscuit");
		m.put(2, "Chocolate");
		m.put(3, "Chips");
		m.put(4, "Juice");
		m.put(5, "Ice Cream");
		m.put(6, "Coffee");
		Map<Integer, Integer> m1 = new LinkedHashMap<>();
		m1.put(1, 5);
		m1.put(2, 23);
		m1.put(3, 25);
		m1.put(4, 66);
		m1.put(5, 100);
		m1.put(6, 51);
		Map<Integer, Integer> m2 = new LinkedHashMap<>();
		m2.put(1, 10);
		m2.put(2, 10);
		m2.put(3, 10);
		m2.put(4, 10);
		m2.put(5, 10);
		m2.put(6, 10);
		Set<Entry<Integer, String>> entrySet = m.entrySet();
		for (Entry<Integer, String> entry : entrySet) {
			System.out.println(entry);
		}
		System.out.println("Enter The Tray Number");
		Scanner s = new Scanner(System.in);
		int tray_no = s.nextInt();

		if (tray_no <= 6) {
			if (tray_no == 1) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 2) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 3) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 4) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 5) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			} else if (tray_no == 6) {
				System.out.println(m.get(tray_no) + " Price is Rs." + m1.get(tray_no));
			}
			System.out.println("Proceed With Transaction : Y/N");
			String proceed = s.next();
			if (proceed.equalsIgnoreCase("Y")) {
				System.out.println("Accepted Denomination is 1 5 10 100");
			} else if (proceed.equalsIgnoreCase("N")) {
				System.out.println("Transaction Cancelled");
				System.out.println("Thank You For Showing Intrest On US");
			}
			System.out.println("Proceed With Payment : Y/N");
			String proceed_payment = s.next();
			if (proceed_payment.equalsIgnoreCase("Y")) {
				System.out.println("Enter The Denomination");
				int denomination = s.nextInt();
				System.out.println("Enter The No Of Note");
				int no_of_note = s.nextInt();
				int price = denomination * no_of_note;
				System.out.println("Enter The Denomination");
				int denomination1 = s.nextInt();
				System.out.println("Enter The No Of Note");
				int no_of_note1 = s.nextInt();
				int price1 = denomination1 * no_of_note1;

				System.out.println("Confirm Payment : Y/N");
				String confirm_denomination = s.next();
				if (confirm_denomination.equalsIgnoreCase("Y")) {
					int total_price = price + price1;
					if (total_price == m1.get(tray_no)) {
						System.out.println("Item Is Dispensing");
						Integer value = m2.get(tray_no);
						m2.put(tray_no, value - 1);
					} else {
						System.err.println("Entered Denomination Does Not Match");
					}
				} else {
					System.out.println("Transaction Cancelled");
					System.out.println("Thank You For Showing Interest On US");
				}

			} else if (proceed_payment.equalsIgnoreCase("N")) {
				System.out.println("Transaction Cancelled");
				System.out.println("Thank You For Showing Interest On US");
			}
			Set<Entry<Integer, Integer>> product_count = m2.entrySet();
			for (Entry<Integer, Integer> entry : product_count) {
				System.out.println(entry);
			}

		} else {
			System.out.println("Tray No Is Out Of Bound");
		}

	}

}