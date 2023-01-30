package ExceptionHandle;

import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

public class finallyex {

	public static void main(String[] args) {
		FileReader freader = null;
		FileWriter fwriter = null;
		
		try {
			 freader = new FileReader ("data.txt");
			 fwriter = new FileWriter ("target.txt");
			
			int k = 0;
			StringBuilder sb = new StringBuilder (" ");
			while ((k = freader.read()) != -1) {
				sb.append((char)k);
				fwriter.write(sb.toString()); 
			}
		} catch (FileNotFoundException e) {
			
		} catch (IOException e) {
			
		}
		finally {
			
			try {
				if (freader != null)
					freader.close();
				if (fwriter != null)
					fwriter.close();
			} catch (IOException e) {
				System.out.println (e.getMessage());
			}
		}
		
		
	}
	

	}


