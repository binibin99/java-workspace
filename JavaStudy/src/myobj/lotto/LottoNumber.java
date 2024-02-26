package myobj.lotto;

import java.util.Arrays;

public class LottoNumber {

	// ※ 해당 메서드에서 this를 사용할 예정이라면 static을 사용하지 않는다

	// 당첨 번호는 7개, 뽑는 번호는 6개
	int[] numbers;
	
	// 내가 고른 int[]을 전달하면 인스턴스가 생성됌
	public LottoNumber(int[] numbers) {
		this.numbers = numbers;
	}
	
	// 당첨 번호인지 자동 번호인지 선택하면 자동번호가 들어간 인스턴스가 생성됨
	public LottoNumber(boolean winNum) {
		if (winNum) {
			numbers = new int[7];
		} else {
			numbers = new int[6];
		}

		generate();
	}

	public int getRandomNumber() {
		return (int) (Math.random() * 45 + 1);
	}

	// 현재 인스턴스의 numbers 배열을 중복없는 랜덤 숫자로 가득 채움
	public void generate() {
		int len = numbers.length;

		for (int i = 0; i < len; ++i) {
			numbers[i] = getRandomNumber();

			for (int j = 0; j < i; ++j) {
				if (numbers[i] == numbers[j]) {
					--i;
					break;
				}
			}
		}
	}

	public int check(LottoNumber winNum) {
		int winLen = winNum.numbers.length;
		int guessLen = this.numbers.length;

		int winCount = 0;
		boolean hasBonus = false;

		if (winLen != 7) {
			return -1;
		}
		for (int i = 0; i < guessLen; ++i) {
			for (int j = 0; j < winLen; ++j) {
				if (this.numbers[i] == winNum.numbers[j]) {
					++winCount;
					
					// 당첨 번호의 마지막 번호와 일치한다면 bonus번호를 맞춘 것
					if (!hasBonus && j == winLen - 1) {
						hasBonus = true;
					}
					
					break;
				}
			}
		}
		
		if (winCount == 6) {
			if (hasBonus) {
				return 2;
			} else {
				return 1;
			}
		}
		
		// 보너스 번호를 가지고 있다면 맞춘 번호를 1 뺀다
		winCount = hasBonus ? winCount  -1 : winCount;
		
		if (winCount == 5) {
			return 3; // 3등
		} else if (winCount == 4) {
			return 4; // 4등
		} else if (winCount == 3) {
			return 5; // 5등
		} else {
			return 0; // 당첨안됨
		}

	}

	public void print() {
		System.out.println(Arrays.toString(numbers));
	}
}
