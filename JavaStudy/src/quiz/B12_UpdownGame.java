package quiz;

import java.util.Random;
import java.util.Scanner;

public class B12_UpdownGame {

	/*
	 	# Updown 게임 만들기
	  
	  	1. 게임이 시작되면 1 ~ 100 사이의 랜덤 숫자를 정답으로 선택한다 (사용자에게는 비밀로 한다)
	  
	 	2. 사용자가 숫자를 입력하면 UP인지 DOWN인지 정답인지 알려준다
	  
	  	3. 정답이 입력한 숫자보다 크다면 사용자에게 UP이라고 알려준다
	  	 	정답이 입력한 숫자보다 작다면 사용자에게 DOWN이라고 알려준다
	  	 	정답이 입력한 숫자와 일치하면 정답이라고 알려준 후 플레이어가 승리한다
	  
	  	4. 5번안에 못 맞추면 정답이 뭐였는지 알려주고 플레이어의 패배로 프로그램을 종료한다
	  	
	  	5. 정답을 맞추면 몇 번만에 맞첬는지 알려주고 프로그램을 종료한다
	  
	 */


	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.println("게임이 시작됩니다. ");
		
		Random ran = new Random();
		final int num1 = ran.nextInt(101);
		
		System.out.print("0 ~ 100 까지의 숫자를 입력해주세요 > ");
		int num2 = sc.nextInt();
		
		if (num2 == num1) {
			System.out.println("정답입니다. 1번만에 맞추셨습니다.");
			
		} else if (num2 > num1) {
			System.out.println("Down");
		} else if (num2 < num1) {
			System.out.println("Up");
		}
		
		System.out.print("4번남았습니다\n다시 입력해주세요 > ");
		int num3 = sc.nextInt();
		
		if (num3 == num1) {
			System.out.println("정답입니다. 2번만에 맞추셨습니다.");
		} else if (num3 > num1) {
			System.out.println("Down");
		} else if (num3 < num1) {
			System.out.println("Up");
		}
		
		System.out.print("3번남았습니다\n다시 입력해주세요 > ");
		int num4 = sc.nextInt();
		
		if (num4 == num1) {
			System.out.println("정답입니다.3번만에 맞추셨습니다.");
		} else if (num4 > num1) {
			System.out.println("Down");
		} else if (num4 < num1) {
			System.out.println("Up");
		}
		
		System.out.print("2번남았습니다\n다시 입력해주세요 > ");
		int num5 = sc.nextInt();
		
		if (num5 == num1) {
			System.out.println("정답입니다.4번만에 맞추셨습니다. " );
		} else if (num5 > num1) {
			System.out.println("Down");
		} else if (num5 < num1) {
			System.out.println("Up");
		}
		
		System.out.print("1번남았습니다\n다시 입력해주세요 > ");
		int num6 = sc.nextInt();
		
		if (num6 == num1) {
			System.out.println("정답입니다.5번만에 맞추셨습니다. ");
		} else if (num6 > num1) {
			System.out.println("Down");
		} else if (num6 < num1) {
			System.out.println("Up");
		}
		
		
		
		System.out.printf("=Game Over=\n정답은 %d 입니다",num1);
	
		
	}
}