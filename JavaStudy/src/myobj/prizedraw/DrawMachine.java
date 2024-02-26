package myobj.prizedraw;

public class DrawMachine {

	private Prize[] prizes;
	private Prize[] pickBox = new Prize[100]; // 확률을 만들기 위한 배열

	// 임시 테스트용으로 상품을 배치하는 생성자
	public DrawMachine() {
		prizes = new Prize[3];

		prizes[0] = new Prize("물휴지", 200, 0.3);
		prizes[1] = new Prize("초콜렛", 100, 0.15);
		prizes[2] = new Prize("비틀즈", 50, 0.25);

		initPickBox();
	}

	private void initPickBox() {
		// Prizes에 들어있는 상품 정보들로 확률을 만들어낸다
		int index = 0;
		for (int i = 0; i < prizes.length; ++i) {
			double per = prizes[i].getChance() * 100;
			for (int j = 0; j < per; ++j) {
				pickBox[index++] = prizes[i];
			}
		}
	}

	// 상품 목록을 전달받으면 상품을 배치하는 생성자
	public DrawMachine(Prize[] prizes) {
		this.prizes = prizes;

		initPickBox();
	}

	public Prize draw() {
		Prize present = pickBox[(int) (Math.random() * 100)];

		if (present == null) {
			return new Prize("꽝", 0, 0);
		} else {
			if (present.getQty() == 0) {
				return new Prize("상품 소진으로 꽝", 0, 0);
			}
			present.minusQty();
			return present;
		}
	}
}
