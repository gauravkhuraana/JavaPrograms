package javaPractise;

public class trailZero {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		int i = 12055600;
		int count=0;
		int rem=-1;
		while(i>0)
		{
			
			rem=i%10;
			
			if(rem==0)
			{
				count++;
			}
			else
			{
				break;
			}
			i=i/10;
			
		}
		if(rem==-1)
		{
			System.out.println("The number does not have any trailing 0" );
		}
		else
		{
			System.out.println("Total number of trailing 0s are " + count );
		}
	}

}
