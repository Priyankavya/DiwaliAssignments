package Practice;

import java.util.Scanner;

public class GenerateNPrime {

	private static boolean isPrime(int num) {
		if(num<2)
			return false;
		int count=0;
		
		for(int i=1;i<=num;i++)
		{
			if(num%i==0)
			
				count++;
			
			
		}
		
		return count==2;
		
	
		
		
	}

	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter limit n");
		int n=s.nextInt();
		
		System.out.println(" prime numbers upto "+n+"are :");
		{
			for(int i=2;i<=n;i++)
			{
				if(isPrime(i))
				System.out.println(i+" ");
			}
		}
		
		

	}

	
}
