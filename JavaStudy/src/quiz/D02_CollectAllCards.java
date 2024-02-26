package quiz;

import java.util.HashSet;

public class D02_CollectAllCards {

	static class Card {
		private static String[] colors = { "red", "blue", "green", "yellow" };
		private static String[] shapes = { "○", "△", "☆" };

		private String color;
		private String shape;

		public Card() {
			color = colors[(int) (Math.random() * colors.length)];
			shape = shapes[(int) (Math.random() * shapes.length)];
		}

		@Override
		public boolean equals(Object obj) {
			return this.hashCode() == obj.hashCode();
		}

		@Override
		public int hashCode() {
			return (color + shape).hashCode();
		}

		@Override
		public String toString() {
			return "[" + color + " " + shape + "]\n";
		}
	}

	/*
	 * 카드를 랜덤으로 생성하여 HashSet에 모든 종류의 카드를 추가해보세요
	 * 
	 * 1. 카드는 색상과 모양이 있다 
	 * 2. 색은 빨강/파랑/초록/노랑이 있다 
	 * 3. 모양은 동그라미/세모/별이 있다 4. 카드 클래스를 직접
	 * 	  생성하여 풀어야 한다
	 * 
	 * 모든 종류의 카드를 HashSet에 추가한 후 카드를 몇 번이나 생성했는지 출력해보세요
	 */
	public static void main(String[] args) {
		// 해당 클래스의 equals 메서드 결과가 일치한다면 중복으로 간주하고
		// Set에 추가되지않는다
		HashSet<Card> cards = new HashSet<>();
		
		int count = 0;
		while (cards.size() < 12) {
			cards.add(new Card());
			System.out.println(++count + "번째 카드를 추가했습니다!");
		}
		
		System.out.println(cards);
		System.out.println("카드를 " + count + "번 뽑아서 모든 카드를 모았습니다. ");

	}
}
