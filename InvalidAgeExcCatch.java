package task11;

import java.util.Scanner;

public class InvalidAgeExcCatch 	
	{
	  public static void main(String[] args)
	  {
		  Scanner sc=new Scanner(System.in);
		  System.out.println("Enter the age:");
		  int age=sc.nextInt();
		  
		  try {
			  if(age<18)
				  
			  {
				  throw new InvalidAgeExc("Your age must be 18 or above");
			  }
			  else
			  {
				  System.out.println("You are Welcome");			 
			  }
			  }
		  catch(InvalidAgeExc e)
		  {
			  System.out.println("Error:"+e.getMessage());
		  }
			  }
	  }
	

OUTPUT:
Enter the age:
15
Error:Your age must be 18 or above

