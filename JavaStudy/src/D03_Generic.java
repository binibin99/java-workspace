
public class D03_Generic {
	
	/* 
	  # 제네릭 (Generic)
	  
	  - 클래스를 정희할 때 나중에 타입을 지정할 수 있도록 설계해두는 것
	  - 해당 클래스의 인스턴스 생성시 <>를 통해 제네릭의 타입을 결정할 수 있다
	  - 제네릭에는 기본 타입을 사용할 수 없다
	  	(int, char, short, ... 대신 Integer, Character, Short ...)
	  - 제네릭은 한 클래스에 여러개 설정할 수 있다
	  - 제네릭이 있는 클래스에 제네릭 타입을 설정하지 않으면 Object 타입으로 설정된다
	 */
	public static void main(String[] args) {
		// 클래스 정의 당시에 타입을 정하지 않고 인스턴스 생성시 결정하도록 한다
		Fish<Integer> f1 = new Fish<>();
		Fish<String> f2 = new Fish<>();
		
		f1.a = 10;
		f1.b = new Integer[10];
		
		f2.a = "fish";
		f2.b = new String[5];
		
		Whale<Fish, Integer> w1 = new Whale<>();
		
		w1.food = new Fish<>();
		w1.drink = 123;
	}

}

class Fish<T> {
	T a;
	T[] b;
	
	T swim() {
		return b[(int)(Math.random() * b.length)];
	}
}

class Whale<T, E> {
	T food;
	E drink;
}