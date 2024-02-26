package quiz;

import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.format.TextStyle;
import java.util.Locale;

import parking.Cars;

public class D14_ParkingSystem {
	
	public static void main(String[] args) {
		
		System.out.println(Cars.getRandomCar());
	}

	/*
	 * public static boolean isValidCarNumber(String carNumber) { LocalDate now =
	 * LocalDate.now(); DayOfWeek dow = now.getDayOfWeek();
	 * 
	 * 
	 * String a = (dow.getDisplayName(TextStyle.SHORT, Locale.KOREAN)); int len =
	 * carNumber.length();
	 * 
	 * if (a.equals("월")) { if (len == 4) { if (carNumber.charAt(3) == '1' ||
	 * carNumber.charAt(3) == '6') { System.out.println("[INFO] 주차제한 입니다"); return
	 * false; } else { System.out.println("[INFO] 주차가 가능합니다"); return true; } } }
	 * 
	 * if (a.equals("화")) { if (len == 4) { if (carNumber.charAt(3) == '2' ||
	 * carNumber.charAt(3) == '7') { System.out.println("[INFO] 주차제한 입니다"); return
	 * false; } else { System.out.println("[INFO] 주차가 가능합니다"); return true; } } }
	 * 
	 * if (a.equals("수")) { if (len == 4) { if (carNumber.charAt(3) == '3' ||
	 * carNumber.charAt(3) == '8') { System.out.println("[INFO] 주차제한 입니다"); return
	 * false; } else { System.out.println("[INFO] 주차가 가능합니다"); return true; } } }
	 * 
	 * if (a.equals("목")) { if (len == 4) { if (carNumber.charAt(3) == '4' ||
	 * carNumber.charAt(3) == '9') { System.out.println("[INFO] 주차제한 입니다"); return
	 * false; } else { System.out.println("[INFO] 주차가 가능합니다"); return true;
	 * 
	 * } } }
	 * 
	 * if (a.equals("금")) { if (len == 4) { if (carNumber.charAt(3) == '5' ||
	 * carNumber.charAt(3) == '0') { System.out.println("[INFO] 주차제한 입니다"); return
	 * false; } else { System.out.println("[INFO] 주차가 가능합니다"); return true; } } }
	 * return false; }
	 * 
	 * public static void main(String[] args) {
	 * 
	 * System.out.println(isValidCarNumber("1235"));
	 * 
	 * }
	 */
}
