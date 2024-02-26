package quiz;

import java.util.Scanner;

public class B14_ShuffleText {
	/*
	 * 사용자로부터 문자열을 입력 받으면 해당 단어를 랜덤으로 섞어주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);
		System.out.print("문자열을 입력해 주세요: ");
		String str = sc.nextLine();
		// 문자열 길이 크기의 char[]로 변환
		char[] chs = new char[str.length()];
		for (int i = 0; i < str.length(); ++i) {
			chs[i] = str.charAt(i);
		}
		// 랜덤 위치의 두 문자의 순서를 계속 바꾼다
		for (int i = 0; i < 100; ++i) {
			// 문자열 길이가 12일때 1~11까지의 랜덤 인덱스 생성
			int ran = (int) (Math.random() * (chs.length - 1) + 1);
			// 맨 앞의 문자와 랜덤 위치의 문자를 교환한다
			char temp = chs[0];
			chs[0] = chs[ran];
			chs[ran] = temp;
		}
		System.out.println(chs);

	}
}