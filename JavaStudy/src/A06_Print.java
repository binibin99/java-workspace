
public class A06_Print {
	
	/*
	 	# 함수
	 	
	 	- 뒤에 ()가 붙은 것
	 	- 뒤에 ()가 붙고 class 내부에 있으면 메서드
	 	
	 	# 콘솔에 출력하기 위한 함수들
	 	
	 	 1. println()
	 	 
	 	 - ()안에 전달한 데이터를 콘솔에 출력하고 줄을 자동으로 바꿔준다
	 	 - 데이터 뒤에 자동으로 \n을 추가하여 출력한다
	 	 
	 	 2. print() 
	 	 
	 	 - ()안에 전달한 데이터를 콘솔에 출력한다
	 	 
	 	 3. printf()
	 	 
	 	 - print format
	 	 - 원하는 서식을 먼저 설정하고 해당 서식대로 데이터를 출력
	 	 - \n을 자동으로 추가해주지는 않으므로 주의해야 한다
	 	 
	 	 * printf()에서 사용하는 서식 문자의 종류
	 	  
	 	   %d : 해당 자리에 전달한 정수값을 10진수로 출력 (decimal)
	 	   %o : 해당 자리에 전달한 정수값을 8진수로 출력 (octal)
	 	   %x : 해당 자리에 전달한 정수값을16진수(소문자)로 출력 (hexa)
	 	   %X : 해당 자리에 전달한 정수값을 16진수(대문자)로 출력 (hexa)
	 	   %f : 실수
	 	   %s : 문자열
	 	   %c : 문자
	 	   %% : 그냥 %를 출력하고 싶을 때 사용 (서식 문자의 Escape)
	 	   
	 	 * 서식 문자 옵션 - 서식 문자의 %와 문자 사이에 넣어서 사용
	 	 
	 	 1. %숫자d  : 숫자만큼 자릿수를 확보하면서 출력한다
	 	 2. %-숫자d : 숫자만큼 자릿수를 확보한 후 왼쪽 정렬하여 출력한다
	 	 3. %+d : 부호를 출력한다
	 	 4. %0d : 숫자 앞에 남은 자리에 0을 추가하여 출력한다
	 	 5. %.숫자f : 소수점 자리수를 설정하여 출력한다
	 	 
	 */
	
	 public static void main(String[] args) {
		System.out.print("Hello, world!\n");
		System.out.print("Hello, world!\n");
		System.out.print("Hello, world!\n");
		System.out.print("Hello, world!\n");
		System.out.print("Hello, world!\n");
		
		
		int year = 2023;
		int month = 9;
		int date = 6;
		int hour = 11;
		int minute = 12;
		int second = 40;
		String ampm = "AM";
		
		System.out.println(year + "년 " + month + "월 " + date + "일 "
		+ ampm + " " + hour + ":" + minute + ":" + second);
		
		System.out.printf("%X년 %d월 %d일 %s %d:%d:%d\n",
				 year, month, date, ampm, hour, minute, second);
		
		double successRate = 60.8;
		
		System.out.printf("%.1f%%의 확률로 강화에 성공합니다.\n", successRate);
		
		int money = 1234;
		
		System.out.printf("보유금액 : %10d원\n", money);
		System.out.printf("보유금액 : %010d원\n", money);
		System.out.printf("보유금액 : %-10d원\n", money);
		System.out.printf("보유금액 : %+25d원\n", money);
		
		double dollar = 10.15;
		
		System.out.printf("dollor : S", dollar);
		
	 }
}
