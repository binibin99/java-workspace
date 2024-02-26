package quiz;

import java.util.Scanner;

public class B04_MakeSeason {
	/*
	  	사용자가 몇 월인지 입력하면 해당하는 계절이 무엇인지 출력해보세요
	  	(switch-case문으로 한번, if문으로도 한번)
	 	
	 */
	 
	public static void main(String[] args) {
		
		Scanner sc  = new Scanner(System.in);
		
		System.out.print("몇 월인지 숫자를 입력해주세요 > ");
		
		int month = sc.nextInt();
		
		switch (month) {
		case 1 :
		 System.out.println("겨울 입니다. ");
		 break;
		 
		case 2:
		System.out.println("겨울 입니다. ");
		break;

		case 3:
		System.out.println("봄 입니다. ");
		break;
		
		case 4:
		System.out.println("봄 입니다. ");
		break;
		
		case 5:
		System.out.println("봄 입니다. ");
		break;
		
		case 6:
		System.out.println("여름 입니다. ");
		break;
		
		case 7:
		System.out.println("여름 입니다. ");
		break;
			
		case 8:
		System.out.println("여름 입니다. ");
		break;
			
		case 9:
		System.out.println("가을 입니다. ");
		break;
			
		case 10:
		System.out.println("가을 입니다. ");
		break;
		
		case 11:
		System.out.println("가을 입니다. ");
		break;
		
		case 12:
		System.out.println("겨울 입니다. ");
		break;
		
		default:
		System.out.println("잘못된 숫자입니다. ");
		break;
		
		}
		
		if (month < 1 || month > 12) {
			System.out.println("그런 달은 없습니다");
		} else if (month >= 11 || month <= 2) {
			System.out.println("겨울입니다");
		} else if (month >= 9) {
			System.out.println("가을입니다");
		} else if (month >= 6) {
			System.out.println("여름입니다");
		} else {
			System.out.println("봄입니다");
		}
	}
}
	


	
					
		

	

