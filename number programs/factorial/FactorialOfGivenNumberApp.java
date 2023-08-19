package Factorial;

import java.util.Scanner;

public class FactorialOfGivenNumberApp 
{

	public static void main(String[] args) 
	{
		Scanner scan =new Scanner(System.in);
		System.out.println("enter a valve which you want factorial");
		int a =scan.nextInt();
		FactorialOfGivenNumber.factorial(a);
				
	}

}
