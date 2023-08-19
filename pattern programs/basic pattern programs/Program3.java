package Basic_Pattern_Programs;

import java.util.Scanner;

public class Program3 
{

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
		Scanner scan=new Scanner(System.in);
		System.out.println("enter n valve");
		int i =scan.nextInt();
		System.out.println("what has to be printed");
		char ch=scan.next().charAt(0);
		//with for loop
		
		/*
		for(int n=1;n<=i;n++)
		{
			for(int j=1;j<=i;j++)
			{
				System.out.print(ch);
			}
			System.out.println();
		}
		*/
		
		//with while loop
		
				/*
				int n=1;
			
				while(n<=i)
				{
					 int j=1;
					while(j<=i)
					{
					System.out.print(ch);
					j++;
					}
			
				System.out.println();
				n++;
				}
				*/
		
		int j=1;
		do
		   {
				int n=1;
				do
				{
					System.out.print(ch);
					n++;
				}
				while(n<=i);
				System.out.println();
				j++;
			}
			
			while(j<=i);
		}
		
		
		
		
		
	}

