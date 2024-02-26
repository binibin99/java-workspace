
public class C05_Static {
	
	/*
	  	# static (정적 영역, 클래스 영역)
	  
	 	- 인스턴스 영역과 대조되는 개념의 영역
	 	- 같은 클래스로 만들어진 모든 인스턴스들이 함께 사용하는 공동 영역을 의미한다
	 	- 앞에 static 이라는 키워드를 붙인 모든 자원(변수, 메서드)들은
	 	  모든 인스턴스들이 함께 사용하는 공동 영역에 있는 자원이 된다
	 */
	public static void main(String[] args) {
		
		// 객체를 100개 담을 수 있는 배열을 생성 (내용은 비어있다)
		Wall[] walls = new Wall[100];
		
		// new로 실체를 만들어 배열에 담아야 한다
		for (int i = 0; i < walls.length; ++i) {
			walls[i] = new Wall();
		}
		
	}

}


class Wall {
	// 생성된 모든 벽에서 동일할 값
	static int def;
	static int maxhp;
	
	// 각 벽마다 다를 값
	int hp;
	int x;
	int y;
}


/* 현실 객체를 참고하여 static 필드를 포함한 클래스를 하나 만들어보세요 */

class Ballingball {

	static int volume; // 부피
	
	int pound; // 무게 
	char core; // 코어
	String company; // 제조 회사
	char simbol; // 마크 
	String color; // 색깔
	char potential; // 하이, 미들 , 엔트리
	char coverstock; // 펄 , 솔리드 , 우레탄
	
}
