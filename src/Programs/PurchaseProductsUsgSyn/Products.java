package Programs.PurchaseProductsUsgSyn;

import java.util.Scanner;

public class Products {
	static int count;
	static String name, name1, name2;
	static Scanner s = new Scanner(System.in);
	static String[] stringArray = new String[5];

	static String Sauce[] = { "chilly", "tomoto", "soya" };
	static String beverges[] = { "tea", "coffee", "boost", "horlics" };
	static String dairy[] = { "milk", "curd", "butter" };

	public static void main(String[] args) {

		System.out.println("enter your product");
		for (int i = 0; i < stringArray.length; i++) {
			stringArray[i] = s.nextLine();
		}
		Products sm = new Products();
		Product1 v = new Product1();
		v.start();
		v.setName("BEVERGES");
		name = v.getName();
		Product2 v1 = new Product2();
		v1.start();
		v1.setName("SAUCE");
		name1 = v1.getName();
		Product3 v2 = new Product3();
		v2.start();
		v2.setName("DAIRY");
		name2 = v2.getName();
	}

	static synchronized public void beverges() {
		System.out.println("-----" + name + "-------");
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < beverges.length; j++) {

				if (stringArray[i].equals(beverges[j])) {

					System.out.println(beverges[j]);
				}
			}
		}
	}

	static synchronized public void dairy() {
		System.out.println("-----" + name2 + "-------");
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < dairy.length; j++) {

				if (stringArray[i].equals(dairy[j])) {

					System.out.println(dairy[j]);
				}
			}
		}
	}

	static synchronized public void Sauce() {
		System.out.println("-----" + name1 + "-------");
		for (int i = 0; i < stringArray.length; i++) {
			for (int j = 0; j < Sauce.length; j++) {

				if (stringArray[i].equals(Sauce[j])) {

					System.out.println(Sauce[j]);
				}
			}
		}
	}
}
