package bhagathproject;

public class test {
//	test (int a,byte b){
//		System.out.println ("a = "+ a + " " + "b" + b);
//		
//	}
//	test (int a,double b){
//		System.out.println ("a = "+ a + " " + "b" + b);
//		System.out.println ("second constructor");
//	}

	public static void main(String[] args) {
//		test t = new test (10,129);
		
//		float f = 13e2f;
//		double d = 54e4;
//		System.out.println (f + "," + d);
//		char myvar = 65;
//		char v1 = 65;
//		char v2 = 66;
//		System.out.println (myvar  + "" + "" +  v1 + "" + v2);
		double d = 99.16; // this is narrow casting big data type convert to smaller data type its mannual
		int n = (int)d;
		System.out.println (n);
		
		//widening casting  smaller data type convert into large data type its automatically
		
		int myn = 98;
		double mynn = myn;
		

	}

}
