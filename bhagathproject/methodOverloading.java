package bhagathproject;

public class methodOverloading {
	public static int add (int a,int b) {
		int result = a+b;
		return result;
		
	}
	public static  double add (int a,int b) { // this is a duplicate method
		double result = a+b;
		return result;
		
	}
	void sum (int a ,int b) {
		System.out.println ("integr method");
	}
	void sum (byte a ,byte b) {
		System.out.println ("byte method");
	}

	public static void main(String[] args) {
			methodOverloading mol = new methodOverloading ();
		System.out.println (mol.add(10, 10));
		System.out.println (methodOverloading.add(10, 10));
		
		mol.sum(40, 010);
		

	}
	

}
