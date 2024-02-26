package quiz;

import java.util.Scanner;

public class B07_CountE {

	/*
	 * 사용자가 문장을 입력하면 해당 문장에 알파벳 e가 몇번 등장했는지 
	 * 알려주는 프로그램을 만들어보세요 
	 * (대/소문자 모두 세어야함)
	 */
	public static void main(String[] args) {

		System.out.print("문장을 입력해주세요 > ");
		String str = new Scanner(System.in).nextLine();
		
		int count = 0;
		
		// 문장 전체를 반복하면서
		for (int i = 0; i < str.length(); ++i) {
			// 문자를 하나 꺼내고
			char ch = str.charAt(i);
			
			// 해당 문자가 'e' 또는 'E'일때만 개수가 증가
			//char (ch == 'e' || ch == 'E')
			if (ch == 'e') {
				count++;
			} else if (ch == 'E') {
				count++;
			} 		
		}
		System.out.printf("e 또는 E의 개수는 %d\n",count);

	}

}
