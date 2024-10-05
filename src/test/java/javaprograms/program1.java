package javaprograms;

import java.util.Scanner;

public class program1 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		System.out.println("Enter a number");
		int x=sc.nextInt();
		sc.close();
		if(x%2==0)
		{
			System.out.printf("%d ia an even number", x);
		}
		else
		{
			System.out.printf("%d is an odd number", x);
		}
	}

}
