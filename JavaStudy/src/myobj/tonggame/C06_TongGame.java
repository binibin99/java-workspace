package myobj.tonggame;

public class C06_TongGame {

	/*
	 * 통아저씨 게임을 만들어보세요
	 * 
	 * (1) 게임이 시작되면 꽝 자리가 정해진다
	 * 
	 * (2) 플레이어는 아저씨가 발사될때까지 계속 자리를 선택해야 한다
	 * 
	 * (3) 칼을 찌를 수 있는 홈은 20개가 있고 그 중 4개가 꽝이 된다 (통의 위치는 매 판마다 랜덤으로 재설정되어야 한다) (4)
	 * 아저씨가 발사되면 몇 번 만에 발사되었는지 알려주는 메세지가 나온다
	 * 
	 */
	public static void main(String[] args) {
		Tongaz.insertMAX = (int)(Math.random() * 20);
		
		
		
		System.out.printf("%s",Tongaz.insertMAX);
		
	}
}
