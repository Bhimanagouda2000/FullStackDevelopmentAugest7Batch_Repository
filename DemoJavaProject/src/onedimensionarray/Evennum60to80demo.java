package onedimensionarray;

public class Evennum60to80demo {

	public static void main(String[] args) {

		int count = 0;
		for (int i = 60; i <= 80; i++) {
			if (i % 2 == 0) {
				count += 1;
			}
		}
		System.out.print("This Is count Statement:" + count);
		System.out.println(" ");

		int x[] = new int[count];
		int k = 0;
		for (int j = 60; j <= 80; j++) {
			if (j % 2 == 0) {
				x[k] = j;
				k++;
			}
		}

		for (int z = x.length - 1; z >= 0; z--) {
			System.out.println(x[z]);
		}

	}

}
/*
 * This Is count Statement:11 80 78 76 74 72 70 68 66 64 62 60
 */
