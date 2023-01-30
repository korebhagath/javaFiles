package bhagathproject;

public class clonedemo1 implements Cloneable {
	int id ;
	String name ;
	

	public clonedemo1(int id, String name) {
		
		this.id = id;
		this.name = name;
	}
	public Object clone ()throws CloneNotSupportedException {
		 return super.clone ();
	}


	public static void main(String[] args) {
		clonedemo1 demo = new clonedemo1 (101,"bhagath");
		try {
			clonedemo1 demo1 = (clonedemo1)demo.clone ();
			System.out.println (demo.id + " " + demo.name);
			System.out.println (demo1.id + " " + demo1.name );
		} catch (CloneNotSupportedException e) {
			
		}
		
		

	}

}
