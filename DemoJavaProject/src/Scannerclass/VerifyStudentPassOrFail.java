package Scannerclass;

import java.util.Scanner;

public class VerifyStudentPassOrFail {

	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Eneter your  Marks: ");
		int passingmarks, marksscored;
		passingmarks = 18;
		marksscored = scanner.nextInt();

		if (marksscored >= passingmarks) {
			System.out.println("You are pass:" + marksscored);
		} else {
			System.err.println("You are fail:" + marksscored);
		}
	}

}
