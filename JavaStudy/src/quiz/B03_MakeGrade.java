package quiz;

import java.util.Scanner;

public class B03_MakeGrade {
	
	
	
	
	/*
	   국어, 영어, 수학 점수를 순서대로 입력받아 평균 점수를 구한 후에
	   각 과목의 점수와 등급 및 평균 점수를 출력해주는 프로그램을 만들어보세요
	   
	   (1) 90점 이상은 A
	       80점 이상은 B
	       70점 이상은 c
	       60점 이상은 D
	   	   그 외 F
	   (2) 각 과목의 유효 점수는 0 ~ 100점이다
	     	유효하지 않은 점수가 하나라도 있다면 모든 과목이 F이고
	     	평균 점수는 0점
	   (3) 평균 점수는 소수 둘째 자리에서 반올림하여 변수에 저장한 후 출력
	   
	   
	 */
	
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		
		
		System.out.print("국어 점수를 입력해주세요 : ");
		int KOREA = sc.nextInt();
		char grade = 'A';
		    if (KOREA >= 90 || 100 >= KOREA) {
	        	grade = 'A';
		    } else if (KOREA >= 80 || 89 >= KOREA) {
	        	grade = 'B';
		    } else if (KOREA >= 70 || 79 >= KOREA)	{
	        	grade = 'C';
		    } else if (KOREA >= 60 || 69 >= KOREA) {
	        	grade = 'D';
		    } else if (KOREA < 60 || 0 <= KOREA) {
	        	grade = 'F';
		    } else if (KOREA > 100 || KOREA < 0) {
	        	
		    System.out.print("영어 점수를 입력해주세요 : ");
		    int ENGLISH = sc.nextInt();
		    if (ENGLISH >= 90 || 100 >= ENGLISH) {
	        	grade = 'A';
		    } else if (ENGLISH >= 80 || 89 >= ENGLISH) {
	        	grade = 'B';
		    } else if (ENGLISH >= 70 || 79 >= ENGLISH)	{
	        	grade = 'C';
		    } else if (ENGLISH >= 60 || 69 >= ENGLISH) {
	        	grade = 'D';
		    } else if (ENGLISH < 60 || 0 <= ENGLISH) {
	        	grade = 'F';
		    } else if (ENGLISH > 100 || ENGLISH < 0) {
	        		grade = 'F';
	     
	        System.out.print("수학 점수를 입력해주세요 : ");
	        int MATH = sc.nextInt();
	        if (MATH >= 90 || 100 >= MATH) {
	        	grade = 'A';
	        } else if (MATH >= 80 || 89 >= MATH) {
	        	grade = 'B';
	        } else if (MATH >= 70 || 79 >= MATH)	{
	        	grade = 'C';
	        } else if (MATH >= 60 || 69 >= MATH) {
	        	grade = 'D';
	        } else if (MATH < 60 || 0 <= MATH) {
	        	grade = 'F';
	    
		
		int avg = (KOREA + ENGLISH + MATH) / 3;
		
		System.out.printf("당신의 평균 점수는 %d 입니다.", avg);
		
       
        }
        	
        }
        }
	}
}
// System.out.printf("유효하지 않은 점수 입니다. 평균은 0점, %d 입니다", grade);
// } else {
        			
   
	

	    


