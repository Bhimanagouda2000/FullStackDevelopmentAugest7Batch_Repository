package dowhile;

public class patternass2 {

	public static void main(String[] args) {
		int i=1;
		do
		{
			int k=1;
			do
			{
				System.out.print("5 ");
				k++;
			}while(k<=6-i);
			System.out.println("");
			i++;
		}while(i<=5);

	}

}
/*
  5 5 5 5 5 
5 5 5 5 
5 5 5 
5 5 
5
 */

