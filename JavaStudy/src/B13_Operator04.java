
public class B13_Operator04 {

	public static void main(String[] args) {

		/*
		 * # 삼항 연산자
		 * 
		 * - 간단한 if문을 한 줄로 쉽게 사용할 수 있는 연산자 
		 * - 비교 ? 예 : 아니오; 
		 * - 비교의 결과가 true라면 : 왼쪽의 값을 사용한다 
		 * - 비교의 결과가 false라면 : 오른쪽의 값을 사용한다
		 */

		int age = 9;
		int money = age > 30 ? -50000 : 50000;
		System.out.println("이번 추석에 받을 돈: " + money);

		// 필요한 바구니의개수를 한줄로 구하기
		int apple = 33;
		int basket = apple % 10 == 0 ? apple / 10 : apple / 10 + 1;
		System.out.printf("사과가 %d개일때 필요한 바구니의 개수는 %d개\n", apple, basket);

		String greetings;
		if (age < 10) {
			greetings = "안녕!";
		} else {
			greetings = "안녕하세요!";
		}
		// 위의 코드를 아래와같이 한줄로 표현
		greetings = age < 10 ? "안녕!" : "안녕하세요";
		System.out.println(greetings);

	}
}
