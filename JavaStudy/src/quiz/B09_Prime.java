package quiz;

import java.util.Scanner;

public class B09_Prime {

	/*
	 * 사용자가 정수를 입력하면 1부터 입력한 정수 사이에 있는 모든 소수를 출력해보세요
	 * 
	 * 소수 (prime) : 나누어 떨어지는 수가 1과 자기 자신밖에 없는 수
	 * 
	 */
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("정수를 입력해주세요 >");
		int num = sc.nextInt();

		for (int i = 2; i <= num; ++i) {
			boolean isPrime = true;
		

			// 이번 숫자 i에 대한 약수 개수 검사
			// 	(1) 약수가 2개인지 검사하기
			//  (2) 2부터 i-1에 약수가 존재하면 소수가 아님
			//	(3) 2부터 루트i까지 약수가 존재하면 소수가 아님
			for (int chk = 2; chk <= Math.sqrt(i); ++chk) {
				if (i % chk == 0) {
					isPrime = false;
					break;
				}
			}
			// 검사가 끝났을때 약수가 2개라면 소수

			// System.out.printf("%d는 소수인가요? %s\n", i, count==2);
			if (isPrime) {
				System.out.print(i + " ");
			}

		}
	}

}
