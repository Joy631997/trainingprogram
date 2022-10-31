package Programs;

import java.util.Scanner;

public class Palindrome {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the number");
		int ip = sc.nextInt();
		int number = ip, rem = 0;
		while (ip > 0) {
			rem = (rem * 10) + ip % 10;
			ip = ip / 10;
		}
		if (number == rem) {
			System.out.println("the given number is :" + number + " " + " palindrome");
		} else {
			System.out.println("the given number is " + "not a palindrome");
		}
	}
}
