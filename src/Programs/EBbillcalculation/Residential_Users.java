package Programs.EBbillcalculation;

import java.util.Scanner;

public interface Residential_Users {
	public static void panchayat() {
		int fixedcharge = 5;
		double bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units here: ");
		int unit = sc.nextInt();
		if (unit < 100) {
			bill = 100 * 0;
			System.out.println("with in 100 units no need to pay");
		} else if (unit < 300) {
			bill = (unit - 100) * 2;
		} else if (unit < 400) {
			bill = (unit - 100) * 3;
		} else if (unit >= 400) {
			bill = (unit - 100) * 4;
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
			bill = 100 * 0 + (unit - 100) * 3;
		} else if (unit < 400) {
			bill = 100 * 0 + (unit - 100) * 4;
		} else if (unit >= 400) {
			bill = 100 * 0 + (unit - 100) * 5.5;
		}

		System.out.println(bill + fixedcharge);
	}

	public static void metropolitian() {
		int fixedcharge = 15;
		double bill = 15;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units here: ");
		int unit = sc.nextInt();
		if (unit < 100) {
			bill = 100 * 0;
			System.out.println("with in 100 units no need to pay");
		} else if (unit < 300) {
			bill = (unit - 100) * 10;
		} else if (unit <= 400) {
			bill = (unit - 100) * 15;
		} else if (unit >= 500) {
			bill = (unit - 100) * 20.5;
			int extracharge = 5;
		}

		System.out.println(bill + fixedcharge);
	}

	public static void urban() {
		int fixedcharge = 10;
		double bill = 0;
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the units here: ");
		int unit = sc.nextInt();
		if (unit < 100) {
			bill = 100 * 0;
			System.out.println("with in 100 units no need to pay");
		} else if (unit < 300) {
			bill = (unit - 100) * 2.5;
		} else if (unit < 400) {
			bill = (unit - 100) * 3.5;
		} else if (unit >= 400) {
			bill = (unit - 100) * 4.5;
		}

		System.out.println(bill + fixedcharge);
	}
}
