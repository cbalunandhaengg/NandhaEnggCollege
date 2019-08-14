import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class evenorodd
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int number;
		Scanner s=new Scanner(System.in);
		System.out.println("Enter the number");
		number=s.nextInt();
		if(number>=0)
		{
			if((number%2)==0))
			{
				System.out.println("Even");
			}
			else
			{
				System.out.println("Odd");
			}
		}
		else
		{
			System.out.println("Invalid");
		}		
	}
}
