package javaPractise;

public class ReplaceString {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		String str= "Hi i am Selenium . Selenium is used for web browser automation. Selenium cannot be used for desktop based app. Selenium";
		String replace="Selenium";
		String replaceWith="java";
		
		String[] asp = str.split(replace);
		
		System.out.println("Here is the string after split ");
		for(int i=0 ; i < asp.length ; i++)
		{
			System.out.println(asp[i]);
		}
		
		StringBuffer newS = new StringBuffer();
		for(int i=0 ; i < asp.length ; i++)
		{
			newS.append(asp[i]);
			
			if(i!=asp.length-1)
			{
				newS.append(replaceWith);
			}
		}
		
		System.out.println("Here is the string after replacement");
		System.out.println(newS);
		

	}

}
