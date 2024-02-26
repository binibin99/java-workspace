package quiz;

import java.util.Scanner;

public class B02_ConditionQuiz2 {
	/*
	  # 알맞은 조건식을 만들어보세요
	   
	   1. char형 변수 a가 'q'또는 'Q'일 때 true
	   2. char형 변수 b가 공백이나 탭이 아닐 때 true
	   3. char형 변수 c가 '0' ~ '9'일 때 true
	   4. char형 변수 d가 영문자(대문자 또는 소문자)일 때 true
	   5. char형 변수 e가 한글일 때 true (한글의 범위는 유니코드 검색)
	   6. 사용자가 입력한 문자열이 quit일 때 true
	 */
	public static void main(String[] args) {
		
		char a = 'q';
		
		System.out.println(a == 'q' || a == 'Q');
		
		char b = ' ';
		
		System.out.println(b == ' ' || b == '\t');
		
		char c = '8';
		
		System.out.println('0' <= c == c <= '9');
		
		char d = 'A';
		
		System.out.println(d >= 'A' && d <= 'Z' || d >= 'a' && d <= 'z');
		
		char e = '가';
		
		System.out.println(e >= '가' && e <= '힣');
		
		//Scanner sc = new Scanneer(System.in);
		//String word = sc.next();
		//word.equals("quit");
				
		System.out.print("정말 나가시겠습니까? (quit) > ");
		System.out.println(new Scanner(System.in).next().equals("quit"));	;	
		// (일회용)
   }
	
}

