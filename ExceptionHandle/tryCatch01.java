package ExceptionHandle;

public class tryCatch01 {
	int age;
	static public void validateVote(int age) {
		
		if (age < 18) {
			
		
		}else {
			System.out.println ("eligible to vote");
		}
		
			
		}
	

	public static void main(String[] args) {
		System.out.println ("start");
		int age = 15;
		validateVote(age);
		System.out.println ("end");

	}

}
