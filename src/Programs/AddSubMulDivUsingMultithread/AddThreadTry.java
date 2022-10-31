package Programs.AddSubMulDivUsingMultithread;

public class AddThreadTry extends Thread {
	public static void main(String[] args) {
		Multiplication m = new Multiplication();
		Division d = new Division();
		Addition a = new Addition();
		Subtraction s = new Subtraction();

		m.setPriority(10);
		d.setPriority(10);
		a.setPriority(5);
		s.setPriority(3);

		System.out.println("Result are" + m.getPriority() + "\n" + d.getPriority() + " \n" + a.getPriority() + " \n"
				+ s.getPriority());
		m.start();
		d.start();
		a.start();
		s.start();
	}
}
