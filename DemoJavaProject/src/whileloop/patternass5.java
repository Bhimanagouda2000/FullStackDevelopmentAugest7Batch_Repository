package whileloop;

public class patternass5 {

	public static void main(String[] args) {

      int i,num;
      i=1;
      num=1;
      
      while(i<=5)
      {
    	  int k=1;
    	  while(k<=i)
    	  {
    		  System.out.print(num+" ");
    		  k++;
    		  num++;
    	  }
    	  System.out.println("");
    	  i++;
      }

	}

}
/*
1 
2 3 
4 5 6 
7 8 9 10 
11 12 13 14 15
*/
