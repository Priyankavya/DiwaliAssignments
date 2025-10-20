package Practice;

import java.util.Scanner;

public class Checkevenodd {

	
	public static void CheckevenOdd(int num)
	{
		if(num%2==0)
		{
			System.out.println(num+" is even.");
		}
		else
		{
			System.out.println(num+" is odd.");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		
		System.out.println(" enter the number :");
		int n=s.nextInt();
		CheckevenOdd(n);

	}

}
