package whileloop;

public class patternass6 {

	public static void main(String[] args) {
		int num=5;
		int i=1;
		while(i<=5)
		{
			int k=1;
			while(k<=i)
			{
				System.out.print(num+" ");
				k++;
				num+=5;
			}
			System.out.println("");
			i++;
		}

	}

}
