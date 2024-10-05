package javaexamples;

import java.util.Scanner;

public class Example10 {
	public static void main(String[] args) {
		// Take limits from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		int f = 1;
		for (int i = n; i >= 1; i--) {
			f = f * i;
		}
System.out.printf("%d factorial is %d",n,f);
	}
}
