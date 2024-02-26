package myobj.omok;

public class OmokBoard {

	final static int MAX_WIDTH = 15;
	final static int MAX_HEIGHT = 15;

	char[][] board = {
			{0,1,1,1,1,1,1,1,1,1,1,1,1,1,2},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{3,4,4,4,4,4,4,4,4,4,4,4,4,4,5},
			{6,7,7,7,7,7,7,7,7,7,7,7,7,7,8},
	};
	
	// "A5", "C13"이 들어오면 {0, 4}, {2, 12}의 int[]로 변환해주는 메서드
	private int[] getCoordArray(String coordStr) {
		return new int[] {
				coordStr.length() == 2 ?
						coordStr.charAt(1) - '0' - 1 :
				 10 + (coordStr.charAt(2) - '0') - 1,
				 coordStr.charAt(0) - 'A'
		};
	}
	
	// "A5" , "C13" 등의 문자열이 들어오면 그곳에 돌을 놓는 메서드
	// 돌을 제대로 놓는것에 성공했는지에 대한 여부를 반환한다
	public boolean put(String coordStr, boolean isBlack) {
		int[] coords = getCoordArray(coordStr);
	
		int row = coords[0];
		int col = coords[1];
		
		
		if (row >= MAX_HEIGHT || col >= MAX_WIDTH) {
			System.out.println("[Error] 좌표값이 너무 큽니다");
			return false; 
		} else if (board[row][col] == 9 || board[row][col] == 10) {
			System.out.println("[Error] 이미 돌이 놓여있는 곳 입니다");
			return false;
		}
		
		if (isBlack) {
			board[row][col] = 9;
		} else {
			board[row][col] = 10;
		}
		return true;
	}
	
	// 방금 놓은 위치에서부터 오목이 완성되었는지 체크하는 메서드
	public boolean winCheck(String coordStr, boolean isBlack) {
		int [] coords = getCoordArray(coordStr);
		
		int row = coords[0];
		int col = coords[1];
		
		int color  = isBlack ? 9 : 10;
		
		// 연속적으로 놓여진 같은 색 돌의 개수를 센다
		
		// 1. 가로
		
		// 1-1) 현재 위치에서부터 왼쪽으로 가면서 개수 세기
		int horizontalCount = 0;
		
		for (int i = col; i >= 0; --i) {
			if (board[row][i] == color) {
				++horizontalCount;
			} else {
				break;
			}
		}
		
		// 1 -2) 현재 위치에서부터 오른쪽으로 가면서 개수 세기
		for (int i = col; i < MAX_WIDTH; ++i) {
			if (board[row][i] == color) {
				++horizontalCount;
			} else {
				break;
			}
		}
		
		// 2. 세로

		// 2-1) 현재 위치에서부터 위쪽으로 가면서 개수 세기
		int verticalCount = 0;
		
		for (int i = row - 1; i >= 0; --i) {
			if (board[i][col] == color) {
				++verticalCount;
			} else {
				break;
			}
		}
		
		// 2-2) 현재 위치에서부터 아래쪽으로 가면서 개수 세기
		for (int i = row; i < MAX_HEIGHT; ++i) {
			if (board[i][col] == color) {
				++verticalCount;
			} else {
				break;
			}
		}
		
		
		// 3. 왼쪽 위에서 오른쪽 아래로 가는 대각선
		
		int count3 = 0;
		// 3-1) 현재 위치에서부터 왼쪽 위로 가면서 개수 세기
		for (int c = col - 1, r = row - 1; 
				c >= 0 && r >= 0; --c, --r) {
			if (board[r][c] == color) {
				++count3;
			} else {
				break;
			}
		}
		
		// 3-2) 현재 위치에서부터 오른쪽 아래로 가면서 개수 세기
		
		for (int c = col , r = row; 
				c < MAX_WIDTH && r < MAX_HEIGHT; ++c, ++r) {
			if (board[r][c] == color) {
				++count3;
			} else {
				break;
			}
		}
		
		// 4. 왼쪽 아래에서 오른쪽 위로 가는 대각선 
		
		int count4 = 0;
		
		// 4-1)
		for (int c = col - 1, r = row + 1;
				c >= 0 && r < MAX_HEIGHT; --c, ++r) {
			if (board[r][c] == color) {
				++count4;
			} else {
				break;
			}
		}
		
		// 4-2)
		for (int c = col, r = row;
				c < MAX_WIDTH && r >= 0; ++c, --r) {
			if (board[r][c] == color) {
				++count4;
			} else {
				break;
			}
		}
		
		return (horizontalCount == 5 || verticalCount == 5 
				|| count3 == 5 || count4 == 5);
	}
	
	public void print() {
		System.out.println("  A B C D E F G H I J K L M N O");
		for (int i = 0; i < MAX_HEIGHT; ++i) {
			
			
			System.out.printf("%-2d", (i + 1));
			
			for (int j = 0; j < MAX_WIDTH; ++j) {
				switch (board[i][j]) {
					case 0:
						System.out.print('┌');
						break;
					case 1:
						System.out.print('┬');
						break;
					case 2:
						System.out.print('┐');
						break;
					case 3:
						System.out.print('├');
						break;
					case 4:
						System.out.print('┼');
						break;
					case 5:
						System.out.print('┤');
						break;
					case 6:
						System.out.print('└');
						break;
					case 7:
						System.out.print('┴');
						break;
					case 8:
						System.out.print('┘');
						break;
					case 9:
						System.out.print('●');
						break;
					case 10:
						System.out.print('○');
						break;
				}
				System.out.print(' ');
			}
			System.out.print('\n');
		}
	}
}
