
public class D09_StringBuilder {
	
	/*
	  	# StringBuilder
	  	
	  	- 문자열을 조립할때 쓰는 기능들이 모여있는 클래스
	  	- 누적 연산(+=)을 통해 문자열을 조립하는것보다 속도가 훨씬 빠르다
	 */
	public static void main(String[] args) {
		// 한번 만들어진 String은 수정이 불가능하기 때문에
		// 실제로는 계속 새로운 인스턴스를 만든다 (== 속도가 느리다)		
		String str = "";
		
		str += "a"; // new String("a");
		str += "b"; // new String("ab");
		str += "c"; // new String("abc");
		
		System.out.println(str);
		
		// 문자열 조립을 위한 클래스를 사용하면 속도가 훨씬 빠르다
		// StringBuilder sb = new StringBuilder(); // ""로 시작
		
		StringBuilder sb = new StringBuilder("가나다"); // "가나다"로 시작
		
		// append(value) : 문자열의 맨 뒤에 내용 추가
		sb.append("a");
		sb.append("b");
		sb.append("c");
		sb.append("de");
		sb.append("fgh");
		
		// insert(index, value) : 조립 문자열의 원하는 자리에 내용 추가
		sb.insert(1, '@');
		
		// delete(start, end) : 조립 문자열의 원하는 부분을 지운다 (start이상 end미만)
		sb.delete(2, 3);
		
		// reverse() : 조립하던 문자열을 만대로 뒤집는다
		sb.reverse();
		
		String result = sb.toString();
		
		System.out.println("문자열 조립 끝! " + result);
	}

}
