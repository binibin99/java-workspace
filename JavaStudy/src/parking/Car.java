package parking;

import java.text.SimpleDateFormat;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class Car {
	String carNum;
	String carType;
	LocalDateTime entryTime;
	LocalDateTime exitTime;
	
	// * SimpleDateFormat - java.util.Date 타입 전용
	//private static SimpleDateFormat parkTimeFormat =
	//		new SimpleDateFormat("MM-dd(e)/HH:mm");
	
	private static DateTimeFormatter parkingTimeFormat =
			DateTimeFormatter.ofPattern("MM-dd(E)/HH:mm");
	
	Car(String carNum, String carType, 
			LocalDateTime entryTime, LocalDateTime exitTime) {
		this.carNum = carNum;
		this.carType = carType;
		this.entryTime = entryTime;
		this.exitTime = exitTime;
	}
	
	@Override
	public String toString() {
		return String.format("[%s/%s/%s/%s]",
				carNum,
				carType,
				entryTime.format(parkingTimeFormat),
				exitTime.format(parkingTimeFormat));
	}
	
}
