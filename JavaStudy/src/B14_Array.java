
public class B14_Array {
	
	/*
	 	# 배열 (Array)
	 	
	 	- 같은 타입 변수를 여러개 선언하고 싶을 때 사용하는 문법
	  	- 배열을 선언할 때 선언과 동시에 배열의 크기를 정해야 한다	 
	  	- 배열은 만들어지고 난 후에는 크기 변경이 불가능하다
	  	- 배열은 각 변수를 방 번호(index)를 통해 구분한다 
	  	- 배열의 인덱스는 0번부터 개수 길이 -1번 까지 있다
	  	- 배열은 변수와는 다르게 각 방의 모든 값이 자동으로 초기화 되어있다
	  		(정수: 0, 실수: 0.0, boolean: false, 참조형: null)
	  	
	  	# 배열 선언 방식
	  	
	  	1. 타입[] 변수명 = new 타입[크기];
	  	2. 타입[] 변수명 = { 값1, 값2, 값3, ... };
	  	3. 타입[] 변수명 = new 타입[] { 값1, 값2, 값3, ... }; 
	 */
	public static void main(String[] args) {
		
		// 변수는 초기화 하지 않는 상태로 사용할 수 없다
		// double avg; 
		// System.out.println(avg);
		
		// 배열은 초기화가 자동으로 되어있다
		double[] weights = new double[30];
		System.out.println(weights[15]);
		
		// 대문자로 시작하는 타입들은 null로 초기화 되어있다
		String[] schools = new String[13];
		System.out.println(schools[3]);
		
		// char[]은 하나의 문자열이라고 간주할 수 있다
		char[] message = {'H','e','l','l','o','!',' ','w'};
		String[] names = {"김철수", "박철수", "추철수", "이철수"};
		float[] heights = {123.123F, 99.F, 80.22F, 33.33F};
		boolean[] passExam = new boolean[] {true, false, true};
		
		// int형 변수 1000개 선언 (int형 배열 선언)
		int[] numbers = new int[1000];
		
		// int형 변수 1000개 중 몇 번 변수를 사용할 것인지 선택해 사용한다
		// 배열의 한 방에 변수 저장하기
		numbers[0] = 10;
		numbers[399] = 8500;
		numbers[999] = -999;
		// 배열 방 번호의 범위를 벗어나는 실수는 컴파일러에서 감지하지 못한다
		// (빨간줄이 안나온다, 실행시 ArrayIndexOutofBoundsEWxception 발생)
		// numbers[1000] = 777;
		
		// 배열에 저장되어 있는 값을 꺼내 사용하기
		System.out.println(numbers[999]);
		System.out.println(numbers[0] + numbers[399]);
		System.out.println("아직 값을 넣은적 없는 곳: " + numbers[30]);
		
		
		// 반복문으로 배열의 모든 내용을 쉽게 사용할 수 있다
		
		// 배열.length : 해당 배열의 길이를 알 수 있다 ()를 붙이면 안된다
		// "".length() : 문자열의 길이를 알 때는 괄호를 붙였었다
		String[] fruits = {"apple", "banana", 
				"orange", "kiwi", "watermelon", "grape"};
		
		for (int i = 0; i < fruits.length; ++i) {
			System.out.println(fruits[i]);
			
		}
		
		
	}
}
