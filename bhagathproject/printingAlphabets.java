package bhagathproject;

public class printingAlphabets {

	public static void main(String[] args) {
		char c = 'a',x='a';
		for (int i =1; i <=5; i ++) {
			for (int j =1; j <=i ; j ++) {
				c = x++;
				System.out.print(c+(char)(c) );
			}
			System.out.println ();
		}

	}

}
