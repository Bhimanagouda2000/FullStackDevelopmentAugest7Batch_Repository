package matrixcalculation;

public class AdditionandTransposeMatrix {

	public static void main(String[] args) {
		int x[][] = { { 10, 50 }, { 80, 60 } };
		int y[][] = { { 2, 6 }, { 8, 6 } };
		if ((x.length == y.length) && (x[0].length == y[0].length)) {
			int z[][] = new int[x.length][x[0].length];
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					z[i][j] = x[i][j] + y[i][j];

				}
			}

			for (int m = 0; m < x.length; m++) {
				for (int n = 0; n < x[m].length; n++) {
					System.out.print(z[n][m] + " ");
				}
				System.out.println();
			}

		}
	}

}
/*12 88 
56 66*/
