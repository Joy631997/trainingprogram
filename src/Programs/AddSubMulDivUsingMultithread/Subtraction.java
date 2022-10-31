package Programs.AddSubMulDivUsingMultithread;

public class Subtraction extends Thread {
	public void run() {
		int a = 20, b = 40;
		int c = a - b;
		System.out.println("Subtraction  result is:" + c);
	}
}
