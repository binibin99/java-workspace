import myobj.Apple;


public class C04_Constructor {
	
	/* 
	 	# 클래스의 생성자 (Constructor)
	 	
	 	- 해당 클래스의 새 인스턴트를 생성할 때 new와 함계 호출하는것
	 	- 해당 클래스 이름과 동일한 이름으로 사용하며 리턴 타입은 적지 않는다
	 	- 클래스 내부에 선언한 생성자가 하나도 없는 경우
	 	  자동으로 아무것도 없는 기본 생성자가 생성되어 있다
	 */
	public static void main(String[] args) {
		
		myobj.Apple a1 = new myobj.Apple(300, 9, 10, "red");
		myobj.Apple a2 = new myobj.Apple(330, 7, 9, "green");
		Apple a3 = new Apple(400, 11, 8.8, "blue");
		Apple a4 = new Apple();
		
		a1.info();
		a2.info();
		a3.info();
		a4.info();
		

	}

}



// 아까 각자 만들었던 클래스를 myobj로 옮기고 생성자를 추가해보세요
