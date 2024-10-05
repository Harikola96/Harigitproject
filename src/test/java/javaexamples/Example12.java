package javaexamples;

import java.util.Scanner;

public class Example12 {
	public static void main(String[] args) {
		// Take a number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long n = sc.nextLong();
		sc.close();
		int count = 0;
		long temp = n;
		while (temp != 0) {
			temp = temp / 10;
			count++;
		}
		System.out.printf("%d has a count is %d", n, count);
	}
}
