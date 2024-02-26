package quiz;

public class B14_lotto {

	/*
	 * 1. 랜덤으로 로또 당첨 번호를 생성해보세요 (1 ~ 45의 중복 없는 랜덤 숫자 7개, 마지막 번호는 보너스 번호)
	 * 
	 * 2. 1등에 당첨 될 때까지 로또 번호를 자동으로 계속 생성하여 몇 번 만에 당첨되었는지 출력해보세요 (자동 번호는 1 ~ 45의 중복
	 * 없는 랜덤 숫자 6개)
	 * 
	 * 3. 1등에 당첨 될 때까지 뽑는 동안 2등에 당첨되는 번호들도 출력해주세요
	 */
	
	public static void main(String[] args) {

		int[] winNums = new int[7];
		
		int i = 0;
		int len = winNums.length;
		while (i < len) {
			winNums[i] =(int)(Math.random() * 45 + 1);
			
			int j = 0;
			boolean duplicate = false;
			while (j < i) {
				if (winNums[j] == winNums[i]) {
					duplicate = true;
					break;
				}
				
				++j;
			}
			
			if (!duplicate) {
				++i;
			}
			for (i = 0; i < len; ++i) {
				System.out.printf("winNums[%d]: %d\n", i, winNums[i]);
				
			}
		}
	}
}

	


//int firstlotto = lotto[1];
//int secondlotto = lotto2[1];
//
//for (int i = 0; i < lotto2.length; ++i) {
//	if (firstlotto == lotto2[i]) {
//		for (int j = 0; j < lotto.length; ++j) {
//			if (secondlotto == lotto[i]) {
//
//			}
//
//	}
//		System.out.println("같다");
