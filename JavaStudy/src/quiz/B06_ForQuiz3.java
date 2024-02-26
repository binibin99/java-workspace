package quiz;

public class B06_ForQuiz3 {
	/*
	 * # for문을 사용해 숫자를 다음과 같이 출력해보세요
	 * 
	 * 1. 0 3 6 9 12 ... 93 96 99
	 * 
	 * 2. -35 -28 -21 ... 0 7 14 ... 35
	 * 
	 * 3. 100 200 300 ... 800 900 1000
	 * 
	 * 4. 100 99 98 ... 5 4 3 2 1 0
	 * 
	 * 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ... (30번)
	 * 
	 * 6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
	 * 
	 * 7. 7 77 777 7777 77777 .... 7777777777
	 */

	public static void main(String[] args) {

		// 1. 0 3 6 9 12 ... 93 96 99
		for (int i = 0; i <= 99; i += 3) {
			System.out.println(i + " ");
		}
		System.out.println();
		// 2. -35 -28 -21 ... 0 7 14 ... 35
		for (int i = -35; i <= 35; i += 7) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 3. 100 200 300 ... 800 900 1000
		for (int i = 100; i <= 1000; i += 100) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 4. 100 99 98 ... 5 4 3 2 1 0
		for (int i = 100; i >= 0; --i) {
			System.out.print(i + " ");
		}
		System.out.println();

		// 5. 0 1 2 3 ... 6 7 8 9 0 1 2 3 ... 7 8 9 ... (30번)
		for (int i = 0; i < 100; ++i) {
			System.out.print(i % 10 + " ");
		}

		// 6. 10 9 8 7 ... 3 2 1 10 9 8 ... 3 2 1 10 9 ... (30번)
		for (int i = 0; i < 300; ++i) {
			System.out.print(10 - (i % 10) + " ");
		}
		System.out.println();

		// 7. 7 77 777 7777 77777 .... 7777777777
		long num = 7;
		for (int i = 0; i < 10; ++i) {
			System.out.print(num + " ");
			num = num * 10 + 7;
		}
	}
}
//		int num_1;
//		int count = 0;
//		for (num_1 = 0; num_1 <= 100; ++num_1) {
//			if (num_1 % 3 == 0) {
//				System.out.print(num_1 + " ");
//				++count;
//			}
//		}
//	}
//
//	{ 
//		int num_2;
//		int count_2 = 0;
//		for (num_2 = -35; num_2 <= 35; num_2 +=7) {
//			if (num_2 % 7 == 0) {
//				System.out.print(num_2 + " ");
//				++count_2;
//			}
//		}
//	}
//
//	{
//		int num_3;
//		int count_3 = 0;
//		for (num_3 = 100; num_3 <= 1000; num_3 +=100) {
//			System.out.print(num_3 + " ");
//			++count_3;
//		}
//	}
//
//	{ 
//		int num_4;
//		int count_4 = 0;
//		for (num_4 = 100; num_4 >= 0; num_4 -=1) {
//			System.out.print(num_4 + " ");
//			++count_4;
//		}
//	}
//	
//	{  
//		int num_5;
//		int count_5 = 0;
//		for (num_5 = 0; num_5 <= 30; num_5 +=1) {
//			System.out.print(num_5 + " ");
//			++count_5;
//			
//			
//		}
//	}
//}
