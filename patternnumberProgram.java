package NumberProgram;
import java.util.Scanner;

public class patternnumberProgram 
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
	    int number=sc.nextInt();
	    System.out.println("Enter the number");
	    for(int i=1; i<=number; i++)
	    {
	        for(int j=1; j<=i; j++)
	        {
	            System.out.print(j);
	        }
	    }   System.out.println();
	}

}
