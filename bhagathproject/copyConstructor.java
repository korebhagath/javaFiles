package bhagathproject;

public class copyConstructor {
	
	int id ;
	String name;
	String college_name;
	int passed_out;
	
	  copyConstructor (int id ,String name){
		this. id =id;
		this.name = name;
	}
	copyConstructor (copyConstructor s,String college_name){
		id = s.id;
		name = s.name;
		
		this.college_name = college_name;
	}
	copyConstructor (copyConstructor d,int passed_out){
		id = d.id;
		name = d.name;
		college_name =d. college_name;
		this.passed_out = passed_out;
	}
	public  static void display () {
		
		System.out.println (id + " " + name + " "+ college_name + " " + passed_out);
	}
	
	

	


	public static void main(String[] args) {
		copyConstructor cc = new copyConstructor (203,"bhagath");
		copyConstructor cc1 = new copyConstructor (cc,"mits");
		copyConstructor cc2 = new copyConstructor (cc1 ,2017);
		cc.display();
		cc1.display();
		cc2.display();
		

	}

}
