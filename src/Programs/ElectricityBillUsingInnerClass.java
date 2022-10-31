package Programs;

import java.util.*;
public class ElectricityBillUsingInnerClass {
	class EbBillInner1 {
		public void selection1() {

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
			} else if (unit > 400) {
				bill = (unit - 100) * 4;
			}

			System.out.println(bill);
		}
	}

	public static void main(String[] args) {
		ElectricityBillUsingInnerClass in = new ElectricityBillUsingInnerClass();
		ElectricityBillUsingInnerClass.EbBillInner1 inp = in.new EbBillInner1();
		inp.selection1();
	}
}
