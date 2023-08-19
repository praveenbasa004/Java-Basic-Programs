package Basic_Pattern_Programs;

import java.util.Scanner;

public class Program2 
{

	public static void main(String[] args) 
	{
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n valve");
		int i =scan.nextInt();
		System.out.println("what has to be printed");
		char ch=scan.next().charAt(0);
		/*
		for(int n=1;n<=i;n++)
		{
			System.out.println(ch);
		}
		
		int n=1;
		while(n<=i)
		{
			System.out.println(ch);
			n++;
		
		}
		*/
		
		int n=1;
		do
		{
			System.out.println(ch);
			n++;
		}
		while(n<=i);
	}

}
