package dowhile;

public class patternass5 {

	public static void main(String[] args) {
		int i, num;
		i = 1;
		num = 1;

		do {
			int k = 1;
			do {
				System.out.print(num + " ");
				k++;
				num++;
			} while (k <= i);
			System.out.println("");
			i++;
		} while (i <= 5);

	}

}
