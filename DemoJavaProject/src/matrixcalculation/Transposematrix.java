package matrixcalculation;

public class Transposematrix {

	public static void main(String[] args) {
		int x[][] = { { 2, 5, 6 }, { 9, 8, 7 }, { 6, 5, 1 } };
		for (int i = 0; i < x.length; i++) {
			for (int j = 0; j < x[i].length; j++) {
				System.out.print(x[j][i] + " ");
			}
			System.out.println("");
		}

	}
}
/*
 * 2 9 6 5 8 5 6 7 1
 */