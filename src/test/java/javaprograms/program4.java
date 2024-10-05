package javaprograms;

import java.util.Scanner;

public class program4 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a llimit");
		long llimit=sc.nextLong();
		System.out.println("Enter a ulimit");
		long ulimit=sc.nextLong();
		sc.close();
		for(long x=llimit;x<=ulimit;x++)
		{
			System.out.println("table for "+x);
			System.out.println("-------------");
			for(int i=1;i<=10;i++)
			{
				System.out.printf("%dX%d=%d%n",x,i,x*i);
			}
			System.out.println("-------------");
		}
	}

}
