
public class D04_WrapperClass {
	
	/*
	  	# Wrapper Class
	  
	 	- 각 기본형 타입에 대응하는 참조형 타입
	 	- 각 기본형 타입에 관련된 유용한 기능들이 추가되어 있다
	 	
	 	 # 기본형
	 	 
	 	 - boolean, byte, char, short, int, long, float, double
	 	 
	 	 # 참조형
	 	 
	 	 - Boolean, Byte, Character, Short, Integer, Long, Float, Double
	 */
	
	public static void main(String[] args) {
		
		/*
		  	# Parsing
		  	
		  	- 문자열 데이터를 해당 타입 값으로 변환하는 것
		  	- 각 타입마다 parseXXX 메서드가 존재한다
		 */
		String v1 = "1234";
		String v2 = "AF00";
		String v3 = "1001011";
		
		Integer i1 = Integer.parseInt(v1);
		Integer i2 = Integer.parseInt(v2, 16); // 원하는 진법 문자열도 값으로 해석
		Integer i3 = Integer.parseInt(v3, 2);
		
		short s1 = Short.parseShort(v1);
		Boolean b1 = Boolean.parseBoolean("true");
		
		System.out.println(i1);
		System.out.printf("10진수: %d, 16진수: %x\n",i2, i2);
		
		System.out.println(s1);
		System.out.println(b1);
		
		/* 
		 	# toString
		 	- 각 WrapperClass의 toString()은 해당 타입의 값을 문자열로 변환하는
		 	  기능을 가지고 있다
		 	- 인스턴스 메서드 toString()은 해당 일러스트를 문자열로 변환한다
		 	- 스태틱 메서드 toString()은 전달하는 값을 문자열로 변환한다.
		 */
		Integer num1 = 10;
		Integer num2 = 5234213;
		
		String numStr1 = num1.toString();
		String numStr2 = Integer.toString(1234);
		String numStr3 = Integer.toString(num2, 16);
		String numStr4 = Integer.toString(num2, 2);
		String numStr5 = Integer.toHexString(num2); // toString(v, 16)
		String numStr6 = Integer.toBinaryString(num2); // toString(v, 2)
		String numStr7 = Integer.toOctalString(num2); // toString(v, 8)
		
		String doubleStr = Double.toHexString(123.12345677);
		
		System.out.println(numStr1);
		System.out.println("" + num1);
		System.out.println(numStr2);
		System.out.println(numStr3);
		System.out.println(numStr4);
		System.out.println(doubleStr);
		
		// 각 타입의 상수들
		System.out.println(Integer.MAX_VALUE);
		System.out.println(Integer.MIN_VALUE);
		System.out.println(Double.MAX_VALUE);
		System.out.println(Double.MIN_VALUE);
		System.out.println(Long.MAX_VALUE);
		
		// 각 타입의 바이트를 저장해놓은 상수
		System.out.println(Short.BYTES);
		System.out.println(Integer.BYTES);
		System.out.println(Long.BYTES);
		
		// 각 타입의 비트 크기를 저장해놓은 상수 (byte * 8)
		System.out.println(Short.SIZE);
		System.out.println(Integer.SIZE);
		
		
		// Character 타입의 기능들
		
		System.out.println("숫자인가요? " + Character.isDigit('a'));
		System.out.println("언어 문자인가요? " + Character.isAlphabetic('['));
		System.out.println("언어 문자인가요? " + Character.isAlphabetic('김'));
		System.out.println("언어 문자인가요? " + Character.isAlphabetic('A'));
		System.out.println("대문자인가요? " + Character.isUpperCase('a'));
		System.out.println("소문자인가요? " + Character.isLowerCase('a'));
		System.out.println("공백인가요? " + Character.isWhitespace('\t'));
		System.out.println("공백인가요? " + Character.isWhitespace(' '));
		System.out.println("공백인가요? " + Character.isWhitespace('\n'));
		
		// 자바 변수 첫 번째 글자로 사용할 수 있나요?
		System.out.println(Character.isJavaIdentifierStart('7'));
		System.out.println(Character.isJavaIdentifierStart('a'));
		System.out.println(Character.isJavaIdentifierStart('_'));
		
		// 자바 변수의 몸통으로 사용할 수 있나요?
		System.out.println(Character.isJavaIdentifierPart('1'));
		System.out.println(Character.isJavaIdentifierPart(' '));
		System.out.println(Character.isJavaIdentifierPart('#'));
		} 
	
	

}
