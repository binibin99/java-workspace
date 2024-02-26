
public class B15_Array2 {
	
	/*
	 	배열안의 요소로 배열을 넣을 수 있다
	 */
	public static void main(String[] args) {
		
		int[] arr1 = new int[5];
		int[] arr2 = new int[] {40, 60, 80, 100, 120};
		int[] arr3 = {1, 3, 5, 7, 9 ,11, 13, 15, 17};
		
		int[][] arr4 = {
				arr1, 
				arr2, 
				arr3, 
				{9, 9, 7, 9},
				new int[] {44, 55, 66, 11, 33, 22}
		};
		
		//
		int[][][] arr5 = {
				arr4, arr4, arr4, arr4, arr4
		};
		
		System.out.println(arr4[0][6]);
		System.out.println(arr4[1][3]);
		System.out.println(arr4[2][1]);
		System.out.println(arr4[3][2]);
		System.out.println(arr4[4][3]);
		
		// 배열의 신기한 점
		char[] name1 = new char[] {'김', '철', '수'};
		char[] name2 = name1;
		char[] name3 = name1;
		
		name3[1] = '영';
		name3[2] = '희';
		
		System.out.println(name1);
		System.out.println(name2);
		System.out.println(name3);
		
		// n차원 배열은 n중 반복문으로 모두 탐색할 수 있다
		char[][] fruits = new char[][] {
			{'a', 'p', 'p', 'l', 'e'},
			{'o', 'r', 'a', 'n', 'g', 'e'},
			{'p', 'i', 'n', 'e', 'a', 'p', 'p', 'l', 'e'},
			{'g', 'r', 'a', 'p', 'e'}
			
		};
		
		// fruits.length : 배열이 몇개인가
		for (int i = 0; i < fruits.length; ++i) {
			// fruits[i].length : 해당 번째 배열의 길이가 몇인가
			for (int j = 0; j < fruits[i].length; ++j) {
				System.out.printf("fruits[%d][%d]: %c\n",
						i, j, fruits[i][j]);
			}
			System.out.println("------------------");
		}
		
	}
	

}
