package Programs.AtmUsingCustomException;

public class AtmCustom extends Exception{
	public static void main(String[] args) {
		try {
			PinMismatchException.pin();

			try {
				InsufficientFundException.fund();
			} catch (InsufficientFundException ae) {
				System.out.println("Insufficient Fund ,Please correct your Amount");
			}

			try {
				CashNotAvailableException.cash();
			} catch (CashNotAvailableException cna) {
				System.out.println("Cash not available");
			}
			try {
				DenominationException.denomination();
			} catch (DenominationException de) {
				System.out.println("your money not available");
			}

		} catch (PinMismatchException a) {
			System.out.println("Please correct your pin");
		}

	}
}
