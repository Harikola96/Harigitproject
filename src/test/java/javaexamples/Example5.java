package javaexamples;

import java.util.Scanner;

public class Example5 {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("enter a number");
		int x = sc.nextInt();
		sc.close();
		if (x % 2 == 0) {
			System.out.printf("%d is an even number", x);
		} else {
			System.out.println(x + "is an odd number");
		}

	}
}
