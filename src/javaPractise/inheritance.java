package javaPractise;

public class inheritance {
	
	int age = 10;
	String name="Jai";
	
	public static void main(String[] args)
	{
		inheritance obj = new concept();
		concept obj1 = new concept();
		inheritance obj2 = new inheritance();

		
		System.out.println(" i am child's data being accessed by object " + obj.age + " " + obj.name );
		System.out.println(" i am parents data being accessed by object " + obj1.age + " " + obj1.name );
		System.out.println(" child's method  " + obj.func1() );
		System.out.println(" parents method  " + obj1.func1() );
		System.out.println(" parents method  " + obj2.func1() );
		 obj.func2("gk");
		 obj1.func2("gk");
		 
	// obj.func3("gk");


		
	}
	public int func1()
	{
		return 20;
	}
	public void func2(String Name)
	{
		name=Name;
		System.out.println("Parent function");
	}
}

class concept extends inheritance
{
	int age1 = 30;
	String name="veeru";
	public void func3()
	{
		System.out.println("i am child function " + age + " " + name);
		
	}
	public int func1()
	{
		System.out.println("i am child function overriidden " + age + " " + name);
		return 30;
		
	}
	
}
