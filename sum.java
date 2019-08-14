import java.util.*;
import java.lang.*;
import java.io.*;

/* Name of the class has to be "Main" only if the class is public. */
class sum
{
	public static void main (String[] args) throws java.lang.Exception
	{
		// your code goes here
		int n,sum=0;
		Scanner s=new Scanner(System.in);
		n=s.nextInt();
		System.out.println("Enter the value for n");		
		sum=n*(n+1)/2;
		System.out.println("The sum is" + sum);
	}
 }
