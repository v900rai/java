package NumberProgram;

public class stringprogram 
{
	public static void main(String []args)
	{
		String str ="vishal rai";
		char chr[]=str.toCharArray();
		for(int i=str.length()-1; i>=0; i--)
		{
			System.out.print(chr[i]);
			
		}
	}


}



// string str = "3,33,ab,333"
// output = [3,33,333] array convert