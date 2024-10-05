package javaprograms;

import java.util.Scanner;

public class program3 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter lower limit");
		long llimit = sc.nextLong();
		System.out.println("Enter upper limit");
		long ulimit = sc.nextLong();
		sc.close();
		int count = 0;
		for (long x = llimit; x <= ulimit; x++) {
			int flag = 0;
			for (int i = 2; i < x; i++) {
				if (x % i == 0) {
					flag = 1;
					break;
				}
			}
			if (flag == 0) {
				System.out.printf("%d is a prime number%n", x);
				count++;
			}
		}
		System.out.printf("Total count of prime numbers in given range is %d", count);
	}

}
