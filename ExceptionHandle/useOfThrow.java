package ExceptionHandle;

public class useOfThrow {
	int age;
	static public void validateVote(int age) {
		try {
		if (age < 18) {
			throw new ArithmeticException ("\n not eligible to vote");
		
		}else {
			System.out.println ("eligible to vote");
		}
		}catch (ArithmeticException a) {
			System.out.println (a.getMessage());
			throw a;
		}
	}

	public static void main(String[] args) {
		System.out.println ("start");
		int age = 15;
		validateVote(age);
		System.out.println ("end");

	}

}
