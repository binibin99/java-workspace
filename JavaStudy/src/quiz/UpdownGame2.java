package quiz;

import java.util.Random;
import java.util.Scanner;

public class UpdownGame2 {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.println("게임이 시작됩니다. ");

		Random ran = new Random();
		final int num1 = ran.nextInt(101);

		int life = 5;
		int count = 0; // 횟수
		for (int num3 = 0; num3 < 5; ++num3) {
			System.out.print("숫자를 입력해주세요 > ");
			int num2 = sc.nextInt();
			
			if (num2 > 100 || num2 < 1) {
				System.out.println("제대로 입력해주세요.");
				continue;
			}
			if (num2 == num1) {
				System.out.printf("정답입니다 . %d번만에 맞추셨습니다. ", count);
				break;
			} else if (num2 < num1) {
				System.out.print("Up");
				count++;
			} else if (num2 > num1) {
				System.out.print("down");
				count++;
			}
			System.out.printf("\n남은기회! %d번\n",--life);
			
			
		}
		System.out.printf("\n\n★게임 끝★\n정답: %d ",num1);
	}

}

