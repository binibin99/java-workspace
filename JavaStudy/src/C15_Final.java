
public class C15_Final {
	
	/* 
	 	# final
	 	
	 	- 변수 앞에 final을 붙이면 이후로는 변경할 수 없는 값이 된다 (상수)
	 	- 메서드 앞에 final을 붙이면 오버라이드가 금지된다
	 	- 클래스 앞에 final을 붙이면 해당 클래스는 상속이 금지된다
	 */
	 public static void main(String[] args) {
		 
		 // 변수 선언 시 앞에 final을 붙이면 해당 변수는 변경이 불가능해짐
		 final int a = 10;
		 
	 }

}

class Unit {
	int hp;
	int attack;
	
	public void hit() {
		System.out.println(attack + "의 공격력으로 때립니다!");
	}
	
	// 메서드에 final을 붙이면 오버라이드가 금지된다
	final public void gotHit(int attack) {
		hp = hp - attack;
	}
}
// 클래스에 final을 붙이면 더 이상 상속이 불가능해진다
final class UnderGroundUnit extends Unit {
	boolean borrow = false;	
	
	void borrow() {
		borrow = true;
	}
	
	void unborrow() {
		borrow = false;
	}
	
	@Override
	public void hit() {
		if (borrow) {
			System.out.println("땅 속에 있는 상태이기 때문에 공격이 가능합니다");
		} else {
			System.out.println("땅 위에서는 공격을 할 수 없습니다");
		}
	}
	
}
