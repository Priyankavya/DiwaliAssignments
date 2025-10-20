package Practice;

import java.util.Scanner;

public class CheckPrime {

	public static void checkprime( int n)
	{
		if(n%2==0 && n!=2 || n==1||n==0)
		{
			System.out.println(n+" true");
		}
		else
		{
			System.out.println(n+" false ");
		}
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter a number:");
		int n=s.nextInt();
		checkprime(n);
		
	}

}
