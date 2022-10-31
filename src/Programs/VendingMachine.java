package Programs;

import java.util.*;
import java.util.Map.Entry;

public class VendingMachine {
	public static void main(String[] args) {

		int your_balance_amount = 0;
		LinkedHashMap<String, Integer> lm = new LinkedHashMap<String, Integer>();
		lm.put("A1", 10);
		lm.put("A2", 20);
		lm.put("A3", 30);
		lm.put("A4", 10);
		lm.put("A5", 20);
		lm.put("A6", 10);
		lm.put("A7", 20);
		lm.put("A8", 30);
		lm.put("A9", 10);
		lm.put("A10", 20);
		System.out.println(lm);
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter Your Price Amount");
		int price = sc.nextInt();
		System.out.println("Enter Your Product");
		String product = sc.next();
		Set<Entry<String, Integer>> s1 = lm.entrySet();
		for (Entry<String, Integer> i1 : s1) {
			if (i1.getValue() <= price) {
				System.out.println(i1);
			}
		}
		for (Entry<String, Integer> i1 : s1) {
			if (i1.getKey().equalsIgnoreCase(product)) {

				your_balance_amount = price - lm.get(product);
				System.out.println("Your product is:" + "   : " + i1.getKey() + " " + "Your product price is :" + " "
						+ i1.getValue());
				System.out.println("Balance Amount" + " " + your_balance_amount);
				System.out.println("You have " + your_balance_amount + " "
						+ "if you needto purchase,you have these possibilities listedby:");
			}
		}

		while (your_balance_amount > 0) {
			Set<Entry<String, Integer>> s2 = lm.entrySet();
			for (Entry<String, Integer> i2 : s2) {
				if (i2.getValue() <= your_balance_amount) {
					System.out.println(i2);
				}
			}
			
			System.out.println("Enter the Product");
			String product1 = sc.next();
			Set<Entry<String, Integer>> s3 = lm.entrySet();
			for (Entry<String, Integer> i3 : s3) {
				if (i3.getKey().equalsIgnoreCase(product1)) {

					your_balance_amount = your_balance_amount - lm.get(product1);
					System.out.println("Your product is:" + " " + i3.getKey() + " " + "Your product price is :" + " "
							+ i3.getValue());
					System.out.println("Balance Amount" + " " + your_balance_amount);

				}
			}
		}
		System.out.println("Thanks For Purchasing");
		System.out.println("Visit Again");
	}

}
