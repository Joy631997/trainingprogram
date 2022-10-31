package Programs.AtmUsingCustomException;

import java.util.Scanner;

public class InsufficientFundException extends Exception {
	public static void fund() throws InsufficientFundException {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter you amount");
		int Amount = 10000;
		int money = sc.nextInt();
		if (money > Amount) {
		throw new InsufficientFundException();

		} else if (money <= Amount) {
		System.out.println("carry on");
		}
		}
}
