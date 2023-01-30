package bhagathproject;

import java.util.Scanner;

public class countingString {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println ("enter name");
		String name = sc.nextLine();
		int count = 0;
		for (int i = 0; i <= name.length()-1;i ++) {
			//for (int j = 0; j <= name.length()-1; j ++) {
				count ++;
		//	}
	//	System.out.println (count);
			
		}
		System.out.println (count);

	}

}
