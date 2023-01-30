package ExceptionHandle;

import java.util.Arrays;
import java.util.Scanner;

public class HandlingMulipleException {

	public static void main(String[] args) {
		// arithmeticException
		System.out.println ("start");
	try {	
		int a =10;
		int b =0;
		int result = a/b;
		System.out.println ("result" + result);
	
	int marks [] = {15,45,53};
	
	marks[0]= 35;
	marks[1]= 45;
	marks[2]= 56;
	
	System.out.println (Arrays.toString(marks) );
	
	//Scanner sc = new Scanner (System.in);
	//String name = sc.next();
	//System.out.println (name);
	String name = null;
	System.out.println ( name.length());
	
	Scanner sc  = new Scanner (System.in);
	int number = sc.nextInt();
	System.out.println (number);
} catch (  ArrayIndexOutOfBoundsException aan) {
		
	}

	System.out.println ("end");
		

	}

}
