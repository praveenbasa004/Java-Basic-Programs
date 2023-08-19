package Factorial;

public class FactorialOfGivenNumber 
{
	public static void factorial(int a)
	{
		int fact=1;
		for(int i=1;i<=a;i++)
		{
			fact=fact*i;
		}
		System.out.println("factorial of " + a + " is " + fact);
	}
	

}
