package NumberProgram;

import java.util.Scanner;

public class checkTheLargestNumber 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the number");
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		
		int max= arr[0];
		for(int i=0;i<arr.length; i++)
		{
			if(arr[i]> max)
			
				max=arr[i];
		}
		System.out.println(max);
		
		
	}

}
