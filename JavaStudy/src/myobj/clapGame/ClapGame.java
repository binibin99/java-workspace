package myobj.clapGame;

import java.util.Arrays;
import java.util.Scanner;

public class ClapGame {

	final int[] CLAP_NUMBERS;

	// String[] players = {"플레이어", "컴퓨터"};
	ClapGamePlayer[] players = { new ClapGamePlayer("플레이어"), new ClapGamePlayer("컴퓨터") };

	public ClapGame() {
		CLAP_NUMBERS = new int[] { 3, 6, 9 };
	}

	// ... 매개변수는 생성자에는 사용할 수 없다
	public ClapGame(int[] clapNums) {
		CLAP_NUMBERS = clapNums;
	}

	// 숫자 정답을 받으면 문자열 369 정답을 리턴하는 메서드
	public String getAnswerString(int answer) {
		String answerStr = "";
		int original = answer;

		while (answer > 0) {
			int digit = answer % 10;
			for (int i = 0; i < CLAP_NUMBERS.length; ++i) {
				if (digit == CLAP_NUMBERS[i]) {
					answerStr += "ㅉ";
					break;
				}
			}
			answer /= 10;
		}

		if (answerStr.length() == 0) {
			answerStr += original;
		}

		return answerStr;
	}

	// 정답 문자열과 사용자가 입력한 문자열을 비교하여 정답인지 알려주는 메서드
	public boolean checkAnswer(String answerStr, String userAnswer) {

		boolean isClapAnswer = answerStr.charAt(0) > '9';

		if (isClapAnswer) {
			if (userAnswer.length() != answerStr.length()) {
				return false;
			}

			for (int i = 0; i < answerStr.length(); ++i) {
				char ch = userAnswer.charAt(i);
				if (ch != 'ㅉ' && ch != '짝') {
					return false;
				}
			}
			return true;
		} else {
			return userAnswer.equals(answerStr);
		}

	}

	public void play() {

		System.out.printf("%s에 박수를 쳐야하는 게임입니다.\n", Arrays.toString(CLAP_NUMBERS));

		int turn = (int) (Math.random() * 2);

		System.out.printf("'%s'가 먼저 시작합니다.\n", players[turn].getName());

		Scanner sc = new Scanner(System.in);

		int answer = 1;

		while (true) {
			ClapGamePlayer player = players[turn];

			String answerStr = getAnswerString(answer++);
			String userAnswer;

		
			String name = player.getName();
			System.out.printf("%s -> ", name);

			if (name.equals("플레이어")) {
				userAnswer = player.manual(sc);
			} else {
				userAnswer = player.auto(answerStr);
				System.out.println(userAnswer);
			}

			// answerStr == userAnswer (ㅉ 또는 짝을 모두 정답으로 인정)
			boolean correct = checkAnswer(answerStr, userAnswer);

			if (!correct) {
				System.out.printf("'%s'의 패배!\n", player.getName());
				break;
			}

			turn = (turn + 1) % players.length;
		}

	}
}
