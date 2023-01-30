package ExceptionHandle;

public class stacktTace {
	
	public int division (int i) {
	
		System.out.println ("3");
		return 10/i;
	}
	public void divisionBy (int i) {
		System.out.println ("2");
		division (i);
	}
	public void subRoutine () {
		int d = 0;
		System.out.println ("1");
		divisionBy(d);
	}
		
	

	public static void main(String[] args) {
		stacktTace  eh = new stacktTace ();
		eh.subRoutine();

	}

}
