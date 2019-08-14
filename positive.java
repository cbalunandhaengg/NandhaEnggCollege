import java.util.*;
import java.lang.*;
import java.io.*;
 
/* Name of the class has to be "Main" only if the class is public. */
class positive
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the Number");
		number=s.nextInt();
		if(number>0)
		{
			System.out.print("POSITIVE");
		}
		else
		{
			System.out.print("NEGATIVE");
		}
	}
}
