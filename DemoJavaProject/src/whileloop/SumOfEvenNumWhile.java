package whileloop;

public class SumOfEvenNumWhile {

	public static void main(String[] args) {
		int i,sum;
		sum=0;
		i=250;
		while(i<=500)
		{

			if(i%2==0)
			{	 
				sum=sum+i;
			}
			i++;
		}
		System.out.println(sum);

	}

}
