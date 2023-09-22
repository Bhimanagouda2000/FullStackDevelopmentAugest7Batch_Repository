package TwoDimensionArray;

public class twodimensionarray {

	public static void main(String[] args) {
		/*
		 * char x[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'j' } }; {
		 * for (int i = 1; i < x.length - 1; i++) { for (int j = 0; j < x[i].length;
		 * j++) { System.out.print(x[i][j] + " "); } System.out.println(); } for (int i
		 * = 0; i < x.length; i++) { for (int j = 1; j < x[i].length - 1; j++) {
		 * System.out.print(x[i][j] + " "); } System.out.println(); }
		 * 
		 * }
		 */
		char x[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'j' } };
		System.out.print("First row: ");
		for (int i = 0; i < x[0].length; i++) {
			System.out.print(x[0][i] + " ");
		}

	}
}
/* First row: a b c */
