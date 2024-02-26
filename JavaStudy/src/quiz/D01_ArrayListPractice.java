package quiz;

import java.util.ArrayList;

public class D01_ArrayListPractice {

	/*
	 * 1. 리스트에 1000 ~ 2000 사이의 랜덤 정수를 100개 추가하기
	 * 
	 * 2. 원본에서 홀수를 모두 제거한 후 총합을 구하기
	 * 
	 * 3. 원본에서 짝수를 모두 제거한 후 총합을 구하기
	 */
	public static void main(String[] args) {
		// 제네릭에는 기본형 변수 타입을 사용할 수 없다
		// (각 기본형 타입의 참조형 버전 타입을 사용해야 한다)
		ArrayList<Integer> numbers = new ArrayList<>();
		ArrayList<Integer> numbers2 = new ArrayList<>();
		ArrayList<Integer> numbers3 = new ArrayList<>();
		
		int sum1 = 0;
		int sum2 = 0;
		
		for (int i = 0; i < 100; ++i) {
			numbers.add((int)(Math.random() * 1001) + 1000);
		}
		System.out.println("1번 : \n" + numbers);
		
		for (int i = 0; i < numbers.size(); i++) {
			if (numbers.get(i) % 2 == 0) {
				numbers2.add(numbers.get(i));
				sum1 += numbers.get(i);
			} else {
				numbers3.add(numbers.get(i));
				sum2 += numbers.get(i);
			}
		}

		System.out.println("2번 : \n" + numbers2);
		System.out.println("2번 총합 : " + sum1);
	
		System.out.println("3번 : \n " + numbers3);
		System.out.println("3번 총합 : " + sum2);


	}

}
