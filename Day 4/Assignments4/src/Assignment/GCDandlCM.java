package Assignment;

import java.util.Scanner;

public class GCDandlCM {

	
	    public static int findGCD(int a, int b) {
	        while (b != 0) {
	            int temp = b;
	            b = a % b;
	            a = temp;
	        }
	        return a;
	    }

	    public static int findLCM(int a, int b) {
	        return (a * b) / findGCD(a, b);
	    }

	    public static void main(String[] args) {
	    	Scanner s=new Scanner(System.in);
	    	System.out.println(" enter a:");
	        int a = s.nextInt();
	        System.out.println(" enter b:");
	        int b = s.nextInt();

	        int gcd = findGCD(a, b);
	        int lcm = findLCM(a, b);

	        System.out.println("GCD: " + gcd);
	        System.out.println("LCM: " + lcm);
	    }

}
