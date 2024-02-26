
public class A03_VariableTypes {
  
	/*
	   # 정수 타입
	   
	    - byte  (1byte, 8bit)
	      2^8(256)가지의 값을 표현할 수 있다
	      -128 ~ -1 / 0 ~ 127
	      
	    - short (2byte, 16bit)
	      2^16(65536)가지의 값을 표현할 수 있다
	      -32768 ~ -1 / 0 ~ 32767
	      
	    - char  (2byte, 16bit, 양수만)
	      0~65535 까지의 값을 사용할 수 있다 (65536가지의 양수 값)
	      
	    - int   (4byte, 32bit)
	      -2147483648 ~ -1 / 0 ~ 2147483647
	      
	    - long  (8byte, 64bit)
	      -9223372036854775808 ~ -1 / 0 ~ 9223372036854775807
	    
	   
	   # 실수 타입
	   
	    - 부동 소수점 방식을 이용한다
	    - float		(4byte)
	    - double 	(8byte)
	   
	   # 참/거짓 타입
	   
	   - boolean
	   
	   # 문자열
	   
	   - String
	   
	 */
	
	
	public static void main(String[] args) {
		
		byte byte_min = -128, byte_max = 127;
        
		System.out.println("byte min : " + Byte.MIN_VALUE + ", byte max: " + Byte.MAX_VALUE); 
		
		short short_min = -32768, short_max = 32767;
	
		System.out.println("short min : " + Short.MIN_VALUE + ", short max: " + Short.MAX_VALUE);
		
		int int_min = -2147483648, int_max = 2147483647;
		
		System.out.println("int min : " + Integer.MIN_VALUE + ", int max: " + Integer.MAX_VALUE);
		
		long long_min = -9223372036854775808L, long_max = 9223372036854775807L;
		
		System.out.println("long min : " + Long.MIN_VALUE + ", long max : " + Long.MAX_VALUE); 
		
		// 타입이름.MIN_VALUE / MAX_VALUE
		


		
		// AC00 -> 44032
		
		// char 타입에 넣는 정수값은 우리에게 보여줄때 문자로 바꿔서 보여준다
		char ch1 = 44032;
        int num1 = 44032;
        
        // ''(문자)도 실제로는 정수 값을 가지고 있다
        char ch2 = 'F'; 
        char ch3 = '값'; 
        
        // 문자 타입 리터럴은 실제로 정수값이기 때문에 다른 정수타입에도 저장할 수 있다
        int num2 = 'F';
        int num3 = '값';
        
        // 숫자 타입에 저장한 문자 리터럴을 출력하면 해당 문자의 실제 값을 확인할 수 있다
		System.out.println(ch1);
		System.out.println(num1);
		System.out.println(num2);
		System.out.println(num3);
		
		// ASCII 코드 : 0 ~ 127번까지의 코드
		char ch4 = 65;
		
		System.out.println(ch4);
		
		// 그냥 소수만 적는 것은 double 타입이기 때문에
		// float에 저장하려고 할 때는 F를 붙여 크기를 줄여줘야 한다
		float avg_score = 96.8F;
		double avg_weight = 85.9999; // double은 그냥 적어도 된다
		
		System.out.println("평균 점수 :" + avg_score);
		System.out.println("평균 몸무게: " + avg_weight);
		
		//boolean 타입은 변수의 이름이 아주 중요하다
		boolean isMale = true;
		boolean goonpil = true;
		boolean rich = false;
		boolean powerOn = true;
		
		// 문자열
		String welcomeMessage = "어서오세요 환영합니다!!";
		System.out.println(welcomeMessage);

		
   }
}
