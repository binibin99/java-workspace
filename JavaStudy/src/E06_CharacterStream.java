import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.charset.Charset;

public class E06_CharacterStream {
	
	/*
	  	# InputStream / OutputStream
	  	
	  	- byte 단위로 데이터를 입출력하는 클래스
	  	- 데이터를 byte로 분해해서 사용하기 때문에 다소 불편한 점이 있다
	  	
	  	# Reader / Writer
	  	
	  	- char 단위로 데이터를 입출력하는 클래스
	  	- 프로그래머는 데이터를 char단위로 전달하면
	  	  클래스에서 알아서 byte단위로 분해하여 스트림으로 전송한다 (Writer)
	  	- 스트림으로 읽은 데이터를 프로그래머에게 전달할 때는
	  	  알아서 char으로 합쳐서 전달한다 (Reader)
	 */
	public static void main(String[] args) {
		
		// 데이터를 문자 단위로 다룬다는 것 -> Charset을 사용한다는 것
		// 똑같은 2진법 데이터더라도 문자 해석 방식(charset)에 따라 다른 문자가 될 수 있다
		
		// Charset 종류: UTF-8, UTF-16, UTF-KR, MS949, ...
		
		// FileWriter : 문자 단위로 파일에 쓸 수 있는 output
		try {
			FileWriter out = 
					new FileWriter("myfiles/test2.txt", 
						Charset.forName("UTF-8"));
		
			// byte 타입으로의 변환을 신경쓰지 않고 문자 단위로 데이터를 전송할 수 있다
			out.append('A');
			out.append('B');
			out.append('C');
			
			out.append("Hello!!\n");
			out.append("한글도 쓸 수 있습니다.\n");
			
			out.close();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		FileReader in = null;
		
		try {
			in = new FileReader("myfiles/test2.txt",
					Charset.forName("EUC-KR"));	
			
			// read(char[]) : 전달한 배열 크기만큼 읽는다.
			// 읽은 글자의 길이를 반환하고 파일의 끝에 도달하면 -1을 리턴한다.
			
			char[] buff = new char[1024];
			
			int len = in.read(buff);
			
			//char[]과 길이를 용해 문자열 인스턴스를 생성할 수 있다
			System.out.println(new String(buff, 0, len));
			
			// read() : 한 문자씩 읽는다. 파일의 끝에 도달하면 -1을 리턴한다
//			int ch;
//			while ((ch = in.read()) != -1) {
//				System.out.println(ch);
//			}
		
		} catch (FileNotFoundException e) {
			e.printStackTrace();	
		} catch (IOException e) {
			e.printStackTrace();
		} finally {
			// close를 finally문에 하면 100% 확률로 닫을 수 있다
		} try {
			if(in != null) {
				in.close();
			}
		} catch (IOException e) {
			e.printStackTrace();
		}
	}
}
