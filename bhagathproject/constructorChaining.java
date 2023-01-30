package bhagathproject;
//constructor chaining enables us to call one constructor to another constructor in the class with respect to current class object
//we can use this keyword to perform construcctor chaining in the same class

public class constructorChaining {
	int id ;
	int age;
	String name;
	constructorChaining (int id){
		this.id=id;
		System.out.println ("1st");
	}
	constructorChaining (int id ,int age){
		this(id);
		this.age = age;
		System.out.println ("2nd");
	}
	constructorChaining (int id ,int age,String name){
		
		this(age,id);
		this.name = name;
		System.out.println ("3rd");
	}
	void display () {
		System.out.println ("id is :"+id + "age is :" + age + " name is :" + name);
	}

	public static void main(String[] args) {
		constructorChaining cc = new constructorChaining(201,25,"bhagath");
		cc.display();

	}

}
