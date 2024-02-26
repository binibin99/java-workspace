package quiz;

public class B12_TempPassword2 {

	/*
	 * 대문자,소문자,특수문자,숫자로 구성된 랜덤 비밀번호 6자리를 생성하여 출력하는 프로그램을 만들어보세요
	 * 
	 * ※ 사용 가능한 특수문자 - !@#$%^&*():;=+-_[]
	 */
	
	public static void main(String[] args) {
		
		// final : final을 붙이고 선언한 변수는 값을 변경할 수 없다
		final String MY_PWD_CHARSET = "ABCDEFGHIJKLMNOPQRSTUVWXYZ"
				+ "abcdefghijklmnopqrstuvwxyz"
				+ "0123456789"
				+ "!@#$%^&*():;=+-_[]";
		System.out.println("내 문자셋의 길이: " + MY_PWD_CHARSET.length());
		
		int len = MY_PWD_CHARSET.length();
		
		String tempPassword = "";
		for (int i = 0; i < 6; ++i) {
			tempPassword +=
					MY_PWD_CHARSET.charAt((int)(Math.random() * len));
			
		}
		
		System.out.println("생성된 임시비밀번호 " + tempPassword);
	}
}
	
	