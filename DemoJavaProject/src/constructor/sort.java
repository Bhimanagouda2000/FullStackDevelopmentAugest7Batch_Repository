package constructor;

class sorting {
	sorting(int x[]) {
		for (int i = 0; i < x.length; i++) {
			for (int j = i + 1; j < x.length; j++) {
				int temp = 0;
				if (x[i] > x[j]) {
					temp = x[i];
					x[i] = x[j];
					x[j] = temp;
				}
			}
			System.out.println(x[i]);
		}
	}
}

public class sort {

	public static void main(String[] args) {
		int a[] = { 1, 8, 9, 6 };
		sorting o1 = new sorting(a);
	}

}
