package Programs.Gears;

import java.util.Scanner;

public class Gear extends GearMain {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter the gear");
		int num = sc.nextInt();
		Gear obj = new Gear();
		obj.gear(num);
		System.out.println("Do you want to reduce your speed: 1.yes,2.no");
		int in = sc.nextInt();
		if (in == 1) {
		obj.gear(num - 1);
		} else if (in == 2) {
		System.out.println("Your speed is normal");
		}

		}
}
