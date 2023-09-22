package whileloop;

public class patternass7 {

	public static void main(String[] args) {
		int i = 1;
		int num = 1;
		while (i <= 4) {
			int k = 1;
			while (k <= i) {
				int square = num * num;
				System.out.print(square + " ");
				k++;
				num++;
			}
			System.out.println("");
			i++;
		}

	}

}
/*
 * 1 4 9 16 25 36 49 64 81 100
 */
