package Practice2;

import java.util.Scanner;

public class NumisArmstrongOrNot {
    public static void ArmStrong(int num)
    {

    		int n=num;
    		int rev=0;
    		int number;
    		
    		while(n!=0)
    		{
    			number=n%10;
    			rev=rev+number*number*number;
    			n=n/10;
    			
    		}
    		if(num==rev)
    		{
    		System.out.println(rev+"  is a armstrong number");
    		}
    		else
    		{
    			System.out.println(rev+" is not armstrong");
    		}
    	}
    	public static void main(String[] args) {
    		Scanner s=new Scanner(System.in);
    		System.out.println(" enter value of n");
    		int n=s.nextInt();
    		ArmStrong(n);
    	}
		
		

	

}
