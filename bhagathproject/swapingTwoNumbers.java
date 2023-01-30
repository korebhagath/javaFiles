package bhagathproject;

public class swapingTwoNumbers {

	public static void main(String[] args) {
		int a =10, b =20;
		System.out.println ("before swapping "+ a + " " + b);
		
		int c = a;
	
//		a =b;
//		b =c;
//		System.out.println ("after swapping "+ a + " " + b);
		//2nd logic by using add and sub
		
//		a = a+b;
//		b =a -b;
//		a= a-b;
//		System.out.println ("after swapping "+ a + " " + b);
		// 3rd logic by using mul and division
		
		a = a *b;
		b = a/b;
		a = a/b;
		System.out.println ("after swapping "+ a + " " + b);

	}

}
