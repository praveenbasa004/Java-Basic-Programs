package EvenNumbers;

import java.util.Scanner;

public class EvenNumbersBetween1toNApp {

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n valve");
		int n=scan.nextInt();
		System.out.println("even numbers from 1 to "+n);
		EvenNumbersBetween1toN.even(n);
		

	}

}
