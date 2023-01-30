package bhagathproject;

public class reverseNumber {

	public static void main(String[] args) {
		int n = 564;
//				lastNumber=0,reverse=0;
//		while (n>0) {
//			lastNumber = n%10;
//			reverse = reverse*10+lastNumber;
//			n= n/10;
//		}
		
		// using string buffer class
//		StringBuffer rev;
//		StringBuffer bf = new StringBuffer (String.valueOf(n));
//		rev = bf.reverse();
//		System.out.println ("revere number is "+ rev );
		
//		StringBuilder sb = new StringBuilder();
//		StringBuilder rev ;
//		rev = sb.append(n);
		
		StringBuffer rev;
		StringBuffer sb = new StringBuffer (String.valueOf(n));
		rev = sb.reverse();
		//rev = sb.append(n);
		
		System.out.println ("revere number is "+ rev );

	}

}
