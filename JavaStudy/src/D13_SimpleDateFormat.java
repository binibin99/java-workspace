import java.util.Calendar;
import java.util.Date;
import java.util.TimeZone;
import java.text.SimpleDateFormat;

public class D13_SimpleDateFormat {
	
	/*
	  	# SimpleDateFormat
	 
	 	- Date타입 인스턴스를 서식을 사용해 문자열로 변환할 수 있는 클래스
	 	- y : 년
	 	- M : 월
	 	- d : 일
	 	- h : 12시
	 	- H : 24시
	 	- m : 분
	 	- s : 초
	 	- S : 밀리초
	 	- E : 요일 (짧게)
	 	- EEEE : 요일 (길게)
	 	- a : 오전/오후
	 */
	public static void main(String[] args) {
		SimpleDateFormat sdf = 
				new SimpleDateFormat("yyyy-MM-dd HH:mm:ss.SSS EEEE z");
		
		// 다른 나라 시간 뽑아보기
		//for (String id : TimeZone.getAvailableIDs()) {
		//	System.out.println(id);
		//}
		System.out.println(TimeZone.getDefault());
		System.out.println(TimeZone.getTimeZone("America/New_York"));
		
		Calendar newYork = Calendar.getInstance(TimeZone.getTimeZone("America/New_York"));
		
		System.out.println(newYork.get(Calendar.DATE));
		System.out.println(newYork.get(Calendar.HOUR_OF_DAY));
	}
}
