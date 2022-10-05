import java.sql.Connection;
import java.sql.PreparedStatement;

import kr.or.kosa.SingletonHelper;

public class Ex06_Oracle_Prepare_DML {

	public static void main(String[] args) {
		//INSERT
		//insert into dmlemp(empno, ename, deptno) values(?,?,?);
		
		//UPDATE
		//update dmlemp set ename =?, sal=?, job=?, deptno=?
		//where empno=?
		Connection conn = null;
		PreparedStatement pstmt = null;
		
		try {
			conn = SingletonHelper.getConnection("oracle");
			String sql = "update dmlemp set ename =?, sal=?, job=?, deptno=? where empno=?";			
			pstmt = conn.prepareStatement(sql);
			
			//parameter �غ�
			pstmt.setString(1, "������");
			pstmt.setInt(2, 1000);
			pstmt.setString(3, "IT");
			pstmt.setInt(4, 30);
			pstmt.setInt(5, 7900);
			
			
			//����
			int row = pstmt.executeUpdate(); //�̋� ?�� parameter ���鸸 ����
			if(row > 0) {
				System.out.println("update row count : " + row);
			}
						
		} catch (Exception e) {
			System.out.println(e.getMessage());
		}finally {
			SingletonHelper.close(pstmt);
		}

		
		
		
		

	}

}
