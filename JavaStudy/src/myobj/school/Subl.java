package myobj.school;

public class Subl extends Subject {
		
	// 국어 영어 수학1 역사 도덕 세계사
	int kor;
	int eng;
	int math1;
	int history;
	int ethics;
	int worldhistory;
		
	static int getRandomScore() {
		return (int)(Math.random() * 101);
	}
		
	public Subl() {
		kor = getRandomScore();
		eng = getRandomScore();
		math1 = getRandomScore();
		history = getRandomScore();
		ethics = getRandomScore();
		worldhistory = getRandomScore();
			
	}
		@Override
	public double getAvg() {
		return getTotal() / 6.0;
	}
		@Override
	public String getGrade() {
		double avg = getAvg();
			
		if (avg >= 90) {
			return "A";
		} else if (avg >= 80) {
			return "B";
		} else if (avg >= 70) {
			return "C";
		} else if (avg >= 60) {
			return "D";
		} else {
			return "F";
		}
	}
	@Override
	public int getTotal() {
		return (kor + eng + math1 + history + ethics + worldhistory);
	}
		
	public void printScores() {
		System.out.println("국어\t영어\t수1\t역사\t도덕\t세계사");
		System.out.printf("%d\t%d\t%d\t%d\t%d\t%d\n",
				kor, eng, math1, history, ethics, worldhistory);
	}
}

