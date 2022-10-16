package NumberProgram;

public class LargestNumber
{
	public static void main(String[] args)
	{
		int a=22;
		int b=55;
		int c=88;
		if(a>b && a>=c)
			System.out.println(a+"the largest number");
		else if(b>=a && b>=c)
			System.out.println(b+"the largest number");
		else
			System.out.println(c+"the largest number");
	}

}
