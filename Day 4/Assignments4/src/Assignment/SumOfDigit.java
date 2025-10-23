package Assignment;

import java.util.Scanner;

public class SumOfDigit {

	
	public static int SumOfDigitOfNum(int num)
	{
		int n=num;
		int sum=0;
		
		while(n!=0)
		{
			int digit=n%10;
			sum=sum+digit;
			n=n/10;
		}
		return sum;
	}
	public static void main(String[] args) {
		Scanner s= new Scanner(System.in);
		System.out.println(" enter number :");
		int number=s.nextInt();
		
		System.out.println(" Sum of digits of number :"+SumOfDigitOfNum(number));

	}

}
