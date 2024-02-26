package myobj.school;

public class Subject {
	
	// 나중에 각 과목이 상속받아 오버라이드 할 예정
	public int getTotal() {
		return 0;
		
	}
	
	public double getAvg() {
		return getTotal() / 5.0;
	}
	
	public String getGrade() {
		return "";
	}
	
	public void printScores() {}
	

}
