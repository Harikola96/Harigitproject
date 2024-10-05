package javaexamples;

import java.util.Scanner;

public class Example8 {
	public static void main(String[] args) {
		// Take limits from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		long llimit = sc.nextLong();
		System.out.println("Enter upper limit");
		long ulimit = sc.nextLong();
		sc.close();
		for (long x = llimit; x <= ulimit; x++) {
			System.out.println("Table for " +x);
			System.out.println("---------");

			for (int i = 1; i <= 10; i++)
				System.out.printf("%d X %d=%d%n", x, i, x * i);
		}
	}
}
