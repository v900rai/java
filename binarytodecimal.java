package NumberProgram;

import java.util.Scanner;

public class binarytodecimal 
{
	public static void main(String[] args) {
		
		  
			String binaryString="1010";  
			int decimal=Integer.parseInt(binaryString,2);  
			System.out.println(decimal);
			System.out.println(Integer.parseInt("1011",2));  
			System.out.println(Integer.parseInt("10101",2));  
		}
}
