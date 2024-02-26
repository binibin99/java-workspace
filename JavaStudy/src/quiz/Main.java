package quiz;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.BufferedWriter;
import java.io.IOException;
import java.io.OutputStreamWriter;
import java.util.StringTokenizer;

public class Main {

public static void main(String[] args) throws IOException {

	BufferedReader bf = new BufferedReader(new InputStreamReader(System.in)); //선언
	int a = Integer.parseInt(bf.readLine()); //입력받은 횟수를 int로 변환
	
	for(int i = 0; i < a; i++) {
		StringTokenizer st = new StringTokenizer(bf.readLine()); 
		int num1 = Integer.parseInt(st.nextToken()); //첫번째 호출
		int num2 = Integer.parseInt(st.nextToken()); //두번째 호출
		
		BufferedWriter bw = new BufferedWriter(new OutputStreamWriter(System.out)); //할당된 버퍼에 값 넣어주기
		bw.write(num1 + num2 +"\n"); //출력
		bw.flush(); //남아있는 데이터 모두 출력
	}
}
}