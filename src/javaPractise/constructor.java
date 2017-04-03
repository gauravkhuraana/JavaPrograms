package javaPractise;

public class constructor {

	public static void main(String[] args) {
		
		// TODO Auto-generated method stub
		constructor obj1 = new constructor("Student1");
		//constructor obj2 = new constructor("Student2",27);
		

		
	}
	constructor(String name)
	{
		this("student3",56);
		String Student=name;
		System.out.println("Ok The student name is " + name);
	}
	constructor(String name,int age)
	{
		
		//String Student=name;
		//int age= age;
		System.out.println("Ok The student name is " + name + " The age is "+ age);
	}

}
