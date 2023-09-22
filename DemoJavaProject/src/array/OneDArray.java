package array;

import java.util.Arrays;

public class OneDArray {

	public static void main(String[] args) {
		int arr[]= {1,2,3,4,15,6,7,8,9};
	/*	for(int i=0; i<arr.length; i++);
		System.out.println(Arrays.toString(arr));*/
	/*	int i=0;
		while(i<arr.length) {
			System.out.print(arr[i]+" ");
			i++;
		}*/
		for(int x :arr) {
			System.out.print(x+" ");
		}
	}

}
