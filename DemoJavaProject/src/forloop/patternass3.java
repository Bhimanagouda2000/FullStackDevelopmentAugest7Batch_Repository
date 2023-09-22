package forloop;

public class patternass3 {

	public static void main(String[] args) {
		for(int i=1;i<=5;i++)
		{
			for(int k=1;k<=5-i+1;k++)
			{
				System.out.print(k);
			}
			System.out.println("");
		}

	}

}
/*
12345
1234
123
12
1
*/