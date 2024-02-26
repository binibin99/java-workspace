package myobj.baseball;

import java.util.Arrays;
import java.util.Scanner;

public class BaseballGame {
   
   Scanner sc = new Scanner(System.in);
   
   int [] answers;
   int chance = 9;
   
   boolean DEBUG_MODE = true;
   
   
   public BaseballGame() {
      answers = new int[4];
      initAnswer();
   }
   
   public void initAnswer() {
      for(int i = 0; i < answers.length; ++i) {
         answers[i] = (int) (Math.random() * 10);
         for (int j = 0; j < i; ++j) {
            if (answers[i] == answers[j]) {
               --i;
            }
         }
      }
   }
   
   public void play() {
      while (chance > 0) {
         if (DEBUG_MODE) {
            System.out.println(Arrays.toString(answers));
         }
         System.out.println("남은기회: " + chance);
         System.out.print(">> ");
         String userGuess = sc.next();
         
         // 사용자가 입력한 userGuess와 현재 정답인 answers를 비교한 결과가 필요함
         checkPitch(userGuess);
         PitchResult result = checkPitch(userGuess);
         System.out.printf("%s : %ds %db\n", 
               result.getGuess(), result.getStrike(), result.getBall());
         if (result.strike == 4) {
            System.out.println("승리!!");
            break;
         }
         --chance;
      }
      System.out.println("게임을 종료합니다");
   }
   // 체크 결과 리턴해야 하는 값이 여러개인 경우 
   // 데이터를 클래스로 묶어서 전달하는 방식을 고려해 볼 수 있다
   public PitchResult checkPitch(String userGuess) {
      char[] guess = userGuess.toCharArray();
      int strike = 0;
      int ball = 0;
      
      for (int i = 0; i < answers.length; ++i) {
         for (int j = 0; j< guess.length; ++j) {
            if (answers[i] == (guess[j] - '0')) {
               if (i == j) {
                  ++strike;
               } else {
                  ++ball;
               }
               break;
            }
         }
      }
      PitchResult result = new PitchResult(userGuess, strike, ball);
      return result;
   }
}

// 객체를 담을 수 있는 배열을 생성하여 중복 번호 체크