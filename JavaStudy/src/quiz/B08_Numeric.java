package quiz;

import java.util.Scanner;

public class B08_Numeric {

	/*
	 * 사용자가 입력한 문자열이 모두 숫자로만 구성된 문자열인지 판별하는 프로그램을 만들어보세요
	 * 
	 * >> a1234 -> 모두 숫자인 문자열이 아닙니다
	 * 
	 * >> 4123532890 -> 모두 숫자인 문자열입니다.
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print(">> ");
		String str = sc.next();

		boolean onlyNumber = true;
		
		// 한 문자씩 검사하다가 숫자가 아니것이 발견되면 onlyNumber를 false로 바꾼다
		
		for (int i = 0; i < str.length(); ++i) {
			char ch = str.charAt(i);
			
			// (ch < '0' || ch > '9') {
			// onlyNumber = false;
			// break;
			onlyNumber = ch < '0' || ch > '9';
			
			if (!onlyNumber) {
				break;
			}
		}

		if (!onlyNumber) {
			System.out.println("숫자로만 이루어진 문자열입니다.");
		} else {
			System.out.println("숫자로만 이루어지지 않았습니다.");
		}

	}
}
