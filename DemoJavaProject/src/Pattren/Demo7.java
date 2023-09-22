package Pattren;

public class Demo7 {

	public static void main(String[] args) {
		int b = 1;
		for (int i = 1; i <= 5; i++) {
			for (int j = 1; j < i + 1; j++) {

				System.out.print(b * 2 + " ");
				b++;

			}
			System.out.println();
		}
	}

}
