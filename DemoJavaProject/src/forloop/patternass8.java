package forloop;

public class patternass8 {

	public static void main(String[] args) {
		int num = 15;
		for (int i = 1; i <= 5; i++) {
			for (int k = 1; k <= 5 - i + 1; k++) {
				System.out.print(num + " ");
				k++;
				num--;
			}
			System.out.println("");
			i++;
		}
	}

}
/*
 * 15 14 13 12 11 10 9 8 7 6 5 4 3 2 1
 */