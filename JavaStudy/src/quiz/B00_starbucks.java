package quiz;

import java.util.Scanner;

public class B00_starbucks {
	
	/*
	  커피 3개의 개수를 입력받고
	  각 메뉴를 몇 잔 시켰는지와
	  총 가격은 얼마인지 출력해주는 프로그램을 만들어보세요
	   아메리카노 1600원
	   카페라떼  2700원
	   카페모카  3300원 
	 
	 */

	public static void main(String[] agrs) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.println("아메리카노의 개수를 입력해주세요 >");
		int AMERICANO = sc.nextInt();
		int AMERICANO_0 = 1600;
		int AMERICANO_1 = AMERICANO * AMERICANO_0;
		
		System.out.println("카페라떼의 개수를 입력해주세요 >");
		int CAFELATTE = sc.nextInt();
		int CAFELATTE_0 = 2700;
		int CAFELATTE_1 = CAFELATTE * CAFELATTE_0;
		
		System.out.println("카페모카의 개수를 입력해주세요 >");
		int CAFEMOCHA = sc.nextInt();
		int CAFEMOCHA_0 = 3300;
		int CAFEMOCHA_1 = CAFEMOCHA * CAFEMOCHA_0;
		
		int result = AMERICANO_1 + CAFELATTE_1 + CAFELATTE_1;
		

		System.out.printf("커피의 총 가격은 %d원 입니다\n", result);
		
		String format= "아메리카노 - %d잔\n"
				+	   "카페라뗴 - %d잔\n"
				+	   "카페모카 - %d잔\n"
				+      "---------------\n"
				+      "총합\t\t%d원\n";
		
		int totalPrice = AMERICANO * AMERICANO_0
				 + CAFELATTE * CAFELATTE_0
				 + CAFEMOCHA * CAFEMOCHA_0;
		
		System.out.printf(format, AMERICANO, CAFELATTE,
				CAFEMOCHA,totalPrice);
	}
}
