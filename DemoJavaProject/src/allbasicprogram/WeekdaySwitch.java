package allbasicprogram;

public class WeekdaySwitch {

	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		switch(ch)
	{
		case'1':
		{
			System.out.println(ch+"is a Sunday");
			break;
		}
		case'2':
		{
			System.out.println(ch+"is a Monday");
			break;
		}
		case'3':
		{
			System.out.println(ch+"is a Tuesday");
			break;
		}
		case'4':
		{
			System.out.println(ch+"is a Wednesday");
			break;
		}
		case'5':
		{
			System.out.println(ch+"is a Thursday");
			break;
		}

		case'6':
		{
			System.out.println(ch+"is a Friday");
			break;
		}
		case'7':
		{
			System.out.println(ch+"is a Saturday");
			break;
		
		}
		
	   default:
	   {
		   System.out.println(ch+"Entered is a Wrong Num");
	   }
	}
	}

}
