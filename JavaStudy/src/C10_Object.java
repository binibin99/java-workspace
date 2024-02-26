
public class C10_Object {
	
	/*
	  	# Object class
	  	
	  	- 모든 자바 클래스들의 최고 조상 클래스
	  	- 모든 클래스는 Object를 상속받아 만들어진다
	  	- Object 클래스의 메서드는 모든 클래스에 존재한다
	  	- Object 클래스의 메서드는 해당 클래스에 맞는 형태로 오버라이드 하여
	  	  사용하게끔 설게되어 있다
	  	  
	  	# Object.toString()
	  	
	  	- '해당 객체를 문자열로 표현한다면 어떤 모양인가'를 정의하는 메서드
	  	- 자바의 모든 객체는 toString()을 통해 문자열로 표현될 수 있다
	  	- Object 클래스에 정의되어있는 toString() 메서드 원형은
	  	  해당 클래스의 이름과 메모리상 주소를 출력하게 되어있다
	  	- print()등 다양한 메서드에서 객체의 toString()을 활용한다
	  	
	  	# Object.eqauls()
	  	
	  	- '해당 객체로 만들어진 두 인스턴스가 같은지 판정하는 기준'을 정의하는 메서드
	  	- 매개변수로 전달받은 인스턴스와 this를 비교하여 결과를 리턴한다
	  	- object 클래스에 정의되어있는 equals()의 원형은 동일한 인스턴스인지
	  	  비교하게 되어있다
	  	  
	  	# Object.hashCode()
	  	
	  	- 해당 인스턴스의 지문 역할을 하는 값을 생성하는 메서드
	  	- Object 클래스의 기본 동작은 해당 인스턴스의 주소값을 리턴하는 것이다
	  	
	  	# Hash 알고리즘
	  	
	  		hello!		=> 		5183AFDE23001
	  		hello	  	=>		3335423416AAA
	  	
	  	- 다음의 여러가지 조건을 만족하는 알고리즘
	  	- 같은 값을 넣었을때 일정한 값이 나와야 한다
	  	- 다른 값을 넣었을때 같은 값이 나오면 안된다
	  	- 해쉬 알고리즘으로 얻어낸 결과값으로 원래 값을 유추하기 어려워야 한다
	 */
	 public static void main(String[] args) {
		 Snack s1 = new Snack("초코파이", 3500);
		 Snack s2 = new Snack("초코파이", 3500);
		 Snack s3 = new Snack("몽쉘", 2700);
		 "yes".equals("yes");
		 
		s1.info();
		
		String snackStr = s1.toString();
		
		System.out.println(snackStr);
		
		// 사실 print() 메서드들은 해당 객체의 toString() 결과를 콘솔에 출력하는 메서드이다
		// 모든 객체는 toString()을 가지고 있을수밖에 없으므로 이런 구현이 가능하다
		System.out.println(s1);
		System.out.println();
		
		// 해당 클래스만의 equals를 구현하여 '같음'을 구현할 수 있다
		System.out.println(s1.equals(s2));
		System.out.println(s1.equals(s3));
		
		// Object 타입은 모든 타입의 부모이기 때문에 모든 타입에서 업캐스팅이 가능하다
		Object o1 = 123;
		Object o2 = "1234";
		Object o3 = new DumpTruck();
	 }
}

class Snack {
	String name;
	int price;
	
	public Snack() {
		name = "기본 과자";
		price = 500;
	}
	
	public Snack(String name, int price) {
		this.name = name;
		this.price = price;
	}
	
	public void info() {
		System.out.println("과자 이름: " + name);
		System.out.println("가격: " + price);
	}
	
	// 이 객체를 문자열로 표현한다면?
	@Override
	public String toString() {
		// return super.toString();
		return "[" + name + "/가격:" + price + "]";
	}
	
	@Override
	public boolean equals(Object obj) {
		Snack s1 = this;
		Snack s2 = (Snack) obj;
		
		return (s1.price == s2.price && s1.name.equals(s2.name));
	}
}
