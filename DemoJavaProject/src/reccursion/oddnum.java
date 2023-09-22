package reccursion;
class oddnum1
{
	int count=0;
	void showNumbers()
	{
		  if(count%2==1)
			{
			
				System.out.println("Odd numbrs:"+count);
				count+=1;
				showNumbers();

			}
		}
	}


public class oddnum {

	public static void main(String[] args) {
		
		oddnum1 o=new oddnum1();
		o.showNumbers();

	}

}
