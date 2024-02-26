package quiz;

import myobj.lotto.LottoGame;

public class C04_LottoGame {

	/*
	 * # 로또 게임 만들기
	 * 
	 * 1. 당첨 번호는 7개이고 1등 당첨이 되면 다음 당첨 번호로 넘어간다
	 * 
	 * 2. 플레이어는 번호 6개를 입력해 숫자를 맞춰야 한다 (자동 기능 사용 가능)
	 * 
	 * 3. 1등: 앞에 6개의 숫자를 모두 맞춤 2등: 보너스 번호를 포함한 6개의 숫자를 맞춤 3등: 5개의 숫자를 맞춤 (보너스 번호
	 * 미포함) 4등: 4개의 숫자를 맞춤 (보너스 번호 미포함) 5등: 3개의 숫자를 맞춤 (보너스 번호 미포함)
	 * 
	 * 4. 플레이어가 게임을 종료할때까지 게임이 계속 된다
	 * 
	 * <화면 예시>
	 * 
	 * 1. 자동 구매 2. 수동 구매 3. 현재까지의 이력 확인 (사용 금액, 당첨 횟수, 손익 계산) 4. 게임 종료
	 * 
	 * 순서 : 1. 1~45 까지의 배열에서 7개의 중복 없는 숫자 뽑기 2. 내 번호 6개를 입력해서 숫자 맞추기 (Scanner sc =
	 * new Scanner(system.in); sc = nextInt(); (for문으로 돌려서 비교 후 등수 맞춰보고 당첨되면 당첨금 sum
	 * +=로 누적 연산 시켜주기) 3. 한번 돌았을때 구매자의 진행의사 물어보기 (진행의사를 입력받아 yes면 진행 no면 멈추기 or 자동으로
	 * 몇번 돌릴건지 입력받아 for문으로 입력 받은 숫자 만큼 반복 시킨 후 당첨금액과 손실금액 누적시키기) (++count를 사용하여 당첨
	 * 횟수 누적시키기 , ++money를 사용하여 사용금액 누적시키기(매회차마다 사용금액 표시가능)) 4. 자동이나 수동으로 돌렸을때 게임이
	 * 끝나면 종료할건지 물어보기 (yes면 종료 no면 처음으로 돌아가 다시 진행의사 묻기) 5. 게임이 끝나면 총 이력 계산하기
	 * 
	 * 
	 * 
	 */
	public static void main(String[] args) {
		
		new LottoGame().play();

//		LottoNumber winNum = new LottoNumber(true);

//		for (int i = 0; i < 5; ++i) {
//			LottoNumber guess = new LottoNumber(false);
//
//			int result = guess.check(winNum);
//			
//			winNum.print();
//			guess.print();
//			System.out.println(result + "등입니다!!");
	}
}
	

