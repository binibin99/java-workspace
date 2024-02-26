package quiz;

import java.text.SimpleDateFormat;
import java.util.Calendar;
import java.util.Date;

public class D13_EventDay {

	/*
	 * 실행하면 오늘로부터 앞으로 1년간의 모든 이벤트 날짜를 출력해주는 프로그램을 만들어보세요
	 * 
	 * 1+1 이벤트 : 매월 18일 20% 할인 이벤트 : 홀수번째 금요일
	 * 
	 * 이벤트 날짜가 겹치는 날에는 둘 모두 적용됨을 알려줘야 한다
	 */
	public static void main(String[] args) {
		
		Calendar today = Calendar.getInstance();
		Calendar target = Calendar.getInstance();
		
		target.add(Calendar.YEAR, 1);
		
		SimpleDateFormat eventDayFormat =
				new SimpleDateFormat("YYYY-MM-dd(E)");
		
		while (today.before(target)) {
			int dayOfMonth = today.get(Calendar.DAY_OF_MONTH);
			int dayOfWeek = today.get(Calendar.DAY_OF_WEEK);
			int dayOfWeekInMonth = today.get(Calendar.DAY_OF_WEEK_IN_MONTH);
			
			if (dayOfMonth == 18 && dayOfWeek == Calendar.FRIDAY && dayOfWeekInMonth % 2 == 1) {
				System.out.printf("[[%s]]\n",
						eventDayFormat.format(today.getTime()));
				System.out.println("[NOTICE] 1 + 1 이벤트, 20% 할인 이벤트 모두 진행중!");
			} else if (dayOfMonth == 18) {
				System.out.printf("[[ %s ]]\n,"
						 ,eventDayFormat.format(today.getTime()));
			} else if (dayOfMonth == 18) {
				System.out.printf("[[%s]]", eventDayFormat.format(today.getTime()));
				System.out.println("[NOTICE] 1 + 1 이벤트 행사 진행중!");
			} else if (dayOfWeek == Calendar.FRIDAY && dayOfWeekInMonth % 2 == 1) {
				System.out.printf("[[ %s ]]\n",
						eventDayFormat.format(today.getTime()));
				System.out.println("[NOTICE] 20% 할인 이벤트 진행중!");
			}
				
			today.add(Calendar.DATE, 1);
		}
	}
			
}

