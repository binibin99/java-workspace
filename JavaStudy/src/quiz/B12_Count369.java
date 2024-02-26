package quiz;

import java.util.Random;

public class B12_Count369 {

	public static void main(String[] args) {
		
		
		
		int ran = (int)(Math.random() * 401 + 100);
		
		int clapCount = 0;
		for (int i = 1; i <= ran; ++i) {
			System.out.print(i + ": ");
			
			// (1) 숫자를 문자열로 바꿔서 센다
//			String numStr = "" + i;
//			
//			for (int j = 0; j < numStr.length(); ++j) {
//				char ch = numStr.charAt(j);
//				
//				if (ch == '3' || ch == '6' || ch == '9') {
//					System.out.print("짝");
//					++clapCount;
//					
//				}
//			}
			// (2) 숫자를 한자리씩 검사하며 3,6,9 인지 센다
			int chkNum = i;
			boolean clapped = false; // 박수를 친적이 있는가
			
			while (chkNum > 0) {
				// 일의 자리 분리
				
				int digit = chkNum % 10;
				if (digit != 0 && digit % 3 == 0) {
					System.out.print("짝");
					++clapCount;
					clapped = true;
					}
				chkNum /= 10;
			}
			if (clapped) {
				System.out.print("\t\t- 누적 " + clapCount + "회");
		}
			System.out.println();
		}
		
		System.out.printf("박수 횟수는 %d회 입니다.\n", clapCount);
		
			
				
			
			
			}
	
		
		
		
		
		
	}


