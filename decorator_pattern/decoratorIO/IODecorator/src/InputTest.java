import inputstream.LowerCaseInputStream;

import java.io.BufferedInputStream;
import java.io.FileInputStream;
import java.io.IOException;
import java.io.InputStream;


public class InputTest {

	public InputTest() {
		// TODO Auto-generated constructor stub
	}

	/**
	 * @param args
	 */
	public static void main(String[] args) throws IOException {
		int c;
		
		try {
			InputStream in =
					new LowerCaseInputStream(
							new BufferedInputStream(
									new FileInputStream("/home/michael/Documents/Head First/decorator_pattern/decoratorIO/IODecorator/src/test.txt")));
			
			while((c = in.read()) >= 0) {
				System.out.print((char) c);
			}
			
			in.close();
		} catch (IOException e) {
			e.printStackTrace();
		}

	}

}