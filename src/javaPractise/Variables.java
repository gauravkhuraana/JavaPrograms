package javaPractise;

public class Variables {
	static String string;
	String instance="acha ji" ;
	
	public static void stat()
	{
		String iamlocal="i am local";
		System.out.println(" i am static and can be called with or without class name " + iamlocal +string  );
		Variables v1 = new Variables();
		System.out.println("i m instance i can be accessed via object " + v1.instance);
	}
	public void local()
	{
		String iamlocal="i am local";
		System.out.println(" You need to call my function to acces me " + iamlocal );
	}
	public static void main(String[] args)
	{
		Variables v = new Variables();
		System.out.println("i m static i can be accessed via class dont need object " + Variables.string);
		System.out.println("i m instance i can be accessed via object " + v.instance);
		 v.local();
		 stat();
		
		
	}

}
