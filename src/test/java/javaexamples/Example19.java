package javaexamples;

import java.util.Scanner;

public class Example19
{
	public static void main(String[] args)
	{
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	int n=sc.nextInt();
	sc.close();
	int temp=n;
	String binary="";
	while(temp!=0);
	{
		int r=(int)(temp%2);
		binary=r+binary;
		temp=temp/2;
	}
	System.out.println(binary);
	}
}








