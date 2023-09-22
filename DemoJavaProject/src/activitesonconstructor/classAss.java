package activitesonconstructor;

class vowel1 {

	void Vowelfind(char ch) {

		if ((ch == 'A') || (ch == 'E') || (ch == 'I') || (ch == 'O') || (ch == 'U')) {
			System.out.println("It is a VOWEL");
		} else {
			System.out.println("Give the Valid Alphabet");
		}
	}

	void reverse(char ch[][]) {
		for (int i = ch.length - 1; i >= 0; i--) {
			for (int j = ch[0].length - 1; j >= 0; j--) {
				System.out.print(ch[i][j] + " ");
			}
			System.out.println();
		}
	}

	void onedarry(int x[]) {
		int a[] = new int[x.length];
		int c = 0;
		for (int i = x.length - 1; i >= 0; i--) {
			a[c] = x[i];
			c++;
		}
		for (int i = 0; i < a.length / 2; i++) {
			System.out.println(a[i]);
		}

	}

	void Andoperator(int a, int b) {
		boolean res = ((a > b) && (b != a));
		if (res == true) {
			System.out.println(a + ":is Greater");
		} else {
			System.out.println(b + ": is Greater ");
		}

	}

	void Oroperator(int a, int b) {
		boolean res = ((a < b) || (b > a));
		if (res == true) {
			System.out.println(a + ":is not Lesser");
		} else {
			System.out.println(b + ": is Lesser ");
		}
	}

	void Notoperator(int a, int b) {
		boolean res = !((a > b) || (b != a));
		if (res == true) {
			System.out.println(a + ":is equal");
		} else {
			System.out.println(b + ": is not equal ");
		}
	}

	void forloop() {
		System.out.println("For loop");
		for (int i = 50; i >= 40; i--) {
			System.out.print(i + " ");
		}
		System.out.println();
	}

	void While() {
		System.out.println("While loop");
		int i = 50;
		while (i >= 40) {
			System.out.print(i + " ");
			i--;
		}
		System.out.println();
	}

	void dowhile() {
		System.out.println("DoWhile loop");
		int i = 50;
		do {
			System.out.print(i + " ");
			i--;
		} while (i >= 40);
		System.out.println();
	}

}

public class classAss {

	public static void main(String[] args) {

		vowel1 obj = new vowel1();
		char[][] ch = { { 'a', 'b', 'c' }, { 'd', 'r', 't' }, { 'x', 'y', 'z' } };
		int x[] = { 1, 2, 3, 4, 5, 6, 7 };
		obj.Vowelfind('A');
		obj.reverse(ch);
		obj.onedarry(x);
		obj.Andoperator(9, 5);
		obj.Oroperator(6, 9);
		obj.Notoperator(9, 9);
		obj.forloop();
		obj.While();
		obj.dowhile();
	}

}
