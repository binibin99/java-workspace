package quiz;

import java.util.Arrays;

public class B14_Sort {

	/*
	 * -100 ~ 100 사이의 랜덤 정수 값이 20개 들어있는 배열을 하나 생성한 후
	 * 
	 * (1) 해당 배열의 내용을 작은 값 부터 차례대로 저장한 새로운 배열을 생성하여 출력 (오름차순,Ascending)
	 * 
	 * (2) 해당 배열의 내용을 큰 값 부터 차례대로 저장한 새로운 배열을 생성하여 출력 (내림차순, Descending)
	 * 
	 * 
	 */

	public static void main(String[] args) {

		int[] arr = new int[20];

		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (int) (Math.random() * 201 - 100);
		}

		System.out.println("- 원본 -");
		System.out.println(Arrays.toString(arr));

		int step = 0;
		while (step < arr.length) {
			// 가장 큰 것을 골라서 맨앞에 놓는다
			// 0단계일때 가장 작은 숫자를 골라서 0번 위치에 놓는다
			// 1단계일때는 0번위치에 이미 가장 큰 숫자가 있으므로
			// 1번 인덱스부터 비교할 수 있다, 나머지중 가장 큰 숫자를 골라서 1번 위치에 놓는다
			// ... 반복
			int biggestIndex = step;

			for (int i = step + 1; i < arr.length; ++i) {
				if (arr[biggestIndex] < arr[i]) {
					biggestIndex = i;

				}
			}

			int temp = arr[step];
			arr[step] = arr[biggestIndex];
			arr[biggestIndex] = temp;
			
			System.out.printf("%d단계 정렬 후 -\n", step);
			System.out.println(Arrays.toString(arr));
			++step;
		}
		
		System.out.println("- 정렬 후 -");
		System.out.println(Arrays.toString(arr));
		
		int step2 = 0;
		while (step2 < arr.length) {
			int smallIndex = step2;
			for (int i = step + 1; i < arr.length; --i) {
				if (arr[smallIndex] < arr[i]) {
					smallIndex = i;
					
				}
			}
			int temp2 = arr[step2];
			arr[step2] = arr[smallIndex];
			arr[smallIndex] = temp2;
			
			System.out.printf("%d단계 정렬 후 -\n", step2);
			System.out.println(Arrays.toString(arr));
			--step2;
		}
		System.out.println("- 정렬 후 -");
		System.out.println(Arrays.toString(arr));
	}
	
}
