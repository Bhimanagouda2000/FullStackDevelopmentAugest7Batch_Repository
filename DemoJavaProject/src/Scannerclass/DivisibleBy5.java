package Scannerclass;

import java.util.Scanner;

public class DivisibleBy5 {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Enter the num which Should be Divided");
		int num = scanner.nextInt();

		if (num % 5 == 0) {
			System.out.println("It Is divisible By 5");
		} else {
			System.out.println("It is not divisble by 5");
		}
		scanner.close();

	}

}
