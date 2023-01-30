package bhagathproject;


import java.util.Arrays;

public class bubbeSrting {

	public static void main(String[] args) {
		int[] a = {12,15,85,2,1,658};
		int temp =0;
		int n = a.length-1;
		
		for (int i = 0;i<= n-1;i ++) {  // no of passes
			for (int j =0; j<= n-1; j ++) {  //  iterations in each passe
				if (a[j]>a[j+1]) {
				temp = a[j];
				a[j]= a[j+1];
				a[j+1]= temp;
				}
				
			}
			
		}
		
		System.out.print(Arrays .toString(a));

	}

}
