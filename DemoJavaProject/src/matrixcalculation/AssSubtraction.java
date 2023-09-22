package matrixcalculation;

public class AssSubtraction {

	public static void main(String[] args) {
		int x[][] = { { 10, 12, 13 }, { 14, 15, 16 }, { 17, 18, 19 } };
		int y[][] = { { 2, 4, 3 }, { 9, 8, 6 }, { 6, 8, 8 } };
		if ((x.length == y.length) && (x[0].length == y[0].length)) {
			int z[][] = new int[x.length][x[0].length];
			{
				for (int i = 0; i < x.length; i++) {
					for (int j = 0; j < x[i].length; j++) {
						z[i][j] = x[i][j] - y[i][j];
					}
				}
				for (int m = 0; m < z.length; m++) {
					for (int n = 0; n < z[m].length; n++) {
						System.out.print(z[m][n] + " ");
					}
					System.out.println("");
				}
			}
		}

	}
}
/*
 8 8 10 
5 7 10 
11 10 11 
 */

