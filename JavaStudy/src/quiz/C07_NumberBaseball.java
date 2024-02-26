package quiz;

import java.util.Arrays;

import myobj.baseball.BaseballGame;

public class C07_NumberBaseball {
   /*
    # 숫자 야구 게임
    
    - 게임이 시작되면 정답이 랜덤으로 생성된다
    - 정답은 랜덤 4자리의 중복없는 숫자
    - 플레이어에게는 9번의 기회가 주어지며 4자리의 숫자를 마음대로 입력할 수 있다
    - 플레이어가 중복되는 숫자를 입력하는 경우 다시 입력하게 한다
    - 플레이어가 입력한 숫자의 번호와 위치가 모두 맞으면 스트라이크라고 한다
    - 플레이어가 입력한 숫자의 번호는 맞되 위치가 틀리면 볼이라고 한다
    - 플레이어가 9번의 기회 안에 모든 숫자와 위치를 맞추면 사용자의 승리
    - 모든 기회 소진시 플레이어 패배
    */
   
   public static void main(String[] args) {
      new BaseballGame().play();

   }
}