package Pattren;

public class Required {

	public static void main(String[] args) {
//		int num=1;
//		for(int i=0;i<=5;i++)
//		{
//			for(int j=0;j<=i-1;j++)
//			{
//				System.out.print("2 ");
//				num++;
//			}
//			System.out.println();
//		}
		char ch='A';
		for(int i=0;i<=5;i++)
		{
			for(int j=0;j<=i-1;j++)
			{
				System.out.print(ch+" ");
				ch++;
			}
			System.out.println();
		}

	}

}
/*
 * package Testing;

public class TwoDArraytoOnedArray {

	public static void main(String[] args) {
		//Q3: Assign 2 D array to 1 D array?

		int arr[][] = {{1,2},{3,4},{5,6}};
		int res[] = new int[arr.length*arr[0].length];
		int x=0;
		
		for(int i=0; i<arr.length; i++) {
			for(int j=0;j<arr[i].length; j++) {
				res[x]=arr[i][j];
				x++;
			}
		}
		for(int i=0; i<res.length; i++) {
			System.out.print(res[i]+" ");
		}
		
	}

}
*/
/*
 * package Testing;

public class OneDArraytoTwoDArray {
	// Q2: Assign 1 D array to 2 D array?

	public static void main(String[] args) {
		int arr[] = { 1, 2, 3, 4, 5, 6, 7, 8, 9 };


		int res[][] = new int[3][3];
		int x = 0;
		
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				res[i][j]=arr[x];
				x++;
			}
		}
		for(int i=0; i<res.length; i++) {
			for(int j=0; j<res[i].length; j++) {
				System.out.print(res[i][j]+" ");
			}
			System.out.println();
		}
	}

}
*/
//Scanner sc= new Scanner (system.in);
//System.out.println("Enter the Value of num1:")
//int num1=sc.nextInt();

}

}
