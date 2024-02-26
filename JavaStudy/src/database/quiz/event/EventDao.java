package database.quiz.event;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

import database.quiz.event.model.Prize;

public class EventDao {
	
	// 1. 모든 상품의 정보를 읽어오는 메서드
	public List<Prize> selectAllPrizes() {
		
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "SELECT * FROM eventprizes";
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql);	
					ResultSet rs = pstmt.executeQuery();
			) {
				List<Prize> list = new ArrayList<>();
				
				while (rs.next()) {
					list.add(new Prize (
								rs.getInt(1),
								rs.getString(2),
								rs.getDouble(3),
								rs.getInt(4),
								rs.getInt(5)
							));
				}
				return list;
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}		
	}
	
	// 2. 상품의 수량을 1 감소시키는 메서드
	public int reduceRemainQty(int pk) {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "UPDATE eventprizes SET remain_qty = remain_qty - 1"
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
	
	// 3. 해당 상품의 정보를 읽어오는 메서드
	public Prize getPrize(int pk) {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "SELECT * FROM eventprizes WHERE prize_id = ?";
			
			try (PreparedStatement pstmt = conn.prepareStatement(sql)) {
				pstmt.setInt(1, pk);
				
				try (ResultSet rs = pstmt.executeQuery()) {
					rs.next();
					return new Prize(
							rs.getInt(1),
							rs.getString(2),
							rs.getDouble(3),
							rs.getInt(4),
							rs.getInt(5)
						);
				}
			}
			
		} catch (SQLException e) {
			e.printStackTrace();
			return null;
		}
	}
	
	// 4. 남은 모든 상품의 수량을 조회하는 메서드
	public int getAllPrizesRemainQty() {
		try (Connection conn = DBConnector.getConnection()) {
			String sql = "SELECT sum(remain_qty) FROM eventprizes";
			
			try (
				PreparedStatement pstmt = conn.prepareStatement(sql);
				ResultSet rs = pstmt.executeQuery();
			) {
				rs.next();
				return rs.getInt(1);
			}
		} catch (SQLException e) {
			e.printStackTrace();
			return -1;
		}
		
	}
}


