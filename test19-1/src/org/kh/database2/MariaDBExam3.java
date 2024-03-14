package org.kh.database2;

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;

import org.kh.database.Student;

public class MariaDBExam3 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String driver = "org.mariadb.jdbc.Driver";
		String url = "jdbc:mariadb://localhost:3308/temp";
		String userid = "root";
		String userpw = "1234";
		Student newSt = new Student(3, "park", 88);
		String sql = "update student set name=?, point=? where no=?";
		int i = 0;
		
		try {
			Class.forName(driver);
			try {
				con = DriverManager.getConnection(url, userid, userpw);
				pstmt = con.prepareStatement(sql);
				pstmt.setString(1, newSt.getName());
				pstmt.setInt(2, newSt.getPoint());
				pstmt.setInt(3, newSt.getNo());
				i = pstmt.executeUpdate();
				if(i>0) {
					System.out.println(i+"건이 처리 되었습니다.");
				} else {
					System.out.println("SQL 처리 실패");
				}
			} catch (SQLException e) {
				System.out.println("SQL 구문 오류");
				e.printStackTrace();
			}
		} catch (ClassNotFoundException e) {
			e.printStackTrace();
		} finally {
			if(pstmt!=null) {
				try {
					pstmt.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
			if(con!=null) {
				try {
					con.close();
				} catch (SQLException e) {
					e.printStackTrace();
				}
			}
		}
	}
}
