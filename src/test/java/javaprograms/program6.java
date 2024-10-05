package javaprograms;

import java.util.Scanner;

public class program6 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int n=sc.nextInt();
		sc.close();
		double sum=0;
		for(int i=1;i<=n;i++)
		{
			sum=sum+(double)1/i;
		}
	System.out.println(sum);
	}

}
