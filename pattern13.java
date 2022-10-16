package NumberProgram;

public class pattern13 
{
	public static void main(String []args)
	{
		for(int i=1;i<=5; i++)// rows
		{
			for(int j=1;j<i; j++)//space
			{
				System.out.print(" ");
			}
			for(int k=i; k<=5; k++)//next for loops
			{
				System.out.print("*");
			}
			System.out.println();
		}
	}

}
