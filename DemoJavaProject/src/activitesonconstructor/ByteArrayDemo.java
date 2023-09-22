package activitesonconstructor;

class Bytarray {
	// byte array read 2nd half
	void byarr(byte x[]) {
		for (int i = x.length / 2; i <= x.length - 1; i++) {
			System.out.println(x[i]);
		}
		System.out.println("--------------------------");
	}

	// 1d short array read 1st half
	void shortarr(short s[]) {
		for (int i = 0; i < s.length / 2; i++) {
			System.out.println(s[i]);
		}
		System.out.println("--------------------------");
	}

	// 1d int array read 1st halh in reverse Order

	void integarr(int a[]) {
		for (int i = (a.length / 2) - 1; i >= 0; i--) {
			System.out.println(a[i]);

		}
		System.out.println("--------------------------");
	}

	// 1d concatition of char all character

	void concatchar(char a[]) {
		String s = "";
		for (int i = 0; i < a.length; i++) {
			s = s + a[i];
		}
		System.out.println("concatinated chars : ");
		System.out.println(s);
	}

	// 1d string array in revers order

	void strarray(String st[]) {
		for (int i = st.length - 1; i >= 0; i--) {
			System.out.println(st[i]);
		}
		System.out.println("Reverse Order array : ");
		System.out.println("--------------------------");
	}

	// 1d int array sum of all elements in it

	void sumelements(int q[], int sum) {
		for (int i = 0; i < q.length; i++) {
			sum = sum + q[i];
		}
		System.out.println("the given numbers of sum is :" + sum);
		System.out.println("--------------------------");
	}

	// 1d char array display all volwes separately

	void chararray(char c[]) {
		for (int i = 0; i < c.length; i++) {
			switch (c[i]) {
			case 'a':
			case 'A':
			case 'e':
			case 'E':
			case 'i':
			case 'I':
			case 'o':
			case 'O':
			case 'u':
			case 'U':
				System.out.println(c[i]);
				break;
			default:
				continue;
			}
		}
		System.out.println("--------------------------");
	}

	// 2d int array (3*3) read last row of elements

	void LastRow(int d[][]) {
		System.out.print("Last Row : ");
		for (int i = 0; i < d[2].length; i++) {
			System.out.print(d[2][i] + " ");
		}
		System.out.println();
	}

	// 2d int array (3*3)find sum of 1st row only

	void sumelements(int w[][]) {
		int sum = 0;
		for (int i = 0; i < w[0].length; i++) {
			sum = sum + w[0][i];
		}
		System.out.println("sum of first row is : " + sum);
		System.out.println("--------------------------");
	}

	// write a method to perform subtraction of 2 matrix and display in reverse

	void substractionmatrix(int x[][], int y[][]) {
		int sub[][] = new int[x.length][x[0].length];
		if ((x.length == y.length) && (x[0].length == y[0].length)) {
			for (int i = 0; i < x.length; i++) {
				for (int j = 0; j < x[i].length; j++) {
					sub[i][j] = x[i][j] - y[i][j];

				}
			}
			for (int i = sub.length - 1; i >= 0; i--) {
				for (int j = sub[i].length - 1; j >= 0; j--) {
					System.out.print(sub[i][j] + " ");
				}
				System.out.println();
			}
			System.out.println("--------------------------");
		}
	}

	// 2d int array square each element and find sum of it
	void onedimensionalintarray(int e[]) {
		int square[] = new int[e.length];
		int k = 0;
		for (int i = 0; i < e.length; i++) {
			square[k] = e[i] * e[i];
			k++;
		}
		int sum = 0;
		for (int j = 0; j < square.length; j++) {
			sum = sum + square[j];
		}
		System.out.println("square of sum of each elements is : " + sum);
		System.out.println("--------------------------");
	}

	// 2d string array concatination of all elements

	void concatallelements(String str[][]) {
		for (int i = 0; i < str.length; i++) {
			for (int j = 0; j < str[i].length; j++) {
				System.out.print(str[i][j]);
			}
		}
	}
}

public class ByteArrayDemo {

	public static void main(String[] args) {
		byte b[] = { 1, 2, 3, 4, 5, 6, 7, 9 };
		Bytarray o1 = new Bytarray();
		o1.byarr(b);

		short c[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		o1.shortarr(c);

		int a[] = { 1, 2, 3, 4, 5, 6, 7, 8 };
		o1.integarr(a);

		char h[] = { 'R', 'a', 'J' };
		char n[] = { 'A', 'P', 'T' };
		o1.concatchar(h);

		String m[] = { "Bhimana", "Gouda", "Patil" };
		o1.strarray(m);

		int r[] = { 1, 2, 3, 40 };
		o1.sumelements(r, 0);

		char d[] = { 'a', 'e', 'i', 'o', 'b' };
		o1.chararray(d);

		int x[][] = { { 1, 2, 3 }, { 4, 5, 6 }, { 7, 8, 9 } };
		o1.LastRow(x);

		int p[][] = { { 2, 4, 6 }, { 3, 5, 9 }, { 2, 3, 4 } };
		o1.sumelements(p);

		int k[][] = { { 5, 6 }, { 8, 7 } };
		int l[][] = { { 1, 2 }, { 4, 5 } };
		o1.substractionmatrix(k, l);

		int s[] = { 1, 2, 3, 4 };
		o1.onedimensionalintarray(s);

		String st[][] = { { "Patil", "Guru", "Suresh" }, { "Ammu", "Chummu", "Sharu" }, { "Mummy", "Daddy", "Akka" } };
		o1.concatallelements(st);
	}

}