package NumberProgram;
public class allSumOddEven 
{
	public static void main(String[] args) 
	{
	
	int[] arr=new int[] {1,2,3,4,5,6,7,8,9};
	int od=oddnumber(arr);
	System.out.println("odd number print only"+od);
	int even=evennumber(arr);
	System.out.println("Even number print only "+even);
	sumOfOddandEvenNumber(arr);
}
 
    public static int oddnumber(int[] arr2)
    {
    
      System.out.println(" Enter the number");
      for(int i=0; i<=arr2.length-1; i++)
    {
	    if(arr2[i]%2!=0)
	{
		System.out.println("odd number"  +arr2[i]);
	}
    }
	return 0;
	
}
    public static int evennumber(int[] arr3)
    {
    
      System.out.println(" Enter the number");
      for(int i=0; i<=arr3.length-1; i++)
    {
	    if(arr3[i]%2==0)
	{
		System.out.println("Ente the even  number"  +arr3[i]);
	}
    }
	return 0;
    
}
    public static void sumOfOddandEvenNumber(int[] arr4)
    {
    
      System.out.println(" Enter the number");
      int sum=0;
      for(int i=0; i<=arr4.length-1; i++)
    {
    	  sum=sum+arr4[i];
    }
      System.out.println("sum of all values"+sum);
    }
    
}
