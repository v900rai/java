package NumberProgram;

import java.util.*;

public class evenoddDiff 
{
	public static void main(String[] args) 
	{
		int temp=0 ,sum = 0,sum1=0,sum2 = 0;
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		int arr[]=new int[size];
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]%2==0)
			{
				sum=sum+arr[i];
			}
			else
			{
				sum1=sum1+arr[i];
			}
			sum2=sum-sum1;
			System.out.println("Result "+sum2);
		}
		
		
	}

}
