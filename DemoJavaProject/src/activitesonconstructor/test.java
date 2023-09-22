package activitesonconstructor;

import java.util.Scanner;

public class test {
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.println("Enter n value");
		int n = sc.nextInt();
		System.out.println("enter r value ");
		int r = sc.nextInt();

		long sum = 1;

		for (long i = 1; i <= 1; i++) {
			for (long j = r; j <= n; j++) {
				sum *= j;
			}
			System.out.print(n+"p"+r+"=");
			System.out.print(sum + "");

			System.out.println();

		}
	}
}
