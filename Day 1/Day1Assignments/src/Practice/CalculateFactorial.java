package Practice;

import java.util.Scanner;

public class CalculateFactorial {
	
	public static void Factorial(int n)
	{
		
		int fact=1;
		if(n==0 || n==1)
		{
			System.out.println(" factorial of "+n+" is  "+fact);
		}
		else
		{
			for(int i=1;i<=n;i++)
			{
				fact=fact*i;
			}
			
			System.out.println(" factorial of "+n+" is "+fact);
		}
	}

	public static void main(String[] args) {
	Scanner s=new Scanner(System.in);
	System.out.println("enter number to find factorisl:");
	int n=s.nextInt();
	
	Factorial(n);
	}

}
