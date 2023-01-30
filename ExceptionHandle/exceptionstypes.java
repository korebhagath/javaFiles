package ExceptionHandle;

import java.util.Arrays;
import java.util.Scanner;

public class exceptionstypes {

	public static void main(String[] args) {
		// arithmeticException
		System.out.println ("start");
	try {	
		int a =10;
		int b =0;
		int result = a/b;
		System.out.println ("result" + result);
	} catch (ArithmeticException a) {
		
	}
	int marks [] = {15,45,53};
	try {
	marks[0]= 35;
	marks[1]= 45;
	marks[2]= 56;
	}catch (ArrayIndexOutOfBoundsException arob) {
		
	}
	System.out.println (Arrays.toString(marks) );
	
	//Scanner sc = new Scanner (System.in);
	//String name = sc.next();
	//System.out.println (name);
	String name = null;
	int length = name.length();

	System.out.println ("end");
		

	}

}
