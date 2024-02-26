import java.io.BufferedInputStream;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
import java.io.InputStreamReader;

public class E08_BufferdStream {
	
	/*
	  	# Buffered
	  	
	  	- 데이터를 하나씩 전송하는 것이 아니라 모아서 한번에 전송하는 것
	  	- BufferedReader/Writer : 버퍼를 사용하고 문자 단위로 데이터를 입출력
	  	- BufferedInputStream/OutputStream
	  	  : 버퍼를 사용하고 바이트 단위로 데이터를 입출력	 
	 */
	public static void main(String[] args) {
		
		File f = new File("myfiles/emails.txt");
		
		// 기존의 FileReader에 버퍼 기능을 추가해 사용할 수 있다
		try (
			FileReader fin = new FileReader(f);
			BufferedReader in =	new BufferedReader(fin);
		){
			
			String line;
			while ((line = in.readLine()) != null) {
				System.out.println(line);
				}
		} catch (FileNotFoundException e) {
			e.printStackTrace();
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// new BufferedInputStream();
		// new BufferedWriter();
		// new BufferedOutputStream();
		
		// System.in은 inputStream이기 떄문에
		// 콘솔에서 발생한 입력을 byte단위로 전송받게 된다
		
		BufferedInputStream in = new BufferedInputStream(System.in);
		
		try {
			System.out.println(">> ");
			int data = in.read();
			System.out.println(data);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// InputStreamReader
		// : 바이트 단위의 InputStream을 문자 단위로 조립해주는 중간 클래스
		InputStreamReader isr = new InputStreamReader(System.in);
		
		try {
			System.out.println("isr >> ");
			int ch = isr.read();
			
			System.out.println((char)ch);
		} catch (IOException e) {
			e.printStackTrace();
		}
		
		// 콘솔의 내용을 문자로 다루면서 한 줄씩 입력받기 위해 BufferedReader로
		// 업그레이드 해서 사용
		BufferedReader bin = new BufferedReader(isr);
		try {
			System.out.println("buffered >> ");
			String line = bin.readLine();
			
			System.out.println(line);
		} catch (IOException e) {
			e.printStackTrace();
		}
	
	}

}
