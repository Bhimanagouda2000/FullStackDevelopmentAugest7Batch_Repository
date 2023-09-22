package array;

import java.util.Arrays;

public class threecrossthreerowandcoloum {

	public static void main(String[] args) {
		String x[][] = { { "aa", "bb", "cc" }, { "dd", "ee", "ff" }, { "gg", "hh", "ii" } };
//		for(int i=0;i<x.length;i++)
//		{
//			System.out.print(x[1][i]+" ");
//			System.out.print(x[i][1]+" ");

		for (int i = x.length - 1; i >= 0; i--) {
			for (int j = x[i].length - 1; j >= 0; j--) {
				System.out.print(x[i][j] + " ");
			}

		}
		System.out.println();

	}

}
