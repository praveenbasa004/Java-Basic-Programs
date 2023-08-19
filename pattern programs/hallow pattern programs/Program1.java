package Hallow_Pattern_Programs;

public class Program1 {

	public static void main(String[] args) 
	{
		for(int i=1;i<=5;i++)
		{
			for(int j=1;j<=5;j++)
			{
				System.out.print(" ");
			}
			for(int k=1;k<=i;k++)
			{
				if( k==1 || i==1 || i==2 || i==5 || (i==3&&k==3) || (i==4 && k==4))
				{
					System.out.print("*");
				}
				else
				{
					System.out.print(" ");
				}
				
			}
			System.out.println();
		}

	}

}
