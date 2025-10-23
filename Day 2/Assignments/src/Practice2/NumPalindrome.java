package Practice2;

import java.util.Scanner;

public class NumPalindrome {

	public static void CheckPalindrome(int num)
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
		
		if(num==rev)
		{
		System.out.println(num +" is palindrome");
		}
		else
		{
			System.out.println(num+" is not palindrome");
		}
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter value of n");
		int n=s.nextInt();
		
	     CheckPalindrome(n);

	}

}
