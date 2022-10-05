package kr.or.kosa;
/*
 ��ü ������Ʈ (ȸ�� : ��ü��ȸ, ������ȸ, ����, ����, ����)
 ������ ������ 5��
 
 1.����̹� �ε�
 2.���ᰴü ����, ���, �ڿ�����
 3.�ݺ����� �ڵ� ... ����....
 
 
 ���ŵǴ� �ڵ� .... ������� .... >> ConnectionHelper �����
 
 
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
				stmt = conn.createStatement(); // Statement �����ϰ� �ִ� ��ü�� �ּ� 
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
				stmt = conn.createStatement(); // Statement �����ϰ� �ִ� ��ü�� �ּ� 
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

