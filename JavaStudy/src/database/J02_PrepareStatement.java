package database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.Scanner;

public class J02_PrepareStatement {

	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);

		System.out.println("검색어 >> ");
		String keyword = sc.next();

		// ※ 굉장히 안좋은 방법 - SQL INjection 공격의 위험이 있음
		// String sql = "SELECT * FROM employees WHERE "
		//		+ "first_name '" + keword + "'";

		// SQL Injection을 방지하기 위해 채워야하는 곳은 ?로 비워놓고 쿼리문을 작성한다
		String sql = "SELECT * FROM employees WHERE " 
			+ "first_name = ?";
		try (
			Connection conn = JdbcConnection.getConnection(); 
			PreparedStatement pstmt = conn.prepareStatement(sql);
		) {
			// 쿼리문을 준비시킨 후 ?를 채워줄 수 있다 (?는 1번부터 시작하므로 주의)
			pstmt.setString(1, keyword);
			
			// AutuoClose를 위한 try문
			try (ResultSet rs = pstmt.executeQuery()) {
				while (rs.next()) {
					System.out.printf("%s %s / %s\n", 
							rs.getString("first_name"), 
							rs.getString("last_name"),
							rs.getDate("hire_date"));
				}
			}
		} catch (SQLException e) {
			e.printStackTrace();
		}
	}

}
