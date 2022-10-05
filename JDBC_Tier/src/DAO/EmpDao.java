package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import DTO.Emp;
import UTILS.SingletonHelper;

public class EmpDao {
Connection conn = null;
	
	public EmpDao() {
		conn = SingletonHelper.getConnection("oracle");
	}
	
	
	//1. 전체조회 >> select * from dept 
	//>> return multi row
	public List<Emp> getEmpAllList(){
		//Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//POINT
		List<Emp> emplist = new ArrayList<Emp>();

		try {
			//conn = SingletonHelper.getConnection("oracle");
			String sql = "select * from emp";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();
			
			while (rs.next()) {
				Emp emp = new Emp(); // 하나의 row 담기 위한 객체
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				emp.setMgr(rs.getInt("mgr"));
				emp.setHiredate(rs.getDate("hiredate"));
				emp.setSal(rs.getInt("sal"));
				emp.setComm(rs.getInt("comm"));
				emp.setDeptno(rs.getInt("deptno"));
				emplist.add(emp); // 배열에 객체 담는 것
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}

		return emplist;
	}
	
	
	public Emp getEmpListByDeptNo(int empno) {
		
		//Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//POINT
		Emp emp =null;

		try {
			//conn = SingletonHelper.getConnection("oracle");
			String sql = "select empno, ename, job from emp where empno=?";
			pstmt = conn.prepareStatement(sql);
			System.out.println(sql);
			pstmt.setInt(1, empno);
			
			rs = pstmt.executeQuery();

			while (rs.next()) {
				emp = new Emp(); // 하나의 row 담기 위한 객체
				emp.setEmpno(rs.getInt("empno"));
				emp.setEname(rs.getString("ename"));
				emp.setJob(rs.getString("job"));
				System.out.println(emp.toString());
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}

		return emp;
	}
	
	
	public int insertDept(Emp emp) {
		PreparedStatement pstmt = null;
		int rowcount = 0;
		
		try {
			 String sql="insert into emp(empno,ename,job) values(?,?,?)";
			 pstmt = conn.prepareStatement(sql);
			 
			 pstmt.setInt(1, emp.getEmpno());
			 pstmt.setString(2, emp.getEname());
			 pstmt.setString(3, emp.getJob());
			 rowcount = pstmt.executeUpdate(); 
		} catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }finally {
			 SingletonHelper.close(pstmt);
		 }
		 
		 return rowcount;
	}
	
	
	
	public int updateEmp(Emp emp) {
		 //Connection conn = null;
		 PreparedStatement pstmt=null;
		 int rowcount = 0;
		 
		 try {
			 String sql = "insert into emp(empno, ename, job, mgr, hiredate, sal, comm, deptno) values(?,?,?,?,?,?,?,?)";
				pstmt = conn.prepareStatement(sql);

				pstmt.setInt(1, emp.getEmpno());
				pstmt.setString(2, emp.getEname());
				pstmt.setString(3, emp.getJob());
				pstmt.setInt(4, emp.getMgr());
				pstmt.setDate(5, new java.sql.Date(emp.getHiredate().getTime()));
				pstmt.setInt(6, emp.getSal());
				pstmt.setInt(7, emp.getComm());
				pstmt.setInt(8, emp.getDeptno());
				rowcount = pstmt.executeUpdate();
			 
		 }catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }finally {
			 SingletonHelper.close(pstmt);
		 }
		 
		 return rowcount;
	}
	
	
	
	

}
