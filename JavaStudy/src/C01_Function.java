import quiz.C02_FunctionalUpdown;

public class C01_Function {

	/*
	 * # 함수 (Function)
	 * 
	 * - 기능을 미리 정의해두고 나중에 불러다 쓰는 것 - 함수는 정의한 시정에서는 실행되지 않고 나중에 호출해야 실행된다 - 나중에 재사용 할
	 * 가능성이 있는 코드들을 함수로 만들어두면 작업의 반복을 줄일 수 있다 (프로그래머의 생산성이 올라간다) - 클래스 내부에 있는 함수는
	 * 메서드(method)라고 부른다
	 * 
	 * # 함수의 매개변수 (argument)
	 * 
	 * - 함수를 호출할 때 해당 함수에 전달할 수 있도록 선언해놓는 변수 - 함수를 호출할 때 ()에 전달하는 값을 인자라고 한다 - 함수를
	 * 정의할 때 ()에 선언하는 인자를 받을 수 있는 변수를 매개변수라고 한다 - 매개변수의 개수에는 제한이 없다 
	 * - 매개변수 타입에 ...을 쓰면 해당 타입 인자를 무한대로 받을 수 있다
	 * 
	 * # 함수의 타입 (리턴 타입)
	 * 
	 * - 해당 함수의 실행 결과 얻을 수 있는 결과의 타입을 지정해놓을 수 있다
	 * - void : 이 함수는 실행 결과로 아무것도 얻을 수 없습니다
	 * - 그 외 타입들: 함수를 실행하면 해당 타입 값을 반드시 돌려줍니다
	 * - return : 해당 함수를 즉시 종료하고 함수를 호출한 곳으로 값을 보냄
	 */
	
	/** 
	 	사과의 개수와 바구니의 크기를 입력하면 필요한 바구니의 개수를
	 	콘솔(System.in)에 출력해주는 함수입니다.
	 	
	  	@param apple - 사과의 개수를 입력 (0 이상)
	  	@param size - 바구니의 크기를 입력 (1 이상)
	 */
	public static void howManyBasket(int apple, int size) {
		if (apple % size == 0) {
			System.out.println("필요한 바구니 개수: " + apple / size);
		} else {
			System.out.println("필요한 바구니 개수: " + (apple / size + 1));
		}
	}
	
	public static String getBasketMessage(int appleCount) {
		if (appleCount % 10 == 0) {
			return "사과의 개수가 나누어 떨어집니다";
		} else {
			return "사과의 개수가 나누어 떨어지지 않습니다";
		}
	}
	public static int getBasket(int appleCount) {
		if (appleCount % 10 == 0) {
			return appleCount / 10;
		} else {
			return appleCount / 10 + 1;
		}
	}
	
	public static void minus(int... num) {
		// ...으로 선언한 매개변수는 배열이 된다
		for (int i = 0; i < num.length; ++i) {
			System.out.println("빼야하는 수 : " + num[i]);
		}
	}

	public static void plusALL(int... num) {
		int sum = 0;
		for (int i = 0; i < num.length; ++i) {
			sum += num[i];
		}
		System.out.println("총합은 " + sum + "입니다.");
	}

	public static void plus(int a, int b) {
		System.out.println(a + b);
	}

	public static void rabbit() {
		System.out.println(" /)/)");
		System.out.println("(  ..)");
		System.out.println("(  >$");
	}

	public static void main(String[] args) {
		minus(1, 2, 3, 4, 5, 6);
		minus(100);

		plusALL(10, 20, 30, 40);
		plusALL(99, 33, 1, 55);
		
		int basket = getBasket(15);
		
		System.out.println("바구니의 개수: " + basket);
		
		int start = 50;
		int end = 200;
		
		System.out.println((int)(Math.random() * (end - start + 1) + start));
		System.out.println((int)(Math.random() * 100 + 50));
		System.out.println(C02_FunctionalUpdown.getWinNum(1200, 1000));
		
	}
}
