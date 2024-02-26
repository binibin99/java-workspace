package quiz;

import myobj.school.Student;

public class C09_School {

	/*
	 * 1. 이과 학생들은 국어, 영어, 수1, 수2, 과학 점수가 있다
	 * 
	 * 2. 문과 학생들은 국어, 영어, 수1, 국사, 도덕, 세계사 점수가 있다
	 * 
	 * 3. 100명의 학생들을 랜덤으로 생성한다 모든 학생들의 과, 점수, 이름등 모든 내용이 랜덤으로 생성되어야 하고 학생들의 학번은 중복없이
	 * 순차적으로 생성되어야 한다
	 * 
	 * 4. 성적표 출력 메서드를 통해 각 학생의 [학번/이름/과목별점수/총점/평균/등급]을 볼 수 있다
	 */
	public static void main(String[] args) {
		new Student().printReportCard();
		new Student().printReportCard();
		new Student().printReportCard();
		new Student().printReportCard();
		new Student().printReportCard();

	}
}


