package allbasicprogram;

public class TrafficSignalSwitch {

	public static void main(String[] args) {
		char ch = args[0].charAt(0);
		switch (ch) {
		case 'R': {
			System.out.println(ch + "ed Signal Indicates To STOP");
			break;
		}
		case 'G': {
			System.out.println(ch + "reen Sigal Indicates to GO");
			break;
		}
		case 'Y': {
			System.out.println(ch + "ellow Indicates u can cross Road");
			break;
		}
		default:
			System.out.println("Give correct Name");

		}

	}

}
