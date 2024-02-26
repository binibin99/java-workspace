
public class C02_Overloading {
	
	/*
	  	# 함수 (메서드) 오버로딩
	  	
	  	- 같은 이름으로 다른 매개변수를 받는 다양한 버전의 함수를 만드는 문법
		- 매개 변수의 개수 또는 타입이 다르면
	 	- 매개 변수의 개수가 다르거나 또는 타입이 다르면 
	 	  함수의 이름이 같더라도 각 함수를 구분할 수 있기 때문에
	 	  같은 이름의 함수를 여러개 선언할 수 있다
	 	  
	 	  ex) System.out.println()
	 */
	
	// 매개변수의 개수가 다른 오버로딩
	public static int add(int value1, int value2) {
		return value1 + value2;
	}
	// 메서드의 리턴타입이나 매개 변수명이 다른 것만으로는 오버로딩이 불가능하다
	
	//public static String add(int v1, int v2) {
	//	return "결과는" + (v1 + v2) + "입니다.";
	// 매개변수의 개수는 같지만 타입은 다른 오버로딩
	public static double add(double value1, double value2) {
		return value1 + value2;
	}
	
	public static int add(int v1, int v2, int v3) {
		return v1 + v2 + v3; 
	}
	
	public static void main(String[] args) {
		// int, int
		add(8, 11);
		//double, double
		add(3.3, 9.1);
		// int, double 오버로딩은 만들어놓지 않았지만
		// double, double 오버로딩에 int가 무리없이 들어갈 수 있으므로
		// 해당 오버로딩을 사용한다
		add(300,  3.3);
		
		
		System.out.println(new char[] {'H', 'E','L','L','O'});
		System.out.println();
		System.out.println(add(5, 10));
		System.out.println(add(5, 10));
		
	}

}
