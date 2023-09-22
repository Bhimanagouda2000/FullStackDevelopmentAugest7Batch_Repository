package dowhile;

public class patterass8 {

	public static void main(String[] args) {
		int i=1;
		int num=15;
		do
		{
			int k=1;
			do
			{
				System.out.print(num+" ");
				k++;
				num--;
			
			}while(k<=5-i+1);
			System.out.println("");
			i++;
		}while(i<=5);

	}

}
/*
15 14 13 12 11 
10 9 8 7 
6 5 4 
3 2 
1 
*/
