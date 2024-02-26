package quiz;

import java.util.Arrays;

public class B15_Array2Quiz {

	public static void main(String[] args) {

		int sum = 0;
		double avg = 0;
		int[][] myArr = { { 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1 }, { 1, 1 }, { 1, 1, 1, 1, 1, 1, 1, 1 }, { 1, 1, 1, 1 } };

		// 1. myArr의 모든 값을 1 ~ 500 사이의 랜덤 값으로 바꾸기

		// 2. 랜덤으로 바뀐 모든 값의 총합과 평균을 구하기

		// 3. myArr의 각 행(row)의 합을 구해서 출력하기

		// 4. myArr의 각 열(column)의 합을 구해서 출력하기
		int count = 0;
		for (int i = 0; i < myArr.length; ++i) {
			// 각 배열의 길이를 더해 총 개수를 구할 수도 있다
			for (int j = 0; j < myArr[i].length; ++j) {
				myArr[i][j] = (int) (Math.random() * 500 + 1);
				System.out.println(myArr[i][j]);
				sum += myArr[i][j];
				++count;

				avg = (sum / (double) count);

			}

		}
		System.out.printf("\n합계 : %d ", sum);
		System.out.printf("\n평균 : %.2f", avg);

		int[] rowSum = new int[myArr.length];

		for (int row = 0; row < myArr.length; ++row) {
			for (int col = 0; col < myArr[row].length; ++col) {
				rowSum[row] += myArr[row][col];
			}
		}

		System.out.println("\n각 행의 합: " + Arrays.toString(rowSum));

		int maxColSize = 0;

		for (int i = 0; i < myArr.length; ++i) {

			int colSize = myArr[i].length;

			if (maxColSize > myArr[i].length) {
				maxColSize = myArr[i].length;
				if (maxColSize < colSize) {
					maxColSize = colSize;
				}
			}
			// maxColSize = maxColSize > colSize ? maxColSize : colSize;
		}

		int[] colSum = new int[maxColSize];

		for (int row = 0; row < myArr.length; ++row) {
			for (int col = 0; col < myArr[row].length; ++col) {
				colSum[col] += myArr[row][col];
			}
		}
		System.out.println("열의 합: " + Arrays.toString(colSum));

		for (int col = 0; col < maxColSize; ++col) {
			for (int row = 0; row < myArr.length; ++row) {
				try {
					System.out.printf("[%d][%d]: %d\n", row, col, myArr[row][col]);
				} catch (ArrayIndexOutOfBoundsException e) {
				}
			}

		}
	}
}
