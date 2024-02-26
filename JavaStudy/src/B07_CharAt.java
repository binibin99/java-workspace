
public class B07_CharAt {
	/*
	 * # "문자열".charAt(index);
	  
	  - 해당 문자열에서 원하는 위치의 문자를 char타입으로 꺼내는 메서드
	  - 시작 인덱스는 0이다
	  - 마지막 인덱스는 해당 문자열의 '문자 개수 - 1'이다
	  
	  # "문자열".length();
	  
	  - 해당 문자열의 길이(문자 개수)를 알 수 있다
	  
	 */
	public static void main(String[] args) {
		char ch = "안녕하세요".charAt(0);

		System.out.println(ch);
		System.out.println("안녕하세요".charAt(1));
		System.out.println("안녕하세요".charAt(2));
		System.out.println("안녕하세요".charAt(3));
		System.out.println("안녕하세요".charAt(4));
		
		System.out.print("안녕하세요".charAt(4));
		System.out.print("안녕하세요".charAt(3));
		System.out.print("안녕하세요".charAt(2));
		System.out.print("안녕하세요".charAt(1));
		System.out.println(ch);
		
		String str = "마지막 인덱스는 해당 문자열의 '문자 개수 - 1' 이다";
		
		for (int index = str.length() -1; index >=0; --index) {
			System.out.print(str.charAt(index));
		}
		System.out.println();
		
		for (int i = 0; i < str.length(); ++i) {
			System.out.print(str.charAt(str.length() -1 -i));
		}
		System.out.println();
		

		// System.out.println("마지막 글자: " + str.charAt(str.length() - 1));
		
		// for문을 사용하면 문자열을 쉽게 탐색할 수 있다
		String text = "다람쥐 헌 쳇바퀴에 타고파";
		
		for (int i = 0; i < text.length(); ++i) {
			char c = text.charAt(i);
			System.out.printf("%d번째 문자: %c\n", i, c);
		}
		
		// 연습: 문자열 str을 거꾸로 출력해보세요
	}
}
