package javaPractise;

public class BiggestDifferenceInAnArray {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		int[] arr = {1,10,3,6,8,50,9,4,3,30};
		
		int len = arr.length;
		int k=arr.length-1;
		int temp;
		int max =0; // lets assume that the array will contain only positive values 
		
		for (int i=0 ; i<len ; i++)
		{
			temp=arr[k];
			
			for(int j=0;j<k; j++)
			{
				if(temp-arr[j]> max)
				{
					max=temp-arr[j];
				}
			}
			k--;
		}
		
		System.out.println(" The difference such that A[X] - A[Y] is maximum where X > Y is "+max);

	}

}
