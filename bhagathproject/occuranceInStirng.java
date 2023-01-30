package bhagathproject;

public class occuranceInStirng {

	public static void main(String[] args) {
		String s = "java programming language";
		int total_length = s.length();
		int after_remove = s.replace("a", "").length();
		int count = total_length -after_remove;
		System.out.println (count);

	}

}
