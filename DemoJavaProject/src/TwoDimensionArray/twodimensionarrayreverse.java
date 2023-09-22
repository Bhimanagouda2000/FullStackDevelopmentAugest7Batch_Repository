package TwoDimensionArray;

public class twodimensionarrayreverse {

	public static void main(String[] args) {
		String x[][] = {{"Adu","Raja","Rajeshree"},
	    		  {"Guru","Praju","Gokul"},
	    		  {"Ammu","Chummu","Sharanya"}};
	      {
	    	  for(int i=x.length-1;i>=0;i--)
	    	  {
	    		  for(int j=x[i].length-1;j>=0;j-- )
	    		  {
	    			  System.out.print(x[i][j]+" ");
	    		  }
	    		  System.out.println();
	    	  }
	      }

	}

}
/*
Sharanya Chummu Ammu 
Gokul Praju Guru 
Rajeshree Raja Adu 
*/