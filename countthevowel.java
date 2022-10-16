package NumberProgram;

import java.util.Scanner;
public class countthevowel 
{
	public static void main(System[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("enter the string");
		String st=sc.nextLine();
		int vcount=0;
		int azcount=0;
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)=='a' || st.charAt(i)=='e' || st.charAt(i)=='i'|| st.charAt(i)=='o'|| st.charAt(i)=='u')
			{
				vcount++;
			}
		}
		for(int i=0; i<st.length(); i++)
		{
			if(st.charAt(i)>='a' || st.charAt(i)<='z')
			{
				azcount++;
			}
		}
		System.out.println("Number of vowels"+vcount);
		System.out.println("Number of consonent"+azcount);
	}

}
