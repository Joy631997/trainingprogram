package Programs.EBbillcalculation;

import java.util.Scanner;

public interface Commercial_Users {
	public static void panchayat() {
		int fixedcharge = 15;

		double bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units here: ");
		int unit = sc.nextInt();
		if (unit < 100) {
			bill = 100 * 0;
			System.out.println("with in 100 units no need to pay");
		} else if (unit < 300) {
			bill = (unit - 100) * 3;
		} else if (unit < 400) {
			bill = (unit - 100) * 4;
		} else if (unit >= 400) {
			bill = (unit - 100) * 5;
		}

		System.out.println(bill + fixedcharge);
	}

	public static void rural() {
		int fixedcharge = 10;
		double bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units here: ");
		int unit = sc.nextInt();
		if (unit < 100) {
			bill = 100 * 0;
			System.out.println("with in 100 units no need to pay");
		} else if (unit < 300) {
			bill = (unit - 100) * 4;
		} else if (unit < 400) {
			bill = (unit - 100) * 5.5;
		} else if (unit >= 400) {
			bill = (unit - 100) * 6.5;
		}

		System.out.println(bill + fixedcharge);
	}

	public static void metropolitian() {
		int fixedcharge = 25;
		double bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units here: ");
		int unit = sc.nextInt();
		if (unit < 100) {
			bill = 100 * 0;
			System.out.println("with in 100 units no need to pay");
		} else if (unit < 300) {
			bill = (unit - 100) * 15;
		} else if (unit < 400) {
			bill = (unit - 100) * 20;
		} else if (unit >= 400) {
			bill = (unit - 100) * 25.5;
		}

		System.out.println(bill + fixedcharge);
	}

	public static void urban() {
		int fixedcharge = 20;
		double bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units here: ");
		int unit = sc.nextInt();
		if (unit < 100) {
			bill = 100 * 0;
			System.out.println("with in 100 units no need to pay");
		} else if (unit < 300) {
			bill = (unit - 100) * 3.5;
		} else if (unit < 400) {
			bill = (unit - 100) * 4.5;
		} else if (unit >= 400) {
			bill = (unit - 100) * 5.5;
		}

		System.out.println(bill + fixedcharge);
	}

}
