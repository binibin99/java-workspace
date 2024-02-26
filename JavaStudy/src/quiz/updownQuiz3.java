package quiz;

import java.util.Scanner;

public class updownQuiz3 {

   /*
       # Updown 게임 만들기
       
        1. 게임이 시작되면 1 ~ 100 사이의 랜덤 숫자를 정답으로 선택한다
           (사용자에게는 비밀로 한다)
           
        2. 사용자가 숫자를 입력하면 UP인지 DOWN인지 정답인지 알려준다
        
        3. 정답이 입력한 숫자보다 크다면 사용자에게 UP이라고 알려준다
           정답이 입력한 숫자보다 작다면 사용자에게 DOWN이라고 알려준다
           정답이 입력한 숫자와 일치하면 정답이라고 알려준 후 플레이어가 승리한다
        
        4. 5번안에 못 맞추면 정답이 뭐였는지 알려주고 플레이어의 패배로 프로그램을 종료한다
        
        5. 정답을 맞추면 몇 번만에 맞췄는지 알려주고 프로그램을 종료한다 
        
        6. 사용자가 범위를 벗어나는 숫자를 입력하면 다시 입력할 수 있게 해준다  
   */
   public static void main(String[] args) {

      Scanner sc = new Scanner(System.in);
      
      final int MAX_CHANCE = 10;
      int chance = MAX_CHANCE;
      
      int answer = (int)(Math.random() * 100 + 1);
      boolean userWin = false;
      
      System.out.println("정답 (테스트용) : " + answer);
      
      while (chance > 0) {
         System.out.print("숫자를 고르세요 (1 ~ 100) : ");
         int select = sc.nextInt();
         
         if (select > 100 || select < 1) {
            System.out.println("숫자의 범위를 올바르게 입력해주세요.");
            continue;
         }
         
         --chance;
         
         if (select > answer) {
            System.out.println("DOWN!!");
         } else if (select < answer) {
            System.out.println("UP!!");
         } else {
            System.out.println("정답!!");
            userWin = true;
            break;
         }
         
         System.out.println("남은 기회 : " + chance);
      }
      
      if (userWin) {
         System.out.printf("%d번 만에 맞추셨습니다!!\n", MAX_CHANCE - chance);
      } else {
         System.out.printf("패배하셨습니다... 정답은 %d이었습니다.\n", answer);
      }
      
   }
   
}










