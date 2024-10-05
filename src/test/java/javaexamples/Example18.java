package javaexamples;

import java.util.Scanner;

public class Example18
{
	public static void main(String[] args)
	{
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a binary number");
		int n=sc.nextInt();//1010
		sc.close();
		int placevalue=0;
		int decvalue=0;
		int temp=n;
		while(temp!=0)
		{
			int lastbit=temp%10;
			temp=temp/10;
			decvalue=(int)(decvalue+lastbit*power(2,placevalue));
			placevalue++;
		}
		System.out.println(decvalue);
	}
	public static long power(int base, int exp)
	{
		long output=1;
		for(int i=1;i<=exp;i++)
		{
			output=output*base;
		}
		return output;
	}
}








