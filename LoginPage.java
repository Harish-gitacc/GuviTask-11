package task11;

import java.util.Scanner;

public class LoginPage {
	 private static final String CorrectPswd="Haribk789";

	    public static void main(String[] args)
                {
	        Scanner scanner = new Scanner(System.in);

	        System.out.print("Enter your password:");
	        String enteredPassword = scanner.nextLine();

	        if (enteredPassword.equals(CorrectPswd))
                {
	            System.out.println("Login successful!");
	        } 
                else 
                {
	            System.out.println("Incorrect password entered. Please try again.");
	        }

	}
}

OUTPUT:
Enter your password: Haribk789
Login successful!

Enter your password: gdjhgh512
Incorrect password entered. Please try again.

