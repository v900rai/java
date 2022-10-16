package NumberProgram;

public class oddNumber 
{
	public static void main(String[] args) 
	{
		int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
		System.out.println(" Enter the number");
		for(int i=0; i<=arr.length; i++)
		{
			if(arr[i]%2!=0)
			{
				System.out.println("odd number"  +arr[i]);
			}
		}
		
	}

}
