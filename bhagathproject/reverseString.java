package bhagathproject;

import java.util.Scanner;

public class reverseString {
	// string concontation operation

	public static void main(String[] args) {
		//String name = "bhagath";
		//int length = name.length();
		String reverse="";
//		for (int i=length-1; i >=0; i--) {
//			reverse = reverse + name.charAt(i);
//		}
//		System.out.println (reverse);
//		System.out.println ("------------------");
		
		// using array 
		
//		char a [] = name.toCharArray();
//		int lenght = a.length;
//		
//		for (int i = lenght-1; i >=0; i--) {
//			reverse = reverse + a[i];
//		}
//		System.out.println (reverse);
//		
//		
		String name1 = "bhagath";
		String rev1 = "";
		
		for (int i = name1.length()-1; i >=0; i --) {
			rev1 = rev1+ name1.charAt (i);
		}
		System.out.println (rev1);
		System.out.println ("----------------------------");
		
		
		String name = "bhagath";
		char []a = name.toCharArray();
		String reverse1 = "";
		for (int i = a.length -1; i >=0; i --) {
			reverse1 = reverse1 + a[i];
		}
		System.out.println (reverse1);
		
		Scanner sc = new Scanner (System.in);
		String boby = sc.nextLine();
		String r = "";
		int length = boby.length();
		for (int i = length-1; i >=0; i --) {
			r = r + boby.charAt(i);
		}
		System.out.println (r);
		
	}
}
