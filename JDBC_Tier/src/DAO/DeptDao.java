package DAO;

import java.sql.Connection;
import java.sql.PreparedStatement;
import java.sql.ResultSet;
import java.util.ArrayList;
import java.util.List;

import DTO.Dept;
import UTILS.SingletonHelper;

//DAO Ŭ���� �����ϱ�
//1. DB����
//2. CRUD ����
//3. �⺻������ �Լ� 5�� (�ϳ��� ���̺� ���ؼ�)
//3.1 ��ü��ȸ , ������ȸ , ���� , ���� , ���� ��� 

public class DeptDao {
	Connection conn = null;
	
	public DeptDao() {
		conn = SingletonHelper.getConnection("oracle");
	}
	
	
	//1. ��ü��ȸ >> select * from dept 
	//>> return multi row
	public List<Dept> getDeptAllList(){
		//Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//POINT
		List<Dept> deptlist = new ArrayList<Dept>();

		try {
			//conn = SingletonHelper.getConnection("oracle");
			String sql = "select deptno, dname, loc from dept";
			pstmt = conn.prepareStatement(sql);
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Dept dept = new Dept(); // �ϳ��� row ��� ���� ��ü
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				deptlist.add(dept); // �迭�� ��ü ��� ��
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}

		return deptlist;
	}

	
	//2. ������ȸ (deptno pk) >> select * from dept where deptno=? 
	//>> return singlerow 
	public Dept getDeptListByDeptNo(int deptno) {
		
		//Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//POINT
		Dept dept =null;

		try {
			//conn = SingletonHelper.getConnection("oracle");
			String sql = "select deptno, dname, loc from dept where deptno=?";
			pstmt = conn.prepareStatement(sql);
			
			pstmt.setInt(1, deptno);
			
			rs = pstmt.executeQuery();

			while (rs.next()) {
				dept = new Dept(); // �ϳ��� row ��� ���� ��ü
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}

		return dept;
	}
	
	//3. ������ ���� >> insert into dept(deptno,dname,loc) values(?,?,?)
    //public int insertDept(int deptno , String dname, String loc) {}
	public int insertDept(Dept dept) {
		 //Connection conn = null;
		 PreparedStatement pstmt=null;
		 int rowcount = 0;
		 
		 try {
			 //conn = SingletonHelper.getConnection("oracle");
			 String sql="insert into dept(deptno,dname,loc) values(?,?,?)";
			 pstmt = conn.prepareStatement(sql);
			 
			 pstmt.setInt(1, dept.getDeptno());
			 pstmt.setString(2, dept.getDname());
			 pstmt.setString(3, dept.getLoc());
			 rowcount = pstmt.executeUpdate(); 
			 
		 }catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }finally {
			 SingletonHelper.close(pstmt);
		 }
		 
		 return rowcount;
	}
	
	//4. ������ ���� >> update dept set dname=? , loc=? where depno=?
	public int updateDept(Dept dept) {
		 //Connection conn = null;
		 PreparedStatement pstmt=null;
		 int rowcount = 0;
		 
		 try {
			 //conn = SingletonHelper.getConnection("oracle");
			 String sql="update dept set dname=? , loc=? where deptno=?";
			 pstmt = conn.prepareStatement(sql);
			 
			 pstmt.setString(1, dept.getDname());
			 pstmt.setString(2, dept.getLoc());
			 pstmt.setInt(3, dept.getDeptno());
			 
			 rowcount = pstmt.executeUpdate(); 
			 
		 }catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }finally {
			 SingletonHelper.close(pstmt);
		 }
		 
		 return rowcount;
	}
	
	//5. ������ ���� >>delete from dept where deptno=?
	public int deleteDept(int deptno) {
		 //Connection conn = null;
		 PreparedStatement pstmt=null;
		 int rowcount = 0;
		 
		 try {
			// conn = SingletonHelper.getConnection("oracle");
			 String sql="delete from dept where deptno=?";
			 pstmt = conn.prepareStatement(sql);
			 pstmt.setInt(1, deptno);
			 rowcount = pstmt.executeUpdate();
		 }catch (Exception e) {
			 e.printStackTrace();
			 System.out.println(e.getMessage());
		 }finally {
			 SingletonHelper.close(pstmt);
		 }
		 
		 return rowcount;
	}

	//�ʿ信 ����
	//�˻�  Like ..
	//�������� ������ȸ ....
	
	//6.
	//���� >> �μ��̸��� LIKE �˻��ؼ� �ش��ϴ� �μ���ȣ , �μ��̸� , �μ���ġ �� ��ȯ�ϴ� 
	//�Լ��� ���弼��
	//query >> select deptno , dname , loc from dept where dname like '%SEOUL%'
	//�����ϰ� ǥ���ϸ� >>  where dname like '%" + dname +"'%"
	public List<Dept> getDeptAllListByDname(String dname){
		//Connection conn = null;
		PreparedStatement pstmt = null;
		ResultSet rs = null;
		//POINT
		List<Dept> deptlist = new ArrayList<Dept>();

		try {
			//conn = SingletonHelper.getConnection("oracle");
			String sql = "select deptno, dname, loc from dept where like ?";
			pstmt = conn.prepareStatement(sql);
			pstmt.setString(1, "%" + dname + "%"); //like '%SEOUL%'
			rs = pstmt.executeQuery();

			while (rs.next()) {
				Dept dept = new Dept(); // �ϳ��� row ��� ���� ��ü
				dept.setDeptno(rs.getInt("deptno"));
				dept.setDname(rs.getString("dname"));
				dept.setLoc(rs.getString("loc"));
				deptlist.add(dept); // �迭�� ��ü ��� ��
			}
		} catch (Exception e) {
			System.out.println(e.getMessage());
		} finally {
			SingletonHelper.close(rs);
			SingletonHelper.close(pstmt);
		}

		return deptlist;
	}

}





