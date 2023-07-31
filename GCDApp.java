package GCD;

import java.util.Scanner;

public class GCDApp 
{

	public static void main(String[] args) 
	{
		Scanner scan = new Scanner(System.in);
		System.out.println("enter two numbers");
		int a =scan.nextInt();
		int b =scan.nextInt();
		
		GCD.gcd(a, b);

	}

}
