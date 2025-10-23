package Challenge;

import java.util.Scanner;

public class Challenge2 {

	public static void ReverseNumber(int n)
	{
		
		int rev=0;
		
		
		while(n!=0)
		{
			
			int digit=+n%10;
			if(digit !=0)
			{
			rev=rev*10+digit;
			
			}
			
			n=n/10;
			
			
			
		}
		System.out.println("Reversed Number is "+rev);
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter value of n");
		int n=s.nextInt();
		ReverseNumber(n);
	}

}
