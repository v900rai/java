package NumberProgram;
import java.util.Arrays;
import java.util.Scanner;
public class AsscindingOrderInArray 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		int size=sc.nextInt();
		System.out.println("Enter the number");
		int arr[]=new int [size];
		int temp=0, j=0; 
		for(int i=0; i<arr.length; i++)
		{
			arr[i]=sc.nextInt();	
		}
		for(int i=0; i<arr.length; i++)
		{
			if(arr[i]>arr[i+1])
				{
					temp=arr[i];
					arr[i]=arr[j];
					arr[j]=temp;
				}
		}
		System.out.println("ascending order");
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]+" ");
		}	
	}
}
