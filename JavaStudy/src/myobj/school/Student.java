package myobj.school;

public class Student {
	
	String name;
	String s_id;
	static int s_count = 0;
	Subject subject;
	
	// 기본 생성자로 학생을 만들면 랜덤으로 만들어줄 예정
	public Student() {
		name = NameGenerator.getRandomName();
		// printf()는 콘솔에 출력하지만
		// String.format()은 해당 형식의 문자열을 사용할수있게끔 반환해준다
		s_id = "EZEN" + String.format("%08d", s_count++);
		
		subject = new SubScience();
	}
	
	public void printReportCard() {
		System.out.println(name + " 의 성적표[" + s_id + "]");
		System.out.println("총점: " + subject.getTotal());
		System.out.printf("평균: %.2f\n", subject.getAvg());
		System.out.printf("등급: %s\n", subject.getGrade());
		subject.printScores();
		
	}

}
