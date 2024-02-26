
public class C09_Polymophism {
	
	/* 
	  	# 객체의 다형성
	  	
	  	- 객체가 다양한 형태를 지닐 수 있는 성질
	  	- 사과는 과일이다
	  	- 과일은 사과가 아니다
	  	- 사과는 사과이기도 하지만 과일이기도 하다 (다형성)
	  
	  	# 업 캐스팅
	  	
	  	- 자식 타입이 부모 타입이 되는 것 (사과가 과일이 되는 것)
	  	- 자식 타입 인스턴스는 이미 내부에 부모 타입의 모든 것을 지니고 있으므로
	  	  부모 타입으로 타입 캐스팅 되는 것 에는 아무 문제가 없다
	  	- 업 캐스팅 된 자식 타입 인스턴스는 원래 가지고 있던 자식 클래스의 기능들을
	  	  사용할 수 없다
	  	  
	  	# 다운 캐스팅
	  	
	  	- 부모 타입을 자식 타입으로 만드는 것을 다운캐스팅이라고 한다
	  	- 일반적으로 부모 타입은 자식 타입이 될 수 없다
	  	- 원래 자식 타입이었다가 업 캐스팅 되어 있는 인스턴스의 경우
	  	  다시 원래의 타입으로 다운 캐스팅 할 수 있다
	  	  
	  	# instanceof 연산자
	  	
	  	- 해당 인스턴스가 특정 클래스의 인스턴스인지 검사해주는 비교 연산자
	  	ex: c1 instanceof DumpTruck,
	 */
	
	public static void main(String[] args) {
		// 업 캐스팅
		DumpTruck d1 = new DumpTruck();
		d1.addCargo(100);
		
		// 원래 덤프트럭이지만 업캐스팅 된 상태에서는 트럭만의 기능을 사용할 수 없다
		Car c1 = (Car)(d1);
		
		// 업 캐스팅은 명시적으로 하지 않아도 된다 (자연스러운 타입 캐스팅 중 하나)
		Liquid l1 = new Liquid();
		Liquid w1 = new Water();
		Liquid a1 = new Alcohol();
		
		// 업캐스팅 되었더라도 오버라이드 된 메서드는 자식에 구현된 대로 사용할 수 있다
		l1.drink();
		w1.drink();
		a1.drink();
		
		// 다운 캐스팅
		// DumpTruck d2 = (DumpTruck)new Car("자동차" , "현대" , 123);
		
		// 원래 트럭이었던 인스턴스를 자동차로 업캐스팅하여 사용
		Car c2 = new DumpTruck();
		
		// c2는 원래 트럭 인스턴스였기 때문에 다시 원래대로 돌아가는 것은 가능
		DumpTruck d2 = (DumpTruck)c2;
		
		Car c3 = new Car("차", "삼성", 123);
		
		System.out.println(c2 instanceof Car);
		System.out.println(c2 instanceof DumpTruck);
		System.out.println(c3 instanceof Car);
		System.out.println(c3 instanceof DumpTruck);
	}
	
}

class Liquid {
	void drink() {
		System.out.println("정체불명의 액체를 마셨습니다.");
	}
}

class Water extends Liquid {
	// 오버라이드 : 상속받은 자식 클래스에서 메서드를 덮어쓰기 하는 것
	void drink() {
		System.out.println("물을 마셔서 갈증을 해소했습니다.");
		
	}
}

class Alcohol extends Liquid {
	void drink() {
		System.out.println("술을 마셔서 기분이 좋아졌습니다. 머리도 아픕니다.");
	}
}