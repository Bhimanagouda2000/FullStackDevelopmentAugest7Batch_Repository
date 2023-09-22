package onedimensionarray;

public class Square {

	public static void main(String[] args) {

		int count = 0;
		int square;

		for (int i = 1; i <= 10; i++)

		{
			count += 1;

		}

		System.out.println("The Count is:" + count);

		int x[] = new int[10];
		int k = 0;

		{
			for (int j = 1; j <= 10; j++)

			{

				x[k] = j;
				k++;

			}
		}

		for (int z = (x.length - 1) / 2; z >= 0; z--) {
			square = x[z] * x[z];

			System.out.println(square);
		}

	}

}
/*
 * The Count is:10 25 16 9 4 1
 */
