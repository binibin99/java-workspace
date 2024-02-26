package quiz;

import java.util.Scanner;

public class B06_checkDigit {

	/*
	 * 사용자가 숫자를 입력하면 해당 숫자가 몇 자리 숫자인지 알려주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("숫자를 입력해주세요 > ");
		
		int digit = 0;
		
		// 입력받은 숫자를 10씩 나눠서 몇 번 나눴는지 구하기
		for (int num = sc.nextInt(); num > 0; num /= 10) {
			System.out.printf("%d번째 나누기: %d/n", digit++, num);
		
		
		System.out.println(digit + "자리 숫자입니다. ");
		
		//	int digit = 0;
		// 숫자를 10배씩 크게 만들면서 10을 몇번 곱했는지 세어서 알아내기
		// for (int compare = 1; compare < num; compare *= 10) {
		//	System.out.println("compare: " + compare);
		//	++digit;
		//}
		// System.out.println(digit + "자리 숫자 입니다. ");
		//for (int i = 0, count = 0; i < num; num *= 10) {
		//	++count;
		//			System.out.printf("%d자리 입니다. ",count );

			

					// if (num < 10) {
					// System.out.println("1자리 숫자 입니다. ");
					// } else if (num < 100) {
					// System.out.println("2자리 숫자 입니다. ");
					// } else if (num < 1000) {
					// System.out.println("3자리 숫자 입니다. ");
					// } else if (num < 10000) {
					// System.out.println("4자리 숫자 입니다. ");
					// } else if (num < 100000) {
					// System.out.println("5자리 숫자 입니다. ");
					// }

				}
			}
}
		
	

