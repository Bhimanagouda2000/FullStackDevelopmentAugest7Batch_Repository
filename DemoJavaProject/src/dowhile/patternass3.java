package dowhile;

public class patternass3 {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print(k);
				k++;
			}while(k<=5-i+1);
			System.out.println("");
			i++;
		}while(i<=5);


	}

}
/*
12345
1234
123
12
1
*/
