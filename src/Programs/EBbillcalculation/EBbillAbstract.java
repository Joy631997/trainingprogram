package Programs.EBbillcalculation;

import java.util.Scanner;

public abstract class EBbillAbstract {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println(
				"1.Residential_Userspanchayat\n2.Residential_Usersrural\n3.Residential_Usersmetropolitian\n4.Residential_Usersurban");
		System.out.println(
				"5.Commercial_Userspanchayat\n6.Commercial_Usersrural\n7.Commercial_Usersmetropolitian\n8.Commercial_Usersurban");
		System.out.println("Enter your input here");
		int in = sc.nextInt();
		switch (in) {
		case 1:
			Residential_Users.panchayat();
			break;
		case 2:
			Residential_Users.rural();
			break;
		case 3:
			Residential_Users.metropolitian();
			break;
		case 4:
			Residential_Users.urban();
			break;
		case 5:
			Commercial_Users.panchayat();
			break;
		case 6:
			Commercial_Users.rural();
			break;
		case 7:
			Commercial_Users.metropolitian();
			break;
		case 8:
			Commercial_Users.urban();
			break;
		default:
			System.out.println("Thank you");

		}

	}
}