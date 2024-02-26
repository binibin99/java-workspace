package quiz;

import java.util.Scanner;

import myobj.omok.OmokBoard;

public class C17_Omok {
	
	/* 
	 	오목을 만들어보세요 
	  
	 	1. 같은 색상의 돌이 연속으로 5개 놓이면 해당 색상의 승리
	 	(6개가 연속으로 놓이면 승리가 아님)
	 	
	 	2. 가로/세로/대각선 모두 연속으로 간주한다
	 	
	 	3. 번갈아가면서 돌을 놓는다
	 	
	 	4. 한 게임에 각 플레이어 당 한번씩 무르기 기능이 있다
		   무르기를 하면 그 사람이 돌을 놓기 전으로 돌아간다
	 */
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		OmokBoard omok1 = new OmokBoard();
		
		boolean isBlack = true;
		int turn = 0;
		
		while (true) {
			System.out.printf("<%d수>\n", (turn + 1));
			omok1.print();
			
			
			System.out.printf("'%s'의 차례입니다.\n", isBlack ? "흑" : "백");
			System.out.print("좌표 입력 >> ");
			
			String coord = sc.next();
			
			if (omok1.put(coord, isBlack)) {
				
				if (omok1.winCheck(coord, isBlack)) {
					System.out.println((isBlack ? "흑" : "백") + "이 이겼습니다!");
					break;
				}
				
				isBlack = !isBlack;
				++turn;
			}

		}
		omok1.print();
		
		
		

		}
		


}
