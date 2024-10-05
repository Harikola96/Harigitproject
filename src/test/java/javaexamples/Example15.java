package javaexamples;

import java.util.Scanner;

public class Example15 {
	public static void main(String[] args) {
		// Take a number from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		long x = sc.nextLong();
		sc.close();
		int y = 0;
		long temp = x;
		while (temp != 0) {
			int r = (int) (temp % 10);
			y = y * 10 + r;
			temp = temp / 10;
		}
		System.out.println(y);
		if (x == y) {
			System.out.println(x + "is palindrome");
		} else {
			System.out.println(x + "is not palindrome");
		}

	}
}
