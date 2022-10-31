package Programs.FileStream;

import java.io.DataInputStream;
import java.io.FileInputStream;
import java.io.IOException;

public class DataIn {
	public static void main(String[] args) throws IOException {
		FileInputStream fs = new FileInputStream("C:\\Users\\Admin\\Documents\\tes.txt");
		DataInputStream ds = new DataInputStream(fs);

		int re = fs.available();

		byte arr[] = new byte[re];

		ds.read(arr);
		for (byte i : arr) {
			char c = (char) i;
			System.out.println(c);
		}

	}
}
