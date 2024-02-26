package quiz;

import java.util.Arrays;

public class C02_Range {
	
	/*
	  	1. 정수값을 전달 받으면 0부터 해당 값 미만의 int[]을 생성하여 반환하는
	  		range 함수를 만들어보세요
	  
	 		ex> range(8)의 결과 -> [0, 1, 2, 3, 4, 5, 6, 7]
	 */
	
	/*
	 	2.  정수 최소값과 최대값을 전달받으면
	 		최소값부터 최대값 미만인 int[]을 생성하여 반환하는
	 		range 함수를 만들어 보세요 
	 		ex > range(10, 15) -> [10, 11, 12, 13, 14]
	 			 range(15, 10) -> [15, 14, 13, 12, 11]
	 */
	
	/*	3. 최소값 최대값 증감값을 전달받으면
	 		최소값부터 최대값 미만까지 증감값 만큼 증가하는 int[]을 생성하여 반환하는
	 		range 함수를 만들어 보세요
	 		
	 		ex> range(10, 20, 2) -> [10, 12, 14, 16, 18]
	 			range(40, 30, -3) -> [40,37,34,31]
	 			range(20, 10 ,5) -> []
	  
	 */
	public static int[] range(int num) {
		int[] arr = new int[num];
		for (int i = 0; i < arr.length; ++i) {
			arr[i] =i;
		}
				
		return arr;
	}
	public static int[] range(int start,int end) {
		int size = Math.abs(start - end);
		
		int[] arr = new int[size];
		
		int increment = start < end ? 1 : -1;
		
		for (int i = 0; i < arr.length; ++i) {
			arr[i] = (start += increment) ;
		}
		return arr;
	}
	public static int[] range(int start, int end, int increment) {
		
		int size = (int)Math.ceil((end - start) / (double) increment);
		
		// 위 계산에서 size가 -가 나온다면 방향이 잘못된것이다
		if (size < 0) {
			return null;
		}
		
		int[] arr = new int[size];
		
		for (int i = 0; i < size; ++i) {
			arr[i] = start + (increment * i);
			
		}
		
		return arr;
	}
	
	public static void main(String[] args) {
		System.out.println(Arrays.toString(range(10, 20)));
		System.out.println(Arrays.toString(range(20, 15)));
		
		System.out.println(Arrays.toString(range(10, 20, 2)));
		System.out.println(Arrays.toString(range(40, 30, -3)));
		System.out.println(Arrays.toString(range(20, 10, 5)));
		
		// 해당 함수에서 null을 리턴할 가능성이 있는경우
		// null이 아닐때만 해당 값을 활용하도록 코드를 작성하는 것이 좋다
		int[] result = range(10, 80, -1);
		if (result != null) {
			System.out.println(Arrays.toString(result));
		} else {
			System.out.println("null이 나왔습니다");
		}
	

	
		

	}

}
