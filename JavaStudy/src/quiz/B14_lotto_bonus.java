package quiz;

import java.util.Arrays;
import java.util.Scanner;

public class B14_lotto_bonus {

	public static void main(String[] args) {

		int[] winNums = new int[7];
		int playCnt = 0;
		int firstResult = 0;
		int secondResult = 0;
		int thirdResult = 0;
		int fourthResult = 0;
		int fifthResult = 0;
		int i = 0;
		int len = winNums.length;
		
		Scanner sc = new Scanner(System.in);

		System.out.println("입력횟수를 입력해주세요 : ");
		int sc25 = sc.nextInt();

		while (i < len) {
			winNums[i] = (int) (Math.random() * 45 + 1);

			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true;
					break;
				}
				++j;
			}
			if (!duplicate) {
				++i;
			}
		}
		for (i = 0; i < len; ++i) {
			System.out.printf("winNums[%d]: %d\n", i, winNums[i]);
		}

		while (playCnt != sc25) {

			int[] userNums = new int[6];
			i = 0;
			len = userNums.length;
			while (i < len) {
				userNums[i] = (int) (Math.random() * 45 + 1);

				int j = 0;
				boolean duplicate = false;
				while (j < i) {
					if (userNums[j] == userNums[i]) {
						duplicate = true;
						break;
					}
					++j;
				}
				if (!duplicate) {
					++i;
				}
			}
			++playCnt;
			System.out.println("현재 " + playCnt + "회 입니다");

			boolean hasBonusNum = false;
			int winCount = 0;

			for (int userIndex = 0; userIndex < userNums.length; ++userIndex) {
				for (int winIndex = 0; winIndex < winNums.length; ++winIndex) {
					if (userNums[userIndex] == winNums[winIndex]) {
						if (winIndex == 6) {
							hasBonusNum = true;
						}
						++winCount;
					}
				}
			}

			if (winCount == 6) {
				System.out.printf("당첨번호 : %s\n내 번호 : %s\n", Arrays.toString(winNums), Arrays.toString(userNums));

				if (hasBonusNum) {
					System.out.println("2등입니다!(" + playCnt + "회)");
					secondResult++;
				} else {
					System.out.println(playCnt + "회 만에 1등입니다!");
					firstResult++;
				}
			} else if (winCount == 5) {
				System.out.println("3등");
				thirdResult++;
			} else if (winCount == 4) {
				System.out.println("4등");
				fourthResult++;
			} else if (winCount == 3) {
				System.out.println("5등");
				fifthResult++;

			}
			System.out.println("1등은" + firstResult + "회 입니다");
			System.out.println("2등은" + secondResult + "회 입니다");
			System.out.println("3등은" + thirdResult + "회 입니다");
			System.out.println("4등은" + fourthResult + "회 입니다");
			System.out.println("5등은" + fifthResult + "회 입니다");
			
			System.out.println("총 횟수는 " + playCnt + "회 입니다");
			
			System.out.println("프로그램을 종료합니다...");
		}
	

	}
}