import java.time.DayOfWeek;
import java.time.LocalDate;
import java.time.LocalDateTime;
import java.time.LocalTime;
import java.time.Month;
import java.time.ZoneId;
import java.time.format.TextStyle;
import java.time.temporal.ChronoField;
import java.time.temporal.ChronoUnit;
import java.time.temporal.TemporalAdjuster;
import java.time.temporal.TemporalAdjusters;
import java.util.Locale;

public class D14_Time {
	
	/*
	  	# java.time 패키지
	  
	 	- Calendar의 여러가지 단점을 보완한 시간을 다루는 클래스들을 모아놓은 패키지
	 	- Calendar는 원본 인스턴스를 수정하여 사용하는 방식이고
	 	  time패키지의 클래스들은 새로운 인스턴스를 반환하는 방식이다
	 	  
	 	# java.time.LocalDate
	 	
	 	- 날짜만 다루는 클래스
	 	
	 	# java.time.LocalTime
	 	
	 	- 시간만 다루는 클래스
	 	
	 	# java.time.LocalDateTime
	 	
	 	- 날짜와 시간을 모두 다르는 클래스
	 */
	public static void main(String[] args) {
		
		// now() : 현재 시간으로 인스턴스를 생성한다
		LocalDate now = LocalDate.now();
		LocalDate nowNy = LocalDate.now(ZoneId.of("America/New_York"));
		
		LocalTime thisTime = LocalTime.now();
		LocalTime nyTime = LocalTime.now(ZoneId.of("America/New_York"));
		
		LocalDateTime thisDateTime = LocalDateTime.now();
		LocalDateTime nyDateTime = LocalDateTime.now(ZoneId.of("America/New_York"));
		
		System.out.println(now);
		System.out.println(nowNy);
		
		System.out.println(thisTime);
		System.out.println(nyTime);
		
		System.out.println(thisDateTime);
		System.out.println(nyDateTime);
		
		// of() : 원하는 시점의 인스턴스를 생성해준다
		LocalDate childrensDay = LocalDate.of(2002, 5, 5);
		LocalTime myTime = LocalTime.of(9, 53, 30);
		
		LocalDateTime myDateTime = LocalDateTime.of(childrensDay, myTime);
		LocalDateTime myDateTime2 = LocalDateTime.of(2010, 10, 10, 11, 50, 35, 9532414);
		
		System.out.println(childrensDay);
		System.out.println(myTime);
		System.out.println(myDateTime);
		System.out.println(myDateTime2);
		
		// plusXXX() : 해당 시간 인스턴스에 원하는 만큼을 더한 새 인스턴스를 반환
		// minusXXX() : 해당 시간 인스턴스에 원하는 만큼을 뺀 새 인스턴스를 반환
		
		// java.time 패키지 클래스들의 시간 단위는 ChronoUnit에 상수로 정의되어 있다
		LocalDate after3Months = childrensDay.plus(3, ChronoUnit.MONTHS);
		LocalDate after10Days = childrensDay.plusDays(3);
		
		LocalTime after8Hours = nyTime.plus(8, ChronoUnit.HOURS);
		
		System.out.println(childrensDay);
		System.out.println(after3Months);
		System.out.println(after10Days);
		System.out.println(after8Hours);
		
		// getXX() : 원하는 필드값을 꺼낼 수 있다
		
		// 선택할 수 있는 모든 종류의 필드들은 ChronoField 클래스에 정의되어 있다
		System.out.println(after8Hours.getLong(ChronoField.MINUTE_OF_DAY));
		System.out.println(after8Hours.getHour());
		System.out.println(after8Hours.getMinute());
		
		// MILLI_OF_DAY : 오늘 시간 전체를 밀리세컨드로 변환한 것
		System.out.println(after8Hours.get(ChronoField.MILLI_OF_DAY));
		// MILLI_OF_SECOND : 지금 밀리 세컨드를 의미함
		System.out.println(after8Hours.get(ChronoField.MILLI_OF_SECOND));
		
		
		// DayOfWeek로 요일 다루기 (ChronoField 중 하나)
		DayOfWeek dow = now.getDayOfWeek();
		
		// 요일을 Calendar처럼 int로 다루는게 아니라 클래스로 다루는 이유
		System.out.println(dow);
		
		// 요일의 이름은 언어별로 다르고 
		// 길게 쓰기도하고 짧게 쓰기도 한다(TextStyle) 
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
		System.out.println(dow.getDisplayName(TextStyle.FULL, Locale.KOREAN));
		System.out.println(dow.getDisplayName(TextStyle.SHORT, Locale.KOREAN));
		
		// Month 클래스로 달 다뤄보기
		Month month = now.getMonth();
		
		System.out.println(month.getDisplayName(TextStyle.FULL, Locale.ENGLISH));
		System.out.println(month.getDisplayName(TextStyle.SHORT, Locale.ENGLISH));
		
		// with() : 원하는 동작(ex : 이번 달의 마지막 날짜)으로
		//			시간을 조정한 후 새 인스턴스를 반환
		System.out.println(now);
		
		// 단순하게 해당 필드의 값을 조정하기
		System.out.println(now.with(ChronoField.DAY_OF_MONTH, 3));
		
		// 미리 정의되어 있는 동작 사용하기 (TemporalAdjuster, 날짜 조정기)
		
		// TemporalAdjuster는 TemporalAdjusters에 모두 상수로 정의되어 있다
		TemporalAdjuster adjuster = TemporalAdjusters.lastDayOfMonth();
		TemporalAdjuster adjuster2 = TemporalAdjusters.lastDayOfMonth();
		
		/// 이번달의 마지막 날짜로 조정해주는 adjuster를 전달하여 날짜를 조정한다
		System.out.println(now.with(adjuster));
		System.out.println(now.with(adjuster2));
		
		// 미리 만들어져있는 메서드들도 있다
		System.out.println(now.withYear(2010));
		System.out.println(now.withYear(3));
		System.out.println(now.withDayOfMonth(23));
		System.out.println(now.withDayOfMonth(20));
	}

}
