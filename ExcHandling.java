package task11;

import java.util.Scanner;

public class ExcHandling 
{
	    public static void main(String[] args) 
	    {
	        Scanner sc=new Scanner(System.in);
	        
	        System.out.print("Enter the first integer:");
	        int num1=sc.nextInt();
	        
	        System.out.print("Enter the second integer:");
	        int num2=sc.nextInt();
	        
	        try {
	            System.out.println(num1/num2); 
	        }
	        catch (ArithmeticException e) 
	        {
	           
	            System.out.println("Divided by zero operation is not possible");
	        }
	}
}



OUTPUT:
Enter the first integer: 10
Enter the second integer: 0
Divided by zero operation is not possible
