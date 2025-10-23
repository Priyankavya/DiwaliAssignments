package Challenge;

public class MissingNumOfArr {

	public static int FindMissing(int arr[])
	{
		int n=arr.length;
		
		int total=n*(n+1)/2;
		int sum=0;
		
		for(int i:arr)
		{
			sum=sum+i;
		}
		
		return total-sum;
	}
	public static void main(String[] args) {
		int arr[]= {0,1,2,3,5};
		
		System.out.println(" Missing term is :"+FindMissing(arr));

	}

}
