
public class C17_Interface {
	
	/*
	  	
	  	# 인터페이스 (Interface)
	  	
	  	- 추상 클래스처럼 내부에 추상 메서드를 지닐 수 있다
	  	- 추상 메서드로 구격을 만들어 놓고 해당 규격을 상속받는 클래스들을
	  	  규격에 소속하게 만들어주는 용도
	  	- 추상 클래스는 한 클래스에 하나만 상속 가능하지만
	  	  인터페이스는 한 클래스에 여러개 구현 가능하다
	  	- 해당 클래스에 다형성을 추가하는 용도
	  	- 추상 클래스에는 인스턴스 영역이 존재하지만
	  	  인터페이스에는 인스턴스 영역이 아예 없다
	 */
	public static void main(String[] args) {
		Human minsu = new Human("민수");
		Bear bear = new Bear("미샤");
		Bear bear2 = new Bear("페트리샤");
		
		Stuff stuff = new Stuff("돌");
		
		minsu.throwing(stuff);
		bear.bite(stuff);
		bear2.scratch(stuff);
		
		// 인터페이스 타입으로 업캐스팅이 가능하다
		Swimmer swimmer1 = minsu;
		Swimmer swimmer2 = bear;
		
		System.out.println(swimmer1 instanceof Bear);
		System.out.println(swimmer2 instanceof Bear);
	}

}

// 인터페이스 내부의 메서드는 모두 추상 메서드이다
// 인터페이스 내부의 변수는 모두 static 변수이다 (인스턴스 변수 추가 불가능)
interface Swimmer {
	void swim();
	
	void fastswim();
}

interface Runner{
	void run();
}

class Stuff {
	String name;
	
	public Stuff(String name) {
		this.name = name;
	}
	
	@Override
	public String toString() {
		return name;
	}
}

class Human implements Runner,Swimmer {
	String name;
	
	public Human(String name) {
		this.name = name;
	}
	
	void throwing(Stuff stuff) {
		System.out.println(name + "이 " + stuff + "을(를) 던집니다.");
	}

	@Override
	public void swim() {

		
	}

	@Override
	public void fastswim() {
	
		
	}

	@Override
	public void run() {
		
		
	}
}

class Bear implements Runner,Swimmer {
	String name;
	
	public Bear(String name) {
		this.name = name;
	}
	void bite(Stuff stuff) {
		System.out.printf("곰 \"%s\"가 %s을(를) 물었습니다.\n", name, stuff);
	}
	
	void scratch(Stuff stuff) {
		System.out.printf("곰 \"%s\"가 %s을(를) 할퀴었습니다.\n", name, stuff);
	}
	@Override
	public void swim() {
	
		
	}
	@Override
	public void fastswim() {
	
		
	}
	@Override
	public void run() {

	}
}