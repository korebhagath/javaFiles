package bhagathproject;
class person {
	int id;
	String name ;
	String college;
	public person(int id, String name, String college) {
	
		this.id = id;
		this.name = name;
		this.college = college;
	}
}
class student  extends  person {
	String address ;
	student (int id,String name,String college,String address){
		super (id,name,college);
		this.address = address ;
		
	}
}

public class copyConsUseSuper {
	

	public static void main(String[] args) {
		student st = new student (201,"peppu","mits0","hyd");
		System.out.println (st.id + " name is ;" + st.name + "college is ;" +st.college + "address is ;" + st.address );

	}

}
