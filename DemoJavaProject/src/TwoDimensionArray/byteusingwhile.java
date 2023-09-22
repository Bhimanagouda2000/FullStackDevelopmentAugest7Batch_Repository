package TwoDimensionArray;

public class byteusingwhile {

	public static void main(String[] args) {
		byte x[][] = { { 2, 3, 4 }, { 4, 3, 2 }, { 9, 9, 8 } };
		System.out.println("Byte is: ");
		/*
		 * for(int i=0;i<x.length;i++) { for(int j=0;j<x[i].length;j++ ) {
		 * System.out.print(x[i][j]+" "); } System.out.println(); }
		 */
		int i = 0;
		while (i < x.length) {
			int j = 0;
			while (j < x[i].length) {
				System.out.print(x[i][j] + " ");
				j++;
			}
			System.out.println(" ");
			i++;
		}
	}

}
/*
 * 2 3 4 4 3 2 9 9 8
 */