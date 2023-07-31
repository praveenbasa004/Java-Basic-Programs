package GCD;

public class GCD 
{
	public static void gcd(int a,int b)
	{
		int j=0;
		for(int i=1;i<=b;i++)
		{
			if(a%i==0 && b%i==0)
			{
				j=i;
			}
			
		}
		System.out.println("gcd of " + a + "and" + b);
		System.out.println(j);
		
	}

}
