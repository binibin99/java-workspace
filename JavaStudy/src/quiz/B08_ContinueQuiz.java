package quiz;

public class B08_ContinueQuiz {

	/*
	 * 1. 600부터 800 사이에 있는 7의 배수를 모두 출력
	 * 
	 * 2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들을 모두 출력
	 * 
	 * 3. 출력헀던 모든 숫자들의 합을 출력
	 * 
	 */

	// 1. 600 부터 800사이에 있는 7의 배수를 모두 출력
	// for (int num = 600; num <= 800; ++num) {
	// if (num % 7 != 0) {
	// continue;
	// }
	// System.out.println(num);
	// total += i;
	// }
	public static void main(String[] args) {

		int total = 0;

		int i = 0;
		for (i = 600; i <= 800; ++i) {
			if (i % 7 == 0) {
				System.out.println(i);
			}
		}

		// 2. 1부터 200까지의 숫자 중 2의 배수도 아니고 3의 배수도 아닌 숫자들을 모두 출력
		// for (int num = 1; num <= 200; ++num) {
		// if (num % 2 == 0 || num % 3 == 0) {
		// continue;
		// }
		// System.out.println(num);
		// total += q;
		// }
		// System.out.println("총합 :" total);
		int q;
		for (q = 1; q <= 200; ++q) {
			if (q % 2 != 0) {
				if (q % 3 != 0) {
					System.out.println(q);
				}
			}

		}
	}
}
