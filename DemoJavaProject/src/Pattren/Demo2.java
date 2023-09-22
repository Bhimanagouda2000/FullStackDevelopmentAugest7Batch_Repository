package Pattren;

import java.util.Scanner;

public class Demo2 {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
		System.out.println("Enter a number");
	
		int a = s.nextInt();
		for(int i=1; i<=a; i++) {
			for(int j=a-1;j>=i-1; j-- ) {
				System.out.print("2 ");
			}
			System.out.println();
		}

	}

}
