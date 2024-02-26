package quiz;

import java.util.Scanner;

public class B00_memo {

	public static void main(String[] args) {

		Scanner sc = new Scanner(System.in);

		int a = sc.nextInt();
		String strB = sc.next();
		
		for (int i = 0; i < strB.length(); ++i) {
			char ch = strB.charAt(strB.length() -i -i);
			System.out.println(a * (ch - '0'));
		}
		System.out.println(a * Integer.parseInt(strB));
		
	}

}
