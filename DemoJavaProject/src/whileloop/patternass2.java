package whileloop;

public class patternass2 {

	public static void main(String[] args) {
		int i = 1;
		while (i <= 6) {
			int k = 1;
			while (k <= 6 - i) {
				System.out.print("5 ");
				k++;
			}
			System.out.println("");
			i++;
		}

	}

}

/*
 * 5 5 5 5 5 5 5 5 5 5 5 5 5 5 5
 */