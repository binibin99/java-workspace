import java.util.Random;

public class B12_Random {

	/*
	 * # 무작위 숫자 생성하기
	 * 
	 * 1. jave.util.Random 클래스 사용하기
	 * 
	 * 2. Mate.random() 메서드 사용하기
	 */
	public static void main(String[] args) {

		// 랜덤 번호 생성기를 하나 생성
		Random ran = new Random(); // Ctrl + Shift + O

		// 생성기에서 번호 하나 받아오기
		int num1 = ran.nextInt(); // int의 전 범위
		int num2 = ran.nextInt(10); // 0 ~ 9
		int num3 = ran.nextInt(100); // 0 ~ 99
		int num4 = ran.nextInt(201) + 100; // 100 ~ 300
		int num5 = ran.nextInt(81) - 50; // -50 ~+30

		System.out.println("랜덤 번호1: " + num1);
		System.out.println("랜덤 번호2: " + num2);
		System.out.println("랜덤 번호3: " + num3);
		System.out.println("랜덤 번호3: " + num4);
		System.out.println("랜덤 번호3: " + num5);

		// Math.random(): 0 <= x < 1 랜덤 실수를 생성하는 메서드
		for (int i = 0; i < 5; ++i) {
			// 50 ~70
			System.out.println((int)(Math.random() * 21) + 50);
		}

		/*
		 * # Math.random()으로 원하는 범위의 랜덤 숫자 만들기
		 * 
		 * <step 1> 0 <= x < 1
		 * 
		 * (1) 원하는 숫자의 개수를 곱한다 (bound 역할) <step 2> 0 <= x < 21
		 * 
		 * (2) 곱한 결과를 int로 변환한다 (소수점 아래 삭제)
		 * 
		 * 
		 * (3) 더하거나 빼서 원하는 범위로 만든다 <step 3> 50 <= x < 71
		 */

		// 연습문제 : 100 ~127의 랜덤 정수를 10개 출력해보세요
		for (int i= 0; i < 10; ++i)
			System.out.println((int)(Math.random() * 28) + 100); 

	}

}
