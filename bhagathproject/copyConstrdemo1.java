package bhagathproject;

public class copyConstrdemo1 {
	int id ,passed_out;
	String name,college;
	copyConstrdemo1 (int id ){
		this.id = id;
	}
	copyConstrdemo1 (copyConstrdemo1 s,String name){
		id = s.id;
		this.name = name;
	}
	copyConstrdemo1 (copyConstrdemo1 d,String college,int passed_out){
		id = d.id;
		name = d.name;
		this.college= college;
		this.passed_out= passed_out;
	}

	public static void main(String[] args) {
		copyConstrdemo1 cc = new copyConstrdemo1 (201);
		copyConstrdemo1 cc1 = new copyConstrdemo1 (cc,"bhagath");
		copyConstrdemo1 cc2 = new copyConstrdemo1 (cc1,"mits",2017); // if cc1 = 202 but out put is 201 only value not change
		cc2.id = 202;
		System.out.println (cc2.id + " "+ cc2.name + " " + cc2.college + " " + cc2.passed_out);

	}

}
