package task11;

import java.util.Scanner;

public class StringOutBound {

	public static void main(String[] args) 
	{
		// TODO Auto-generated method stub
       Scanner sc = new Scanner(System.in);
       
       System.out.println("Enter the string:");
       String str=sc.next();
       
       try {

    	      System.out.println("Char:"+ str.charAt(str.length()));
    	    } 
       catch (StringIndexOutOfBoundsException e)
       {
    	      System.out.println("Exception:"+ e);
    	    }
}
}

OUTPUT:
Enter the string :
I am going to run
Exception: java.lang.StringIndexOutOfBoundsException: Index 1 out of bounds for length 1