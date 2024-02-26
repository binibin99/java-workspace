package quiz;

public class D09_CaesarCipher {

	/*
	 * # 시저 암호
	 * 
	 * - 알파벳을 일정한 거리만큼 밀어서 다른 알파벳으로 암호화하는 암호 알고리즘 
	 * - 키 값만큼 평문의 모든 알파벳을 오른쪽으로 밀어주면
	 * 암호화가 되고 암호문을 다시 정해진 키 값만큼 왼쪽으로 밀어주면 복호화 된다
	 * 
	 * ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&* abcdefghijklmnopqrstuvwxyz[]/?;'"
	 * 
	 * [평문] key: 10 [암호문] Hello!! -------> RovvyCC 암호화
	 * 
	 * [암호문] key: 10 [평문] RovvyCC -------> Hello!! 복호화
	 */

	// 1. 평문과 키값이 전달되면 해당 평문을 암호화하여 리턴해주는 메서드

	// 2. 암호문과 키값이 전달되면 해당 암호문을 복호화하여 리턴해주는 메서드
	final public static String CAESAR_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ!@#$%^&*0123456789"
			+ "abcdefghijklmnopqrstuvwxyz[]/?;'\"";

	public static String encrypt(String text, int key) {
		StringBuilder sb = new StringBuilder();

		int len = text.length();
		int lenOfCharset = CAESAR_CHARSET.length();

		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);

			if (index != -1) {
				int cipherIndex = (index + key) % lenOfCharset;
				sb.append(CAESAR_CHARSET.charAt(cipherIndex));
			} else {
				// 암호 CHARSET에 없는 문자인 경우 그대로 더해줘야 한다
				sb.append(ch);
			}
		}

		return sb.toString();

	}

	// 2. 암호문과 키값이 전달되면 해당 암호문을 복호화하여리턴해주는 메서드
	public static String decrypt(String text, int key) {
		StringBuilder sb = new StringBuilder();

		int len = text.length();
		int lenOfCharset = CAESAR_CHARSET.length();

		for (int i = 0; i < len; ++i) {
			char ch = text.charAt(i);
			int index = CAESAR_CHARSET.indexOf(ch);

			if (index != -1) {
				int plainIndex = (index - key) % lenOfCharset;

				if (plainIndex < 0) {
					// key값을 뺀 결과가 0보다 작으면..
					sb.append(CAESAR_CHARSET.charAt(lenOfCharset + plainIndex));
				} else {
					// key값을 뺏는데 0보다 크면 그대로 사용한다
					sb.append(CAESAR_CHARSET.charAt(plainIndex));
				}
			} else {
				sb.append(ch);
			}
		}
		return sb.toString();
	}

	public static void main(String[] args) {
		String encryptedText = encrypt("Hello!!!", 999);
		
		System.out.println(decrypt(encryptedText, 999));
	}

}
