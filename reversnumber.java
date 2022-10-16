package NumberProgram;

public class reversnumber 
{
	public static void main(String[] args)
	{
		int number =98765;
		int revers=0;
		while(number!=0)
		{
			int remainder=number%10;
			revers=revers*10+remainder;
			number=number/10;
		}
		System.out.println("Enetr the revers number" +revers);
		
	}

}
