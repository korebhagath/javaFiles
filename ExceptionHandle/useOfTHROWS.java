package ExceptionHandle;

public class useOfTHROWS {
	int age;
	static public void validateVote(int age)throws ArithmeticException  {
		
		if (age < 18) {
		throw new ArithmeticException();	
		
		}else {
			System.out.println ("eligible to vote");
		}
		
			
		}
	

	public static void main(String[] args){
		System.out.println ("start");
		int age = 15;
		
		try {
			validateVote(age);
		} catch (ArithmeticException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		System.out.println ("end");

	}

}
