public class E03_CustomException {

	/*
	 	# Exception - 반드시 처리해야 하는 예외 
	  	- 이 예외는 처리하지 않으면 컴파일을 진행할 수 없다 
	  	# RuntimeException 
	  	- 굳이 처리하지 않아도 되는 예외
	 */

	public static void method1() throws NotMustHandledException {
		throw new NotMustHandledException();
	}

	public static void method2() throws MustHandledException {
		throw new MustHandledException();
	}

	public static void main(String[] args) {
		method1();
		try {
			method2();
		} catch (MustHandledException e) {
			e.printStackTrace();
		}
	}

}

// Exception 또는 RuntimeException을 상속받은 클래스는 throw가 가능하다
class MustHandledException extends Exception {
	public MustHandledException() {
		super("내가 만든 예외 메세지");
	}
}

class NotMustHandledException extends RuntimeException {
	public NotMustHandledException() {
		super("반드시 처리하지는 않아도 되는 메세지");
	}
}
