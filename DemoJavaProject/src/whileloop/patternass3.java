package whileloop;

public class patternass3 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 5) {
			int k = 1;
			while (k <= 5 - i + 1) {
				System.out.print(k);
				k++;
			}
			System.out.println("");
			i++;
		}

	}

}
/*
 * 12345 1234 123 12 1
 */