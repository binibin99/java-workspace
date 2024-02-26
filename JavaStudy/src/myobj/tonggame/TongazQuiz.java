package myobj.tonggame;

public class TongazQuiz {
	
	public static void main(String[] args) {

		Tongaz[] tong = new Tongaz[20];

		for (int i = 0; i < tong.length; ++i) {
			tong[i] = new Tongaz();
		}
	}
}



class Tongaz {
	// 생성된 모든 벽에서 동일할 값
	static int insertMAX = 20; // 통 최대 꽂는 개수
	static int failinsert = 4; // 꽝 개수
	static int succesinsert = 16; // 성공 개수
	

	// 각 벽마다 다를 값
	int failplace; // 꽝 위치
	int insertplace; // 성공하는 위치
	int count; // 통아재 발사까지 걸린 횟수
	
} 
