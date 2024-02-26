package quiz;

import java.util.Arrays;

public class B14_Sort2 {

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


		
		int step2 = 0;
		while (step2 < arr.length) {
			int smallIndex = arr.length - step2 - 1;
			
			for (int i = 0; i < arr.length -step2 - 1; ++i) {
				if (arr[smallIndex] < arr[i]) {
					smallIndex = i;
					
				}
			}
			int temp2 = arr[arr.length -1 -step2];
			arr[arr.length - 1 -step2] = arr[smallIndex];
			arr[smallIndex] = temp2;
			
			++step2;
			System.out.printf("%d단계 정렬 후 -\n", step2);
			System.out.println(Arrays.toString(arr));
		}
		System.out.println("- 정렬 후 -");
		System.out.println(Arrays.toString(arr));
	}
	
}
