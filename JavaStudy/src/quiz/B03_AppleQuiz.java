package quiz;

import java.util.Scanner;

public class B03_AppleQuiz {
	
	/* 
		사과를 10개씩 담을 수 있는 바구니가 있을 때
		사용자가 사과의 개수를 입력하면
		사과를 모두 담기 위해 바구니가
		몇 개 필요한지 알려주는 프로그램을 만들어보세요
	 */
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int BASKET_SIZE = 10;
		
		System.out.println("사과의 개수를 입력해주세요 > ");
		int appleCount = sc.nextInt();
		
		// Ctrl + Shift + F : 들여쓰기 맞추는 단축키
		// 블록지정하고 Ctrl + i : 블록지정한 부분 들여쓰기 맞추기
		
		//입력값 체크를 가장 먼저 처리하는 것이 좋다
		if (appleCount < 0) {
			System.out.println("개수가 이상해 프로그램을 종료합니다.");
		} else {	
		//int basketCount = (int) Math.ceil(appleCount / 10.0);
		
		int basketCount = appleCount / BASKET_SIZE;
		int remain = appleCount % BASKET_SIZE;
	    
		if (remain > 0) {
		basketCount = basketCount + 1;
		}
        System.out.printf("필요한 바구니의 수 : " + "%d개 입니다.\n", basketCount );
        
        

      
        
		
			
 		}
	}
}

 