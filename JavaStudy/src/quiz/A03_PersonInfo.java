package quiz;

public class A03_PersonInfo {

	public static void main(String[] args) {
		
		String name = "홍길동";
		int age = 20;
		String tell = "010-1234-1234";
		double height = 178.5;
		double weight = 75;
		String bloodType = "O"; // AB형까지 있기 때문에 char로는 부족하다

		System.out.println("========출력 결과========");
		System.out.println("이름\t: " + name);
		System.out.println("나이\t: " + age);
		System.out.println("Tel\t: " + tell);
		System.out.println("키\t: " + height);
		System.out.println("몸무게\t: " + weight);
		System.out.println("혈액형\t: " + bloodType);
		
	}
}