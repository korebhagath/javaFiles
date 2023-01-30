package bhagathproject;

public class printStarAgain {

	public static void main(String[] args) {
		// decreasing space triangle increasing *
//		for (int i =1; i <=5; i ++) {
//			for (int j =i ; j <=5; j ++) {
//				System.out.print("  ");
//				
//			}
//			for (int j =1; j <i; j ++) {
//				System.out.print("* ");
//			}
//			for (int j =1 ; j <= i;j ++) {
//				System.out.print("* ");
//			}
//			System.out.println ();
//		}
		
	//	inceasing triangle space and decreasing triangle star
		
		for (int i = 1; i <= 5; i ++) {
			for (int j =1; j <=i ; j ++) {
				System.out.print("  ");
				
			}
			for (int j =i ;j <5 ; j ++) {
				System.out.print("* ");
			}
			for  (int j =i ; j <=5; j ++) {
				System.out.print("* ");
			}
			System.out.println ();
			
		}

	}

}
