package quiz;

import java.util.Random;

public class B12_TempPassword {
	
	/* 
	 	4자리 랜덤 알파벳 대문자로 구성된 비밀번호를 생성하여 출력하는
	 	프로그램을 만들어보세요
	 	
	 	// 숫자의 개수 구하기 (최대 - 최소 + 1)
	 	
	 */
	public static void main(String[] args) {
		
	
		for (char i = 0; i < 4; ++i) {
			System.out.print((char)(Math.random()* 26 + 65));
		}
		System.out.println();
	}

}
