package Programs.AtmUsingCustomException;

import java.util.Scanner;

public class PinMismatchException extends Exception {
	public static void pin() throws PinMismatchException {
		Scanner sc = new Scanner(System.in);

		int arr[] = { 2202, 2201, 2204, 2203 };
		System.out.println("enter your pin");
		int pinNum = sc.nextInt();

		for (int i = 0; i < arr.length; i++) {

			if (arr[i] == pinNum) {
				System.out.println("same");
				break;
			} else if (i == arr.length - 1) {
				throw new PinMismatchException();
			}
		}

	}
}
