package Assignment;

import java.util.Scanner;

public class MultiplicationTable {

	public static void MultTable(int n)
	{
		System.out.println(" Multiplication table of "+n);
		for(int i=1;i<=10;i++)
		{
			System.out.println(n+"*"+i+"="+n*i);
		}
		
	}
	public static void main(String[] args) {
     
      Scanner s=new Scanner(System.in);
		
		System.out.println(" enter number:");
		int n=s.nextInt();
		MultTable(n);

	}

}
