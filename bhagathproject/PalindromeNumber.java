package bhagathproject;

import java.util.Scanner;

public class PalindromeNumber {

	public static void main(String[] args) {
		Scanner sr = new Scanner (System.in);
		System.out.println ("enter the number");
		int n = sr.nextInt();
		int reverse =0,lastNumber=0;
		while (n>0) {
			lastNumber = n%10;
			reverse = reverse *10 + lastNumber;
			n= n/10;
			
			
		}if (reverse == n) {
			System.out.println ("number is a palindrome ");
			
	}else {
		System.out.println("number is revese "+ reverse);
	}

	}

}
