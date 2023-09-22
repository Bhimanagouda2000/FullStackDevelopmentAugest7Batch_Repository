package dowhile;

public class patternass7 {

	public static void main(String[] args) {
		int i = 1;
		int num = 1;
		do {
			int k = 1;
			do {
				int square = num * num;
				System.out.print(square + " ");
				k++;
				num++;
			} while (k <= i);
			System.out.println("");
			i++;
		} while (i <= 4);

	}

}
/*
 * 1 4 9 16 25 36 49 64 81 100
 */
