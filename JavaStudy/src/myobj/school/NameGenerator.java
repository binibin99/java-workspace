package myobj.school;

public class NameGenerator {
	
	
	static String[] lastNames = {"김", "이", "박", "최", "송", "우", 
				"권", "유", "조", "배", "방", "서", "양"};
	static String[] firstNames = {"철수", "민수", "영희", "순자", "순옥",
				"칠득", "만득" };
		
	public static String getRandomName() {
		return lastNames[(int)(Math.random() * lastNames.length)]
				+ firstNames[(int)(Math.random() * firstNames.length)];
	}

}
