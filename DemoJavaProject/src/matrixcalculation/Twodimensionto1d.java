package matrixcalculation;

public class Twodimensionto1d {

	public static void main(String[] args) {
		int a[][] = { { 1, 5, 6 }, { 7, 8, 9 }, { 6, 3, 5 } };

		int b[] = new int[a.length * a[0].length];
		int k = 0;
		for (int i = 0; i < a.length; i++) {
			for (int j = 0; j < a[i].length; j++) {
				b[k] = a[i][j];
				k++;
			}
		}
		for (int z = 0; z < b.length; z++) {
			System.out.print(b[z] + " ");
		}
	}
}

/* 1 5 6 7 8 9 6 3 5 */