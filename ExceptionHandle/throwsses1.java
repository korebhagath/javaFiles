package ExceptionHandle;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class throwsses1 {
	public static void fileReader() throws FileNotFoundException,IOException {
		FileInputStream fStream = new FileInputStream ("data.txt");
		int k = 0;
		
			while ((k = fStream.read())!=-1) {
				System.out.print ((char)k);
			}
		fStream.close();
		
	}

	public static void main(String[] args) {
		System.out.println ("\n start");
		try {
			fileReader ();
		} catch   (FileNotFoundException fa) {
			
		}catch (IOException a) {
			
		}
		System.out.println ("\n end");

	}

}
