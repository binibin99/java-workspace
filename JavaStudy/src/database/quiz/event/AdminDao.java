package database.quiz.event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

// DAO (Database Access Object) - DB에 쿼리문 보내고 결과 반영하는 객체
public class AdminDao {

	// 1. 새로운 상품을 추가하는 메서드
	public int addPrize(String prize_name, Double prize_rate, Integer init_qty) {
		try (
			Connection conn = DBConnector.getConnection();
		) {
			conn.setAutoCommit(false);

			String sql = "INSERT INTO eventprizes(prize_id, prize_name," 
					+ "prize_rate, remain_qty, init_qty) VALUES("
					+ "event_prize_id_seq.nextval,"
					+ " ?, ?, ?, ?)";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setString(1, prize_name);
				pstmt.setDouble(2, prize_rate);
				pstmt.setInt(3, init_qty);
				pstmt.setInt(4, init_qty);

				pstmt.executeUpdate();
			}
			// Insert 후 확률이 100퍼센트가 넘는지 체크가 필요하다..
			String sql2 = "SELECT sum(prize_rate) AS \"total_rate\" FROM eventprizes";

			try (PreparedStatement pstmt = conn.prepareStatement(sql2);
				ResultSet rs = pstmt.executeQuery();) {
				// 한 행 꺼내기
				rs.next();
				Double total_rate = rs.getDouble(1);
				
				if (total_rate > 1) {
					System.out.println("총 확률이 100퍼센트가 넘어서 상품추가가 취소되었습니다...");
					conn.rollback();
					throw new SQLException("rate error");
				} else {
					System.out.println("상품이 정상적으로 추가되었습니다.");
					conn.commit();
				}
			}
			return 1;
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 2. 기존의 상품을 삭제하는 메서드
	public int deletePrize(int pk) {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "DELETE FROM eventprizes WHERE prize_id=?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, pk);
				return pstmt.executeUpdate();
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
	}
	// 3. 기존 상품의 초기 수량을 변경하는 메서드
	public int updateQty(int pk, int qty) {
		
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE eventprizes SET init_qty = ?"
					+ "WHERE prize_id = ?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, qty);
				pstmt.setInt(2, qty);
				
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
	}

	// 4. 기존 상품의 확률을 변경하는 메서드
	public int updateQty(int pk, Double rate) {
		
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE eventprizes SET prize_rate = ?"
					+ "WHERE prize_id = ?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setDouble(1, rate);
				pstmt.setInt(2, pk);
				
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
	}

	// 5. 기존의 상품 하나의 수량을 리셋하는 메서드
	public int reset(int pk) {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE eventprizes SET remain_qty = init_qty "
					+ "WHERE prize_id = ?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, pk);
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	// 6. 기존의 모든 상품의 수량을 리셋하는 메서드
	public int resetAll() {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE eventprizes SET remain_qty = init_qty ";

			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				return pstmt.executeUpdate();
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
	}

	
	public static void main(String[] args) {
		AdminDao dao = new AdminDao();
		
	//	System.out.println(dao.deletePrize(1));
		
		dao.addPrize("청소기", 0.08, 15);
		dao.addPrize("컴퓨터", 0.02, 5);
		dao.addPrize("냉장고", 0.02, 5);
	}

}
