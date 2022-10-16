package NumberProgram;

public class AllSubSet 
{
	public static void main(String[] args)
	{
		String str="cat";
		int len=str.length();
		System.out.println("length of string" +len);
		int temp=0;
		System.out.println("size of array"+len*(len+1)/2);
		
		String arr[]=new String[len*(len+1)/2];
		for(int i=0; i<len; i++) {
			for(int j=i; j<len; j++) {
				arr[temp]=str.substring(i, j+1);
				temp++;
				
			}
			
		}
		System.out.println("All subset given string");
		System.out.println();
		for(int i=0; i<arr.length; i++)
		{
			System.out.println(arr[i]);
			
		}
	}

}
