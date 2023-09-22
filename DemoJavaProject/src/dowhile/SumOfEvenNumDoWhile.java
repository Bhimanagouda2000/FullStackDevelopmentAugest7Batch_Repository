package dowhile;

public class SumOfEvenNumDoWhile {

	public static void main(String[] args) {
		
		int i,sum;
		sum=0;
		i=250;
		do
		{

			if(i%2==0)
			{	 
				sum=sum+i;
			}
			i++;
		}while(i<=500);
		System.out.println(sum);

	};

}
