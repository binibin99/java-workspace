package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class J04_Transaction {

   public static void main(String[] args) {
      
      try (Connection conn = JdbcConnection.getConnection();){
         //해당 연결 인스턴스의 자동 커밋을 비활성화해야
         //커밋과 롤백을 활용한 트랜잭션관리가 가능하다
         conn.setAutoCommit(false);
         String sql1 = "INSERT INTO "
         		+ "fruits(fruit_id, fruit_name, fruit_price) "
         		+ "VALUES(fruit_id_seq.nextval,'Pineapple',5000)";
         
         try (PreparedStatement pstmt = conn.prepareStatement(sql1)) {
            for (int i = 0; i < 5; ++i) {
               
               pstmt.executeUpdate();
            }
         }
         if ((int)(Math.random() * 2) == 1) {
            System.out.println("파인애플 5개가 추가된 후 커밋되었습니다");
            conn.commit();//커밋
         } else {        
            System.out.println("파인애플 5개가 추가되었다가 롤백되었습니다");
            System.out.println("롤백 되더라도 시퀀스 번호는 돌아가지 않습니다..");
            conn.rollback();//롤백
         }
      } catch (SQLException e) {
         e.printStackTrace();
      }
   }
}