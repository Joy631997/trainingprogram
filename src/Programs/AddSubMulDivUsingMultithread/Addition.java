package Programs.AddSubMulDivUsingMultithread;

public class Addition extends Thread {
	public void run() {
		int a = 20, b = 40;
		int c = a + b;
		System.out.println("Addition result is:" + c);
	}

}
