import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

public class D08_String {

	public static void main(String[] args) {
		
		String fruits = "apple/banana/orange/kiwi/blueberry";
		
		// "".split(delim) : 문자열을 원하는 기준으로 잘라서 문자열 배열로 만든다
		String[] fruitArr = fruits.split("/");
		
		System.out.println(Arrays.toString(fruitArr));
		
		// String.join(delim, iterable) 
		// : 모든 요소를 딜리미터로 이어붙인 하나의 문자열을 반환한다 
		// 	 iterable - 하나씩 꺼내 쓸 수 있는 모든 것 (배열, 리스트 등)
		Set<String> snackSet = new HashSet<>();
		
		snackSet.add("포카칩");
		snackSet.add("초코파이");
		snackSet.add("오감자");
		snackSet.add("오예스");
		
		String joinResult = String.join("++", fruitArr);
		String joinResult2 = String.join("--",snackSet);
		
		System.out.println("join 결과: " + joinResult);
		System.out.println("Set의 join 결과: " + joinResult2);
		
		// "".contains(CharSeq) : 해당 문자열에 전달한 문자열이 포함되어 있는지 확인한다
		System.out.println("초코파이".contains("초코"));
		System.out.println("초코하임".contains("초코"));
		System.out.println("화이트하임".contains("초코"));
		
		// "".startsWith(CharSeq) : 해당 문자열이 전달한 문자열로 시작하는지 확인한다
		// "".endsWith(CharSeq) : 해당 문자열이 전달한 문자열로 끝나는지 검사한다
		String url = "http://naver.com";
		
		System.out.println(url.startsWith("https://"));
		System.out.println(url.startsWith("ftp://"));
		
		System.out.println(url.endsWith(".co.kr"));
		System.out.println(url.endsWith(".com"));
		System.out.println(url.endsWith(".jpg"));
		
		// "".replace(old, new) : 문자열 내부에서 원하는 문자열을 교체한다
		String email = "minsu1234@naver.com";
		
		String replacedEmail = email.replace("naver","gmail");
		
		System.out.println("원본: " + email);
		System.out.println("수정본: " + replacedEmail);
		
		// "".subString(index) : 문자열을 해당 위치부터 마지막까지  자른 후 변환
		System.out.println(email.substring(3));
		
		// "".subString(beginIndex, endTrodex}
		// : 문자열을 시작 인덱스부터 끝나는 인덱스 전까지 자른 인스터스를 반환
		System.out.println(email.substring(0, 3));
		
		// "".indexOf(str) 
		// : 문자열에서 찾고자 하는 문자열의 위치를 찾아 반환한다
		// 	 만약 문자열을 못찾는 경우 -1을 반환
		System.out.println(fruits.indexOf("pineapple"));
		System.out.println(fruits.indexOf("kiwi"));
		System.out.println(fruits.charAt(20));
		
		System.out.println("이메일의 아이디 부분만 자르기: " +
				email.substring(0, email.indexOf('@')));
		System.out.println("이메일의 도메인 부분만 자르기: " +
				email.substring(email.indexOf('@') + 1));
		
		// "".trim() : 문자열 바깥쪽의 공백을 제거한다 (내부의 공백은 제거하지 않는다)
		String passwordAnswer = "abcd1234";
		String input1 = "   abcd1234 ";
		
		System.out.println(passwordAnswer.equals(input1));
		System.out.println(passwordAnswer.equals(input1.trim()));
		
		// "".toUpperCase() : 해당 문자열을 모두 대문자로 변환
		// "".toLowerCase() : 해당 문자열을 모두 소문자로 변환
		String message = "Hello, world!";
		
		System.out.println(message.toUpperCase());
		System.out.println(message.toLowerCase());
		
		// String.format(fmt, args) : 서식을 사용해 원하는 문자열을 생성할 수 있다
		String timeStr = String.format("%d:%d:%d", 14, 55, 33); 
		System.out.println(timeStr);
	}
}
