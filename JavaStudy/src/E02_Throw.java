import java.io.FileNotFoundException;
import java.util.InputMismatchException;

public class E02_Throw {
	/*
	  	# throw - 내가 원하는 예외를 발생시킨다 
	  	- throw 하는 즉시 해당 메서드를 종료한다 
	  	- return과 다른 점은 예외를 catch하여 사용할 수 있다는 점이다 
	  	# throws 
		- 이 메서드에서 발생할 수도 있는 예외를 적어둔다 
	 	- 이 메서드를 불러 사용하는 곳에 그 예외가 발생할 수 있음을 미리 알려준다 
	 	- 반드시 처리되어야 하는 예외들을 명시해줄 떄 유용하다
	 */
	public static void testMethod(int value) throws FileNotFoundException {
		if (value == 190) {
			throw new ArrayIndexOutOfBoundsException("그냥");
		} else if (value == 191) {
			throw new InputMismatchException("그냥2");
		} else if (value == 192) {
			// 어떤 예외들은 반드시 예외처리가 되어야 한다
			throw new FileNotFoundException();
		}
	}

	public static void main(String[] args) {

		try {
			testMethod(190);
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("예외처리 완료");
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		}
		System.out.println("프로그램 정상 종료");
	}
}
