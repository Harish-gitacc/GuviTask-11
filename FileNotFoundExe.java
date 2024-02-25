package task11;

import java.io.File;
import java.io.FileNotFoundException;
import java.util.Scanner;

public class FileNotFoundExe 
{
	public static void main(String[] args)
	{
        Scanner scanner=new Scanner(System.in);

        System.out.print("Enter the file path: ");
        String filePath=scanner.nextLine();
        try 
        {
            readFile(filePath);
        }
        catch (FileNotFoundException e)
        {
            System.out.println("Error:File not found"+e.getMessage());
        } 
        finally 
        {
           System.out.println();
        }
    }

    private static void readFile(String filePath) throws FileNotFoundException 
    {
        File file=new File(filePath);

        if (!file.exists())
        {
            throw new FileNotFoundException("The file does not found");
        }
        Scanner fileScanner = new Scanner(file);
        while (fileScanner.hasNextLine())
        {
            String data = fileScanner.nextLine();
            System.out.println(data);
        }
    }
}


OUTPUT:
Enter the file path: Guvi.txt
Error:File not found
