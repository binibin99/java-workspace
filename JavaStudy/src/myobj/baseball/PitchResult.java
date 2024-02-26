package myobj.baseball;

//여러가지 데이터를 보기좋게 묶어서 담아놓기 위한 클래스
public class PitchResult {
   
   String guess;
   int strike;
   int ball;
   
   public PitchResult(String guess, int strike, int ball) {
      this.guess = guess;
      this.strike = strike;
      this.ball = ball;
   }

   // get + 컨트롤 스페이스
   public int getBall() {
      return ball;
   }
   
   public String getGuess() {
      return guess;
   }
   
   public int getStrike() {
      return strike;
   }
}