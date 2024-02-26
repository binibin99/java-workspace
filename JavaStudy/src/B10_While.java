
public class B10_While {

	/*
	 * # whlie
	 * 
	 * - for문과 사용법이 약간 다른 반복문 - 초기값과 증감값의 위치가 정해져 있지 않아 for문보다 자유롭다 - ()안의 내용이
	 * true라면 {}안의 내용을 계속 반복한다 - 증감값의 위치에 따라 결과가 달라지는 것에 주의해야 한다
	 */
	public static void main(String[] args) {
		
		// 0 ~ 9까지 10개
		int i = 0;
		while (i < 10) {
			System.out.println("hi " + i++);
		}
		System.out.println("---------------");
		// 1 ~ 10까지 10개
		i = 0;
		while (i < 10) {
			System.out.println(++i);
		}
		// 1 ~ 10까지 10개
		System.out.println("---------------");
		i = 0;
		while (++i < 10) {
			System.out.println(i);
		}
		i = 0;
		while (i++ < 0) {
			System.out.println(i);
		}
		
		
		// while문으로 문자열 탐색해보기
		String str = "미국 정부는 북한과 러시아가 4년여 만에 정상회담을 벌이고 군사 협력을 강화하기로 한 데 대해"
				+ ", 상황을 면밀히 주시하겠다면서 필요시 제재로 대응할 것임을 분명히 했습니다"
				+ ". 북한과 러시아의 인공위성 개발 협력 문제에 대해서도 "
				+ "안보리 결의 위반이라는 점을 "
				+ "거듭 밝혔습니다. ";
		
		int len = str.length();
		int index = 0;
		
		while (index < len) {
			char ch = str.charAt(index);
			System.out.printf("[%d]: %c\n", index, ch);
			
			++index;
		}
	}

}
