package demo.String;

public class stringsSpecialization {
	
	//String name = "bhagath"; // this is one speciality instaead of String name = new String ("bhagath")
   // String name1 = new String ("bhagath");
	
	
	
	public static void main(String[] args) {
		String firstName = "kore";
		// 2nd speciality is strings can be ovverload with + operator
		String FullName = firstName + " " + "bhagath";
		System.out.println (FullName);

	}

}
