package task11;

public class ExeArrayOutOfBound {

	public static void main(String[] args) 
                {
		// TODO Auto-generated method stub
		String[] array={"Hari","Ajith","Vijay","Suriya","Kamal"};
		
		for(int i=0;i<=array.length;i++)
		{
			System.out.println(array[i]);
		}

	}

}

OUTPUT:
Hari
Ajith
Vijay
Suriya
Kamal
Exception in thread "main" java.lang.ArrayIndexOutOfBoundsException: Index 5 out of bounds for length 5
	at task11.ExeArrayOutOfBound.main(ExeArrayOutOfBound.java:11)