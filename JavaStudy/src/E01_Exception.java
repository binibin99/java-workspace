import java.util.InputMismatchException;
import java.util.Scanner;

public class E01_Exception {

	/*
	 	# 예외 (Exception) 
	 	- 프로그램 실행 도중 문제가 생겨 발생하는 에러들을 예외라고 부른다 
	 	(우리가 에러라고 생각했던 빨간글씨들) 
	 	- 자바의 문법을 틀리는 것은 예외가 아니라 컴파일 에러라고 부른다 
	 	(컴파일 에러는 아예 실행되지 않는다. 자바 문법상 오류) 
	 	- 프로그래머는 발생할 수 있는 예외를 미리 예상하여 대비해둘 수 있다 
	 	# 예외처리 (try-catch-finally) 
	 	- 예외가 발생할 가능성이 있는 코드를 try문 내부에 포함시킨다 
	 	- try문 내부에서 예외가 발생하지 않으면 평소대로 정상 작동한다 
	 	- try문 내부에서 예외가 발생하면 즉시 try문을 중단하고 발생한 예외에 해당하는 catch문으로 이동한다 
	 	- 예외 처리의 기본 동작은 예외 발생 당시상황을 콘솔에 출력하고 프로그램을 강제 종료하는 것이다 
	 	- finally문은 try문 내부에서 예외가 발생하던 안하던 무조건 실행하는구문이다
	 */
	public static void main(String[] args) {
		int[] arr = new int[10];
		try {
			System.out.println("1: " + arr[(int) (Math.random() * 11)]);
			System.out.println("2: " + arr[(int) (Math.random() * 11)]);
			System.out.println("3: " + arr[(int) (Math.random() * 11)]);
			System.out.println("4: " + arr[(int) (Math.random() * 11)]);
			System.out.println("5: " + arr[(int) (Math.random() * 11)]);
			System.out.println("6: " + arr[(int) (Math.random() * 11)]);
			System.out.println("7: " + arr[(int) (Math.random() * 11)]);
			Scanner sc = new Scanner(System.in);
			System.out.print("반드시 정수만 입력해주세요 > ");
			int value = sc.nextInt();
		} catch (ArrayIndexOutOfBoundsException e) {
			System.out.println("배열 크기가 넘쳤습니다!!");
			// 예외 객체에 담겨있는 예외 발생 당시의 스택 상황을 콘솔에 출력한다
			// (예외 처리의 기본동작)
			e.printStackTrace();
		} catch (InputMismatchException e) {
			System.out.println("내가 반드시 정수만 입력하라고 했을텐데?");
			System.out.println("기분 나빠서 강제종료합니다.");
			// System.exit(0); // 프로그램 종료 (finally 출력안됨)
			return; // 메인 메서드 종료 (finally 출력됨)
		} finally {
			System.out.println(" /)/)");
			System.out.println("( ..)");
			System.out.println("( >♬");
		}
		System.out.println("프로그램이 정상종료되었습니다.");
	}
}
