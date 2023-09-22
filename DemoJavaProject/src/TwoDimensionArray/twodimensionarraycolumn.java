package TwoDimensionArray;

public class twodimensionarraycolumn {

	public static void main(String[] args) {
		char x[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'j' } };
		System.out.println("First column: ");
		for (int i = 0; i < 3; i++) {
			System.out.println(x[i][0]);
		}

	}

}
/*
 * First column: a d g
 */
