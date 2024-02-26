package quiz;

import java.util.Scanner;

public class baekjoon_01 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int d1 = sc.nextInt();
		int d2 = sc.nextInt();
		int d3 = sc.nextInt();

		if (d1 == d2 && d2 == d3) {
			System.out.println(10000 + d1 * 1000);
		} else {
			// 3개의 눈이 다 같지는 않은 경우
			if (d1 == d2) {
				System.out.println(1000 + d1 * 100);
			} else if (d2 == d3) {
				System.out.println(1000 + d2 * 100);
			} else if (d1 == d3) {
				System.out.println(1000 + d1 * 100);
			} else {
				int max = d1;
				if (max < d2) {
					max = d2;
				}
				if (max < d3) {
					max = d3;
				}
				System.out.println(100 * max);
			}

		}
	}
}
