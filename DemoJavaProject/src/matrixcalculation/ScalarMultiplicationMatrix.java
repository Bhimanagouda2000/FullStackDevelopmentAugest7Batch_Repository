package matrixcalculation;



public class ScalarMultiplicationMatrix {

	public static void main(String[] args) {
		double x[][] = { { 6, 3, 5 }, { 9, 8, 5 } };
		{
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					System.out.print(x[i][j] * 2 + " ");
				}
				System.out.println(" ");
			}
		}

	}

}
/*
12.0 6.0 10.0  
18.0 16.0 10.0  
*/