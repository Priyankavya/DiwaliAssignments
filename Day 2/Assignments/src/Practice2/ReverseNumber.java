package Practice2;

import java.util.Scanner;

public class ReverseNumber {

	public static void ReverseNumber(int num)
	{
		int n=num;
		int rev=0;
		int number;
		
		while(n!=0)
		{
			number=n%10;
			rev=rev*10+number;
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
