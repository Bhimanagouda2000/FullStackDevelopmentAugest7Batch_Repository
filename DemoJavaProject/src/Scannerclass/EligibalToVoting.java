package Scannerclass;

import java.util.Scanner;

public class EligibalToVoting {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Check your Eligibility:");
		int age = scanner.nextInt();

		if (age >= 18) {
			System.out.println("U can vote:" + age);
		} else {
			System.err.println("u cant vote:" + age);
		}
	}

}
