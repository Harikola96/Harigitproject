package javaexamples;

import java.util.Scanner;

public class Example7
{
	public static void main(String[] args)
	{
		//Take limits from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter lower limit");
		long llimit=sc.nextLong();
		System.out.println("Enter upper limit");
		long ulimit=sc.nextLong();
		sc.close();
		//Print all prime numbers under given limit
		int count=0;
		for(long x=llimit;x<=ulimit;x++)
		{
			//Check each "x" value for prime or not in given range of values
		    int flag=0;
		    for(int i=2;i<x;i++) //2 to x-1
		    {
		    	if(x%i==0)
		    	{
		    		flag=1;
		    		break; 
		    	}
		    } //loop will be terminated either "at end" or at "break"
		    if(flag==0)
		    {
		    	System.out.printf("%d is a prime number%n",x);
		    	count++;
		    }
		}
		System.out.printf("Total count of prime numbers in given range is %d",count);
	}
}







