package array;

import java.util.Arrays;

public class OneDArrayAnotherOne {

	public static void main(String[] args) {
		int arr[] = new int[5];
		arr[0] = 11;
		arr[1] = 12;
		arr[2] = 13;
		arr[3] = 14;
		arr[4] = 15;
		System.out.println(Arrays.toString(arr));
		System.out.println("-------------");
		for (int i = arr.length - 1; i >= arr.length / 2; i--) {
			System.out.print(arr[i] + " ");
		}
	}

}
