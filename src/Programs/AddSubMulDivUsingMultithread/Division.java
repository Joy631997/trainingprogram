package Programs.AddSubMulDivUsingMultithread;

public class Division extends Thread {
	public void run() {
		int a = 20, b = 40;
		int c = a / b;
		System.out.println("Division  result is:" + c);
	}
}
