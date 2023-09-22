package Scannerclass;

import java.util.Scanner;

public class VerifyEvenOrOddNumber {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter a Number to Verify Its odd or not:");
		int val = scanner.nextInt();

		int res = (val % 2);
		if (res == 0) {
			System.out.println("The num is even:" + val);
		} else {
			System.out.println("The num is odd:" + val);
		}
	}

}
