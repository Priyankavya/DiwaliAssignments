package Practice;

import java.util.Scanner;

public class FibonaciSeries {
	public static void FibonciSeries(int num)
	{
		int n1=0;
		int n2=1;
		
		System.out.print(" fbonci Series is "+n1+" "+n2);
	
		for(int i=1;i<num;i++)
		{
			int n3=n1+n2;
			n1=n2;
			n2=n3;
            
			System.out.print(" "+n3);
		}
	}

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner s=new Scanner(System.in);
		System.out.println(" enter limit n");
		int n=s.nextInt();
		FibonciSeries(n);

	}

}
