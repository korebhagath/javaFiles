package ExceptionHandle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class tryWithResources {

	public static void main(String[] args) {
		try (FileReader freader = new FileReader("data.txt") ;
				FileWriter fwriter = new FileWriter ("target.txt")){
			int k = 0;
			StringBuilder sb = new StringBuilder ("");
			while ((k = freader.read())!=-1) {
				fwriter.write(sb.toString());
			}
			
		}catch (FileNotFoundException fne) {
			
		}catch (IOException e) {
			
		}

	}

}
