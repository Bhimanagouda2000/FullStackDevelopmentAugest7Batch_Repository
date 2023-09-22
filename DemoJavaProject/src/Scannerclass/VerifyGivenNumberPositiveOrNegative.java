package Scannerclass;

import java.util.Scanner;

public class VerifyGivenNumberPositiveOrNegative {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter th num:");
		int num = scanner.nextInt();

		if (num >= 18) {
			System.out.println("num is +ve:" + num);

		} else {
			System.out.println("num is -ve:" + num);
		}
	}

}
