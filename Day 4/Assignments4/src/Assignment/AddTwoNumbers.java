package Assignment;

import java.util.Scanner;

public class AddTwoNumbers {

	public static int AddNumbers(int x,int y)
	{
		int sum=0;
		
		sum=x+y;
		return sum;
	}
	public static void main(String args[])
	{
		Scanner s=new Scanner(System.in);
		
		System.out.println(" enter a:");
		int a=s.nextInt();
		
		System.out.println(" enter b:");
		int b=s.nextInt();
		
		
		System.out.println(" sum of a and b = "+AddNumbers(a, b));
	}
}
