package quiz;

import java.util.Random;

public class B14_RandomScores {

	/*
	 * 1. 100개의 랜덤 점수를 생성한다 (0 ~ 20000)
	 * 
	 * 2. 해당 점수들을 한 줄에 5개씩 보기좋게 출력한다
	 * 
	 * 3. 모든 점수들의 평균을 출력한다 (소수 셋째 자리에서 반올림)
	 * 
	 * 4. 가장 높은 점수와 가장 낮은 점수를 출력한다
	 */

	public static void main(String[] args) {

		// 300개의 정수를 담을 수 있는 배열을 생성한다
		int[] scores = new int[300];

		// 0 ~ 299번 방까지 숫자를 랜덤으로 채운다
		for (int i = 0; i < scores.length; ++i) {
			scores[i] = (int) (Math.random() * 20001);
		}

		// 총합 구하기
		int sum = 0;

		for (int i = 0; i < scores.length; ++i) {

			sum = +scores[i];

			// 콘솔에 출력하기 (5개마다 줄바꿈)
			System.out.print(scores[i] + "\t");
			if (i % 5 == 4) {
				System.out.println();
			}

		}

		System.out.println("----------------------------");
		System.out.println("총합: " + sum);
		System.out.printf("평균: %.2f\n", sum / (double)scores.length);

		// 제일 높은 점수와 제일 낮은 점수를 구한다
		// -> 첫 번째 점수로 초기화 해놓고 두 번째 점수부터 하나씩 비교한다
		int bestScore = scores[0];
		int worstScore = scores[0];

		for (int i = 0; i < scores.length; ++i) {
			// 현재 최고 점수보다 i번째 점수가 더 크다면 그 점수를 최고 점수로 바꾼다
			if (scores[i] > bestScore) {
				bestScore = scores[i];
			}

			// 현재 최저 점수보다 i번째 점수가 더 작다면 그 점수를 최저 점수로 바꾼다
			if (scores[i] < worstScore) {
				worstScore = scores[i];
			}

		}

		System.out.println("최고 점수: " + bestScore);
		// 최고 점수인 사람들을 모두 출력한다
		for (int i = 0; i < scores.length; ++i) {
			int score = scores[i];
			if (score == bestScore) {
				System.out.printf("%d번째 참가자[%d점]\n", i, score);

			}
		}
		System.out.println("최저 점수: " + worstScore);
		for (int i = 0; i < scores.length; ++i) {
			int score = scores[i];
			if (score == worstScore) {
				System.out.printf("%d번째 참가자[%d점]\n", i, score);
			}
		}
	}
}

		
	

