package quiz;

import java.util.Scanner;

public class B07_Palindrome_2 {

	public static void main(String[] args) {
	
	Scanner sc = new Scanner(System.in);
	String reversed = "";
	System.out.print("단어를 입력해주세요 >");
	String str = sc.next();
	int count;
	
	for (int i = 0; i < str.length(); ++i) {
		reversed += str.charAt(str.length() -1 - i);
	}
		System.out.printf("원본 : %s\n반전 : %s\n", str, reversed);
		
		if (str.equals(reversed)) {
			System.out.println("좌우대칭 입니다.");
		} else {
			System.out.println("좌우대칭이 아닙니다. ");
		

		}
			
		
	}
}
