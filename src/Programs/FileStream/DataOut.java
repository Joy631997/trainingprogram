package Programs.FileStream;

import java.io.DataOutputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class DataOut {
	public static void main(String[] args) throws IOException {
		FileOutputStream fs = new FileOutputStream("C:\\Users\\Admin\\Documents\\tes.txt");
		DataOutputStream ds = new DataOutputStream(fs);

		String s = "teleapps";
		ds.write(s.getBytes());
		ds.writeInt(65);

		ds.close();
		fs.close();

	}
}
