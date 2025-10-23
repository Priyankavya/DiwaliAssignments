package Practice2;

import java.util.Scanner;

public class SumofNEven {

	public static int SumofNEven(int num)
	{
		int sum=0;
		
		for(int i=0;i<=num;i++)
		{
			if(i%2==0)
				sum=sum+i;
		}
		return sum;
		
	}
	public static void main(String[] args) {
		Scanner s=new Scanner(System.in);
		System.out.println(" enter value of n");
		int n=s.nextInt();
		 System.out.println("sum of first n even numbers is  "+SumofNEven(n));
		

	}

}
