package allbasicprogram;

public class TrafficSignalNested {

	public static void main(String[] args) {
		int ch = Integer.parseInt(args[0]);
		
		  if(ch == 1)
		  {
	    		  System.out.println("Red Stop");
		  }
	      else if (ch == 2)
		  {
	    		  System.out.println("Green Go");
		  }
	      else if (ch == 3)
		  {
    		  System.out.println("Yellow Cross");
	       }
		   else
	      {
			 System.out.println("Invalid input");
	      }

	}

}
