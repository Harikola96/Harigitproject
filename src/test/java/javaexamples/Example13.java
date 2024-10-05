package javaexamples;

import java.util.Scanner;

public class Example13 {
	public static void main(String[] args) {
		// Take a number from keyboard
	Scanner sc=new Scanner(System.in);
	System.out.println("Enter a number");
	long n=sc.nextLong();
	sc.close();
	int sum=0;
	long temp=n;
	while(temp!=0)
	{
		int r=(int)(temp%10);
		sum=sum+r;
		temp=temp/10;
	}
	System.out.printf("%d is sum is %d",n,sum);
	}
}
