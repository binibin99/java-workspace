package quiz;

import java.util.Scanner;

public class B03_MAKEGARADE_T {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		System.out.print("국어 점수를 입력 > ");
		int kor = sc.nextInt();
		System.out.print("영어 점수를 입력 > ");
		int eng = sc.nextInt();
		System.out.print("수학 점수를 입력 > ");
		int math = sc.nextInt();
		
		// 각 과목 등급 만들기
	
		char korGrade, engGrade, mathGrade;
		double avg;

		// 점수가 유효한지 체크 (유효성 검사)
		if (kor > 100 || kor < 0 || eng > 100 || eng < 0 
				|| math > 100 || math < 0) { 
			kor = 0;
			eng =0;
			math = 0;
			korGrade = 'F';
			engGrade = 'F';
			mathGrade = 'F';
			avg = 0.0;
		} else {
			// 점수가 모두 유효한 곳
			
			// 각 과목 등급 만들기
			if (kor >= 90) {
				korGrade = 'A';
			} else if (kor >= 80) {
				korGrade = 'B';
			} else if (kor >= 70) {
				korGrade = 'C';
			} else if (kor >= 60) {
				korGrade = 'D';
			} else {
				korGrade = 'F';
			}

			if (eng >= 90) {
				engGrade = 'A';
			} else if (eng >= 80) {
				engGrade = 'B';
			} else if (eng >= 70) {
				engGrade = 'C';
			} else if (eng >= 60) {
				engGrade = 'D';
			} else {
				engGrade = 'F';
			}

			if (math >= 90) {
				mathGrade = 'A';
			} else if (math >= 80) {
				mathGrade = 'B';
			} else if (math >= 70) {
				mathGrade = 'C';
			} else if (math >= 60) {
				mathGrade = 'D';
			} else {
				mathGrade = 'F';
			}

			// 평균 점수 (둘째 자리에서 반올림)
			avg = Math.round((kor + eng + math) / 3.0 * 10) / 10.0;
		}
		// 계산될 결과를 출력하기
		System.out.printf("\t점수\t등급\n");
		System.out.printf("국어\t%d\t%c\n", kor, korGrade);
		System.out.printf("영어\t%d\t%c\n", eng, engGrade);
		System.out.printf("수학\t%d\t%c\n", math, mathGrade);
		System.out.println("========================");
		System.out.printf("평균\t\t%.1f\n", avg);
	
	}
			
}

		
	

