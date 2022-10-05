package kr.or.kosa;
/*
 전체 프로젝트 (회원 : 전체조회, 조건조회, 삭제, 수정, 변경)
 각각의 페이지 5개
 
 1.드라이버 로딩
 2.연결객체 생성, 명령, 자원해제
 3.반복적인 코드 ... 제거....
 
 
 제거되는 코드 .... 공통사항 .... >> ConnectionHelper 만들기
 
 
 */

import java.sql.Connection;
import java.sql.DriverManager;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.sql.SQLException;
import java.sql.Statement;

public class ConnectionHelper {
    
	public static Connection getConnection(String dsn) {
		Connection conn = null;
		Statement stmt = null;
		try {
			if (dsn.equals("oracle")) {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", "KOSA", "1004");
				stmt = conn.createStatement(); // Statement 구현하고 있는 객체의 주소 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public static Connection getConnection(String dsn, String id, String pwd) {
		Connection conn = null;
		Statement stmt = null;
		try {
			if (dsn.equals("oracle")) {
				conn = DriverManager.getConnection("jdbc:oracle:thin:@localhost:1521:xe", id, pwd);
				stmt = conn.createStatement(); // Statement 구현하고 있는 객체의 주소 
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}
		return conn;
	}
	
	public static void close(Connection conn) {
		if(conn != null) {
			try {
				conn.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	public static void close(ResultSet rs) {
		if(rs != null) {
			try {
				rs.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
	
	public static void close(Statement stmt) {
		if(stmt != null) {
			try {
				stmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}	
	
	public static void close(PreparedStatement pstmt) {
		if(pstmt != null) {
			try {
				pstmt.close();
			} catch (Exception e) {
				System.out.println(e.getMessage());
			}
		}
	}
 }

