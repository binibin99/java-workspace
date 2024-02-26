package quiz;

import java.util.Scanner;

public class B00_AgeCalculator {

	/*
	   사용자가 태어난 해를 입력하면 그 사람의 한국 나이를 알려주는 프로그램을 만들어보세요
	 */
	public static void main(String [] args) {
		
		Scanner sc = new Scanner(System.in);
		
		System.out.print("태어난 해를 입력해주세요 > ");
		
		int birthYear = sc.nextInt();
		int thisYear = 2023;
		
		int age = thisYear - birthYear + 1;
		
		System.out.println("태어난 해: " + birthYear);
		
		System.out.printf("당신의 나이는 %d살 입니다.\n", age);
		
		
		

		
		
		
		
		
	}
}
