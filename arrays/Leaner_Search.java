package SingleDimensionalArrays;

import java.util.Scanner;

public class Leaner_Search 
{

	public static void main(String[] args) 
	{
		//creating array 
		Scanner scan = new Scanner (System.in);
		System.out.println("enter arrray length");
		int arrlength = scan.nextInt();
		System.out.println("enter array elements");
		int arr[]=new int[arrlength];
		for(int i =0 ; i<=arr.length-1 ; i++)
		{
			arr[i]=scan.nextInt();
		}
		
		//displaying array
		for(int i=0;i<=arr.length-1 ; i++)
		{
			System.out.print(arr[i]+" ");
		}
		
		
		//taking input to search element
		System.out.print("enter element which you want to search");
		int key = scan.nextInt();
		for(int i=0 ; i<=arr.length-1 ; i++)
		{
			if(key==arr[i])
			{
				System.out.println("element found in " +i);
				return;
			}
			
		}
		System.out.println("element is not foumd");
		
		
		
	}

}
