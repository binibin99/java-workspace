
public class C06_StaticMethod {

	/*
	  	# 인스턴스 변수 (필드, 멤버 변수, 속성... 등등)
	  
	  	- 각 인스턴스 마다 다른 값을 가질 수 있는 변수 
	  	- 인스턴스가 생기기 전에는 사용할 수 없다 
	  	(new를 통해 인스턴스를 생성하기 전에는 사용할 수 없다)
	  
	  	# 인스턴스 메서드 (static이 붙지 않은 메서드들)
	  
	  	- 인스턴스 변수를 활용하여 각 인스턴스 마다 다른 결과를 낼 수 있는 메서드
	  	- 인스턴스 변수를 활용해야 하기 때문에 인스턴스 없이는 사용할 수 없다
	  
	  	# 스태틱 변수 (클래스 변수)
	  
	  	- 모든 인스턴스에서 함께 사용할 수 있는 변수
	  	- 한 클래스에 하나밖에 없다
	  	- 인스턴스가 아직 존재하지 않을 때도 사용할 수 있다
	  	- 해당 클래스의 인스턴스가 하나도 없는 상황에서도 사용할 수있다.
	  	
	  	# 스태틱 메서드 
	  	
	  	- 스태틱 변수만 활용할 수 있는 메서드 
	  	- 인스턴스 변수는 활용할 수 없다
	  	- 스태틱 변수만 활용하기 때문에 모든 인스턴스에서 같은 결과가 나온다
	  	- 해당 클래스의 인스턴스가 하나도 없는 상황에서도 사용할 수 있다.
	 */
	public static void main(String[] args) {
		
		// static 자원들은 인스턴스가 생기기 전에도 사용할 수 있다
		Card.height = 190;
		
		Card c1 = new Card('◇', 10);
		Card c2 = new Card('★', 7);
		
		c1.shape = '♣';
		
		// static은 클래스에 딸려있는것이기 때문에 클래스 이름에 .을찍고 사용할 수 있다
		Card.width = 80;
		
		System.out.printf("%c%d\n", c1.shape, c1.num);
		System.out.printf("c1의 너비: %d\n", c1.width);
		System.out.printf("c1의 높이: %d\n", c1.height);
		
		System.out.printf("%c%d\n", c2.shape, c2.num);
		System.out.printf("c2의 너비: %d\n", c2.width);
		System.out.printf("c2의 높이: %d\n", c2.height);
	}
	
}

class Card {
	// 모든 카드에서 동일할 값
	static int width = 100;
	static int height = 200;
	// 각 카드마다 다를 값
	char shape; 
	int num; 

	public Card(char shape, int num) {
		this.shape = shape;
		this.num = num;
	}
	
	// 카드의 면적을 구하는 메서드 (가로 x 세로)
	public static int getAreaSize() {
		return width * height;
	}
}
