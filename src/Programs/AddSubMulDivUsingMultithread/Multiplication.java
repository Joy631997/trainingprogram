package Programs.AddSubMulDivUsingMultithread;

public class Multiplication extends Thread {
	public void run() {
		int a = 20, b = 40;
		int c = a * b;
		System.out.println("Multiplication result is:" + c);
	}
}
