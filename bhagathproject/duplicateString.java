package bhagathproject;

import java.util.HashSet;

public class duplicateString {
	
	
	
	boolean flag = true;

	public static void main(String[] args) {
		String []names = {"bhagath","java","cl","cl","jl"};
		boolean flag = false;
		for (int i = 0; i<= names.length-1; i ++) {
			for (int j = i +1; j <= names.length-1; j++) {
				if (names[i]==names[j]) {
					System.out.println ("duplicate eemrnt found " + names[i]);
					flag = true;
				}
			}
		}
		if (flag = false) {
			System.out.println ("duplicate element not found");
			
		}
		
		//approach 2
		HashSet <String>langs = new HashSet();
		System.out.println (langs .add("java"));
		System.out.println (langs .add("java"));
		System.out.println (langs .add("python "));
		
				
				}

	}


