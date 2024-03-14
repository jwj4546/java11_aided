package org.kh.database;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.util.ArrayList;
import java.util.List;

public class OracleExam5 {
	public static void main(String[] args) {
		Connection con = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = "select * from student";
		
		OracleDB  oracle = new OracleDB();
		//Select
		List<Student> stList = new ArrayList<>();
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			rs = pstmt.executeQuery();
			while(rs.next()) {
				Student st = new Student(rs.getInt("no"), rs.getString("name"), rs.getInt("point"));
				stList.add(st);
			}
		} catch (SQLException e) {
			e.printStackTrace();
		} finally {
			oracle.close(rs, pstmt, con);
		}
		for(Student s:stList) {
			System.out.println(s.toString());
		}
		//Insert
		con = null;
		pstmt = null;
		int i = 0;
		Student std = new Student(8, "배곤희", 95);
		sql = "insert into student(name, no, point) values(?,?,?)";						//값 순서가 다를 때에는 생략 불가능
		
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getNo());
			pstmt.setInt(3, std.getPoint());
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i+"건이 정상적으로 처리되었습니다.");
			} else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		} finally {
			oracle.close(pstmt, con);
		}
		//Update
		con = null;
		pstmt = null;
		std = new Student(6, "조빈", 100);
		sql = "update student set name=?, point=? where no=?";
		i = 0;
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setString(1, std.getName());
			pstmt.setInt(2, std.getPoint());
			pstmt.setInt(3, std.getNo());
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i+"건이 처리되었습니다.");
			} else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		} finally {
			oracle.close(pstmt, con);
		}
		
		//Delete
		con = null;
		pstmt = null;
		int bun = 4;
		sql = "delete from student where no=?";
		i = 0;
		
		try {
			con = oracle.connect();
			pstmt = con.prepareStatement(sql);
			pstmt.setInt(1, bun);
			i = pstmt.executeUpdate();
			if(i>0) {
				System.out.println(i+"건 삭제 성공");
			} else {
				System.out.println("SQL 처리 실패");
			}
		} catch (SQLException e) {
			System.out.println("SQL 구문 오류");
			e.printStackTrace();
		} finally {
			oracle.close(pstmt, con);
		}
	}
}
