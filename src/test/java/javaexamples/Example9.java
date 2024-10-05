package javaexamples;

import java.util.Scanner;

public class Example9 {
	public static void main(String[] args) {
		// Take limits from keyboard
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter a number");
		int n = sc.nextInt();
		sc.close();
		double sum = 0.0;
		for (int i = 1; i <= n; i++) {
			sum = sum + (double) 1 / i;
		}

		System.out.println(sum);

	}
}
