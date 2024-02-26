
public class A01_Escape {
	
	/*
	   # Escape 문자
	   
	   - \와 합쳐져서 특수한 기능을 하는 문자
	   - 그냥 사용하기에는 문제가 생기는 문자들을 표현하기 위한 방식
	   - \와 문자를 합쳐서 두 문자로 보이지만 하나의 문자로 인식된다
	   
	 */
	public static void main(String[] args) {
		
		// \n : 줄 바꿈의 기능을 가진 이스케이프 문자
		System.out.println("안녕하세요, 반갑습니다.");
		System.out.println("안녕하세요,\n 반갑습니\n다.");
		
		// \t : Tab키의 기능을 가진 이스케이프 문자
		System.out.println("나이\t: " + 20);
		System.out.println("평균 점수\t: " + 58.8);
		
		// \\ : 그냥 역슬래시를 출력하고 싶을 때 사용하는 이스케이프 문자
		System.out.println("C:\\Program Files\\java\\jdk");
		
		// \" : 그냥 쌍따옴표를 출력하고 싶을 때 사용하는 이스케이프 문자
		System.out.println("오늘 저녁으로는 \"피자\"를 먹어야겠다"); 
		
		// \' : 그냥 작은 따옴표를 출력하고 싶을 때 사용하는 이스케이프 문자
		
		// ""사이에 ''를 넣을 때는 아무 문제도 발생하지 않는다
		System.out.println("오늘 야식으로는 \'라면\'을 먹어야겠다");
		
		// 문자 타입으로 작은 따옴표 하나를 사용하고자 할 때 이스케이프가 필요하다
		System.out.println('C');
		System.out.println('\'');
		System.out.println('\t');
		System.out.println('\n');
		
	}

}
