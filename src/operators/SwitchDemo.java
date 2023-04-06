package operators;

public class SwitchDemo {
	public static void main(String[] args) {

		//		if      else
		//      case	default	

		String dayName = "xyz";
		int dayNumber = 1;
		switch (dayName) {
		case "Sunday":
		case "Sun":
		case "Ravivar":
			dayNumber = 1;
			break;
		case "Monday":
		case "Mon":
			dayNumber = 2;
			break;
		case "Tuesday":
			dayNumber = 3;
			break;
		default:
			dayNumber = -1;
			break;
		}
		System.out.println("Day name " + dayName  + " => " +dayNumber);
	}
}
