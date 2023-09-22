package forloop;

public class patternass7 {

	public static void main(String[] args) {
		int num = 1;
		for (int i = 1; i <= 4; i++) {
			for (int k = 1; k <= i; k++) {
				int square = num * num;
				System.out.print(square + " ");
				num++;
			}
			System.out.println("");
		}

	}

}
/*
 * 1 4 9 16 25 36 49 64 81 100
 */
