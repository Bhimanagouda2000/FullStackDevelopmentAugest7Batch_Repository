package array;

public class ThreeCrossThree {

	public static void main(String[] args) {
		char ch[][] = { { 'a', 'b', 'c' }, { 'd', 'e', 'f' }, { 'g', 'h', 'i' } };

		/*
		 * for(int i=0;i<ch.length;i++) { System.out.print(ch[0][i]+"  "); }
		 */
		for (int i = 0; i < ch.length; i++) {
			System.out.println(ch[i][1] + "  ");
		}

	}
}
