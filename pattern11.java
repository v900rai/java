package NumberProgram;

public class pattern11 
{
	public static void main(String []args)
	{
		for(int i=1; i<=6; i++) // rows
		{
			for(int j=6; j>=i; j--)
			{
				System.out.print("*");
			}
			System.out.println();
		
		}
	}
}
