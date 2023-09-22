package allbasicprogram;

public class OwelIfElse {

	public static void main(String[] args) 
	{
		char ch = args[0].charAt(0);
		 
        if ((ch == 'A')||(ch == 'E')||(ch == 'I')||(ch == 'O')||(ch == 'U'))
        {
            System.out.println("It is a VOWEL");
        }
        else 
        {
            System.out.println("Give the Valid Alphabet");
        }
        

	}

}
