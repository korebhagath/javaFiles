package bhagathproject;

public class consChain {
	
	int id ;
	String name,college;
	

	public consChain(int id) {
		
		this.id = id;
	}
	consChain (int id ,String name){
		this (id);
		this.name = name;
	}
	consChain (int id ,String name, String college){
		this (id,name);
		this.college = college;
	}


	public static void main(String[] args) {
		consChain cc = new consChain (201,"peppu","mits");
		System.out.println (cc.id + " " + cc.name + " " + cc.college);
	}

}
