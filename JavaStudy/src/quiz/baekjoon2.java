package quiz;

import java.util.Scanner;

public class baekjoon2 {

	// 오븐 타이머
	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int hour = sc.nextInt();
		int min = sc.nextInt();
		int cooking = sc.nextInt();

		int endTime = hour * 60 + min + cooking;
		int endHour = endTime / 60;
		if (endHour >= 24) {
			endHour %= 24;
			int endMin = endTime % 60;

			System.out.println(endTime);
			System.out.println(endMin);

		}

	}
}
