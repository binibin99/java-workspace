package database.quiz;

import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.quiz.event.EventDao;
import database.quiz.event.model.Prize;

public class J06_PrizeEvent {

   /*
    * #DB와 연동되는 경품 추럼 이벤트를 구현해보세요
    * 
    * (1) DB에 경품들의 이름, 당첨확률, 남은 수량 등 필요한 정보를 저장할 수 있는 테이블을 생성해보세요
    * 
    * 상품ID/ 상품명/ 당첨확률/ 남은수량 /초기수량 (2) 콘솔에서 뽑기를 진행하면 실제로 DB에서 수량이 줄어들게 만들어보세요
    * 
    * (3) 상품이 모두 소진되면 이벤트가 종료되었음을 알려주고 프로그램이 종료
    * 
    * (4) 리셋 기능을 실행하면 DB의 상품이 다시 충전되어야 합니다
    * 
    */

   List<Prize> box = new ArrayList<>();

   EventDao eventDao = new EventDao();

   public J06_PrizeEvent() {
      List<Prize> prizeList = eventDao.selectAllPrizes();
      int count = 0;

      for (Prize p : prizeList) {
         int r = (int) (p.getPrize_rate() * 1000);
         for (int i = 0; i < r; ++i) {
            box.add(p);
            ++count;
         }
      }
      while (count < 1000) {
         box.add(null);
         ++count;
      }
   }

   public Prize draw() throws SQLException {
      if (eventDao.getAllPrizesRemainQty() <= 0) {
         throw new SQLException("모든상품 소진됨");
      }
      Prize p = box.get((int) (Math.random() * 1000));

      // DB에 수량 감소 반영
      if (p != null) {
         //수량이 이미 0이라 감소에 실패한 경우 -1
    	  
         int result = eventDao.reduceRemainQty(p.getPrize_id());
         if(result == -1) {
            System.out.println("이미 수량이 0이라 뽑지 못했습니다");
            return p;
         }
         // 감소시킨 뒤 현재 수량 읽어서 프로그램에 반영
         Prize p2 = eventDao.getPrize(p.getPrize_id());
         p.setRemain_qty(p2.getRemain_qty());
      }

      return p;
   }

   public static void main(String[] args) {
      J06_PrizeEvent event = new J06_PrizeEvent();

      for (int i = 0; i < 100; ++i) {
//      while(true) {
      Prize p;
         try {
            p = event.draw();

         } catch (SQLException e) {
            System.out.println("모든상품 소진됨");
            break;
         }
         if (p != null) {
            System.out.println(p);
         }
      }
      System.out.println("프로그램 종료");
   }

}