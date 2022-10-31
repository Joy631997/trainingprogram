package Programs.AtmUsingPolymorphism;

import java.util.Scanner;

public class AtmPoly extends AtmPolyMain{

	static int balance = 5000;
	static Scanner sc = new Scanner(System.in);

	public static void main(String[] args) {

		AtmPoly obj = new AtmPoly();

		obj.poly();

	}

	@Override
	public void poly() {
		System.out.println("Enter your choice like 1.withdraw ,2.fastcash");
		int choice = sc.nextInt();
		switch (choice) {
		case 1:
			System.out.println("Enter the Amount");
			int money = sc.nextInt();

			if (balance >= money) {
				balance = balance - money;
				System.out.println("Collect  your amount");
				System.out.println("Your balance Amount :" + " " + balance);
			} else {
				System.out.println("insufficient amount");
			}
			break;
		case 2: {

			System.out.println("Enter your options:");
			System.out.println("5000");
			System.out.println("10000");
			System.out.println("20000");
			System.out.println("50000");
			System.out.println("Select your cash");
			int fastcash = sc.nextInt();
			if (balance >= fastcash) {
				balance = balance - fastcash;
				System.out.println("Collect  your amount");
				System.out.println("Your balance Amount :" + " " + balance);
			}
			break;
		}

		}

	}
}
