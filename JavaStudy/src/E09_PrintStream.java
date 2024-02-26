import java.io.BufferedWriter;
import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class E09_PrintStream {

	/*
	 * # printstream
	 * 
	 * - 문자를 훨씬 편리하게 출력할 수 있는 기능을 가지고 있는 클래스 - println(), pirnf(), print() 등을 사용할 수
	 * 있다 - BufferedStream, BufferedWriter -> 성능 증가 - PrintStream, PrintWriter ->
	 * 편리함 증가
	 */
	public static void main(String[] args) {
		// PrintWriter로 파일에 출력하기
		try (
			FileWriter fout = new FileWriter(new File("myfiles/print.txt"));
			BufferedWriter bout = new BufferedWriter(fout);
			PrintWriter out = new PrintWriter(bout);
		) {		
			out.printf("%s는 %d원입니다.\n", "사과", 800);
			out.println("Hello, world!");
		} catch (IOException e) {
			e.printStackTrace();
		}
	}

}
