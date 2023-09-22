package allbasicprogram;

public class MonthSwitch {

	public static void main(String[] args) {
		int ch = Integer.parseInt(args[0]);
		switch (ch) {
		case 1: {
			System.out.println(ch + "is a January");
			break;
		}
		case 2: {
			System.out.println(ch + "is a February");
			break;
		}
		case 3: {
			System.out.println(ch + "is a March");
			break;
		}
		case 4: {
			System.out.println(ch + "is a April");
			break;
		}
		case 5: {
			System.out.println(ch + "is a May");
			break;
		}

		case 6: {
			System.out.println(ch + "is a June");
			break;
		}
		case 7: {
			System.out.println(ch + "is a July");
			break;
		}
		case 8: {
			System.out.println(ch + "is a August");
			break;
		}
		case 9: {
			System.out.println(ch + "is a September");
			break;
		}
		case 10: {
			System.out.println(ch + "is a October");
			break;
		}
		case 11: {
			System.out.println(ch + "is a November");
			break;
		}
		case 12: {
			System.out.println(ch + "is a December");
			break;
		}

		default: {
			System.out.println(ch + "Entered is a Valid Month Num");
		}

		}
	}

}
