package Programs.AtmUsingCustomException;

import java.util.Scanner;

public class DenominationException extends Exception {
	public static void denomination() throws DenominationException {
		Scanner sc = new Scanner(System.in);
		// System.out.println("Enter Available Cash");
		System.out.println("Available Cash :1.2000 2.500");
		int cash = sc.nextInt();
		if (cash % 2000 == 0 || cash % 500 == 0) {
			System.out.println("collect your cash");
		} else {
			throw new DenominationException();
		}

	}
}
