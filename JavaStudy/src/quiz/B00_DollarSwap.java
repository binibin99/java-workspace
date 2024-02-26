package quiz;

import java.util.Scanner;

public class B00_DollarSwap {
	
	/*
	   한국 돈을 입력하면 현재 환율로 몇 달러인지 알려주는 프로그램을 만들어보세요.
	   (현재 환율은 검색해서 사용할 것)
	 */
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("금액을 입력해주세요 : ");
		
		int krw = sc.nextInt();
		double exchange_rate = 1332.74;
		
		// 한국돈으로 달러 구하는 법 (한국돈 / 환율 = 달러)
		
		double usd = krw / exchange_rate;
		
		System.out.printf("%dKRW은 %.2fUSD입니다.\n", krw, usd);
		
	
		
		
		
	    //1330.30
		
	
		
	}

}
