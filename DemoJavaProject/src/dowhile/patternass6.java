package dowhile;

public class patternass6 {

	public static void main(String[] args) {
		int num = 5;
		int i = 1;
		do {
			int k = 1;
			do {
				System.out.print(num + " ");
				k++;
				num += 5;
			} while (k <= i);
			System.out.println("");
			i++;
		} while (i <= 5);

	}

}
