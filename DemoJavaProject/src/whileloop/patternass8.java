package whileloop;

public class patternass8 {

	public static void main(String[] args) {
		int i = 1;
		int num = 15;
		while (i <= 5) {
			int k = 1;
			while (k <= 5 - i + 1) {
				System.out.print(num + " ");
				k++;
				num--;

			}
			System.out.println("");
			i++;
		}

	}

}
/*
 * 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
 */