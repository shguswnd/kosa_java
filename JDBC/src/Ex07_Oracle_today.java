/*
 sdept ���̺� ���ؼ�

��ü��ȸ

������ȸ

����

����

����

�� �۾� �Ͻø� �˴ϴ�

PreparedStatement 
 */


import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.Scanner;

import kr.or.kosa.SingletonHelper;





public class Ex07_Oracle_today {
	public static String allSelect() {
		String sql = "select * from sdept";
		return sql;
		
	}
	
	public static String Select() {
		String sql = "select * from sdept where deptno = ?";
		return sql;
	}
	
	public static String insert() {
		String sql = "insert into sdept (DEPTNO, DNAME, LOC) values(?, ?, ?)";
		return sql;
	}
	
	public static String delete() {
		String sql = "delete from sdept where DEPTNO = ?";
		return sql;
	}
	
	public static String update() {
		String sql = "update sdept set DEPTNO = ? where DNAME = ?";
		return sql;
	}
	
	public static void main(String[] args) {
		Scanner scan = new Scanner(System.in);
		// �������̽� ��ü ����
		Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		String sql = null;
		
		//Connection ����
		try {
			conn = SingletonHelper.getConnection("oracle");
			System.out.println("������ ����: 1.��ü��ȸ  2.������ȸ  3.����  4.����  5.����");
			int optNum = Integer.parseInt(scan.nextLine());
					
			
			switch(optNum) {
			case 1: 
				sql = allSelect();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				else {
			    	System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
				}
				break;
				
			case 2:
				sql = Select();
				pstmt = conn.prepareStatement(sql);
				System.out.println("Enter the DEPTNO");
				int optDeptno = scan.nextInt();

				pstmt.setInt(1, optDeptno);
				rs = pstmt.executeQuery();
				if(rs.next()) {
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				else {
			    	System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
				}
				break;
				
			case 3:
				sql = insert();
				pstmt = conn.prepareStatement(sql);
				
				System.out.print("Enter a DEPTNO >> ");
				int newDEPTNO = Integer.parseInt(scan.nextLine());
				pstmt.setInt(1,  newDEPTNO);
				System.out.print("Enter a DNAME >> ");
				String newDNAME = scan.nextLine();
				pstmt.setString(2,  newDNAME);
				System.out.print("Enter a LOC >> ");
				String newLOC = scan.nextLine();
				pstmt.setString(3,  newLOC);
				rs = pstmt.executeQuery();
//				int row = pstmt.executeUpdate(); // ? parameter ���鸸 ����
				
				
				sql = allSelect();
				pstmt = conn.prepareStatement(sql);
				rs = pstmt.executeQuery();

				if(rs.next())
				{
					do {
						System.out.println(rs.getString("DNAME"));
					}while(rs.next());
				}

				
//				if(row>0) {
//						System.out.println(row);
//				}
//				else {
//			    	System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
//				}
				break;
				
			case 4:
				sql = delete();
				pstmt = conn.prepareStatement(sql);
				System.out.print("Enter a DEPTNO >> ");
				int deleteDEPTNO = scan.nextInt();
				pstmt.setInt(1,  deleteDEPTNO);

				int rowCount = pstmt.executeUpdate();
				if(rowCount ==1) {
					System.out.println("�μ����� �Ϸ�");
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				else {
			    	System.out.println("��ȸ�� �����Ͱ� �����ϴ�.");
				}
				break;
				
			case 5:
				sql = update();
				pstmt = conn.prepareStatement(sql);
				System.out.print("Enter modifying LOC >>");
				String modLOC = scan.next();
				pstmt.setString(1, modLOC);
				System.out.print("Enter modifying DNAME >>");
				String modDNAME = scan.next();
				pstmt.setString(2, modDNAME);
				System.out.print("Enter modifying DEPTNO >>");
				String modDEPTNO = scan.next();
				pstmt.setString(3, modDEPTNO);
				
				int row2 = pstmt.executeUpdate(); //? parameter  ���鸸 ����
				rs = pstmt.executeQuery();
				if(row2>0) {
					do {
			    		System.out.println(rs.getInt(1) + "/" + rs.getString(2)+"/"+rs.getString(3));
					}while(rs.next());
				}
				break;			
			}
						
		} catch (Exception e) {
			// TODO: handle exception
		}finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
			//�̱����� close() ���� ���� app�� �����ϴ� ��....
		}
	}
}
