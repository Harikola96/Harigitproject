package javaexamples;

import java.util.Scanner;

public class Example11
{
	public static void main(String[] args)
	{
		//Take a number from keyboard
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter limit");
		int n=sc.nextInt();
		sc.close();
		//form the Fibonacci sequence(0, 1, 1, 2, 3, 5, 8, 13, 21, ....etc)
		int x=0;
		int y=1;
		System.out.printf("%d %d",x,y);
		do
		{
			int z=x+y;
			System.out.printf(" %d",z);
			x=y;
			y=z;
		}while((x+y)<=n);
	}
}







