package bhagathproject;

public class decreasingStar {

	public static void main(String[] args) {
//		for (int i = 5; i >=0 ; i --) {
//			for (int j = 0; j <=i ; j ++) {
//				System.out.print("* ");
//			}
//			
//			System.out.println (" ");
//		}
//		
		for (int i = 1; i <=5 ;i ++) {
			for (int j =i; j <=5; j++) {
				System.out.print ("  ");
			}
			for (int j =1; j <=i ; j++) {
				System.out.print("* ");
			}
			System.out.println ();
	}
		
		for (int i =1; i<= 5 ;i ++) {
			for (int j =1; j <=i; j ++ ) {
				System.out.print("  ");
			}
			for (int j = i; j<= 5; j++) {
				if (i==1||i==j||j ==5)
				System.out.print("* ");
				else {
					System.out.print("  ");
				}
			}
			System.out.println ();
		}
		
//		for (int i = 1;  i <=5; i ++) {
//			for (int j =1; j <=i ; j ++) {
//				if (j==1||i==5||j ==i) {
//				System.out.print("* ");
//				}else {
//				System.out.print("  ");
//			}
//				
//			}
//			System.out.println();
//		}
		
//		for (int i =1;i <=5;i++) {
//			for (int j =1;j<=i ; j ++) {
//				System.out.print(" ");
//			}  
//			for (int j =i; j<=5; j ++) {
//				System.out.print("* ");
//			}
//		}
//		System.out.println();

	}

}
