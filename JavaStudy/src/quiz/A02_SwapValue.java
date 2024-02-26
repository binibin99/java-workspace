package quiz;

public class A02_SwapValue {
	
	public static void main(String[] args) {
		
		int a = (int)(Math.random() * 30);
		int b = (int)(Math.random() * 10);
		
		System.out.println("바꾸기 전 a: " + a);
		System.out.println("바꾸기 전 b: " + b);
		
		// 코드를 추가해 두 변수의 값을 바꿔서 출력해보세요
		
		int temp = a; // b에 a를 넣기 전에 임시 변수를 만들어서 a값을 빼놓는다
		a = b;
		b = temp; // 임시 변수에 저장해놨던 a의 원래 값을 b에 넣는다
		
		//////////////////////////////////////////////////

		
		System.out.println("바꾼 후 a: " + a);
		System.out.println("바꾼 후 b: " + b);
		
	    
	    
		
		
	}
	
}   
